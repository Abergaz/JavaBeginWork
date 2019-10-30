package com.javabegin.training.game.goldman_10.objects.gui.maps;


import com.javabegin.training.game.goldman_10.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_10.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_10.enums.ActionResult;
import com.javabegin.training.game.goldman_10.enums.GameObjectType;
import com.javabegin.training.game.goldman_10.enums.LocationType;
import com.javabegin.training.game.goldman_10.interfaces.gamemap.TimeMap;
import com.javabegin.training.game.goldman_10.interfaces.gamemap.collections.GameCollection;
import com.javabegin.training.game.goldman_10.movestrategies.AgressiveMoving;
import com.javabegin.training.game.goldman_10.objects.Coordinate;
import com.javabegin.training.game.goldman_10.objects.Nothing;
import com.javabegin.training.game.goldman_10.objects.Wall;
import com.javabegin.training.game.goldman_10.objects.creators.MapCreator;
import com.javabegin.training.game.goldman_10.objects.listeners.MoveResultListener;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTableGameMap implements TimeMap {

    private JTable jTableMap = new JTable();
    private AbstractGameMap gameMap;
    private String[] columnNames;
    // объекты для отображения на карте будут храниться в двумерном массиве типа AbstractGameObject
    // каждый элемент массива будет обозначаться согласно текстовому представлению объекта как описано в GameObjectType
    private AbstractGameObject[][] mapObjects;

    public JTableGameMap(LocationType type, Object source, GameCollection gameCollection) {
        jTableMap.setEnabled(false);
        jTableMap.setSize(new java.awt.Dimension(300, 300));
        jTableMap.setRowHeight(26);
        jTableMap.setRowSelectionAllowed(false);
        jTableMap.setShowHorizontalLines(false);
        jTableMap.setShowVerticalLines(false);
        jTableMap.setTableHeader(null);
        jTableMap.setUpdateSelectionOnSort(false);
        jTableMap.setVerifyInputWhenFocusTarget(false);


        gameMap = MapCreator.getInstance().createMap(type, gameCollection);
        gameMap.loadMap(source);

        timeMover = new TimeMover();
        
    
    }

    private void fillEmptyMap(int width, int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                mapObjects[y][x] = new Nothing(new Coordinate(x, y));
            }
        }
    }

    private void updateObjectsArray() {

        mapObjects = new AbstractGameObject[gameMap.getHeight()][gameMap.getWidth()];

        fillEmptyMap(gameMap.getWidth(), gameMap.getHeight());

        // потом заполнить массив объектами		
        for (AbstractGameObject gameObj : gameMap.getGameCollection().getAllGameObjects()) {
            if (!gameObj.getType().equals(GameObjectType.NOTHING)) {// пустоты не добавляем, т.к. они уже добавились когда мы вызвали метод fillEmptyMap()
                int y = gameObj.getCoordinate().getY();
                int x = gameObj.getCoordinate().getX();
                if (!(mapObjects[y][x] instanceof Nothing) & // если в этих координатах уже есть какой то объект, отличный от пустоты и стены
                        !(mapObjects[y][x] instanceof Wall)) {
                    AbstractGameObject tmpObj = mapObjects[y][x];
                    mapObjects[y][x] = gameMap.getPriorityObject(tmpObj, gameObj);
                } else {
                    mapObjects[y][x] = gameObj;// проставить объект на карте согласно его координатам
                }
            }
        }
    }

    @Override
    public boolean drawMap() {

        updateObjectsArray();

        try {
            // присваиваем пустоту всем заголовкам столбцов, чтобы у таблицы не было заголовоков, а то некрасиво смотрится
            columnNames = new String[gameMap.getWidth()];

            for (int i = 0; i < columnNames.length; i++) {
                columnNames[i] = "";
            }


            // игровое поле будет отображаться в super без заголовков столбцов
            jTableMap.setModel(new DefaultTableModel(mapObjects, columnNames));


            // вместо текста в ячейках таблицы устанавливаем отображение картинки
            for (int i = 0; i < jTableMap.getColumnCount(); i++) {
                jTableMap.getColumnModel().getColumn(i).setCellRenderer(new ImageRenderer());
                TableColumn a = jTableMap.getColumnModel().getColumn(i);
                a.setPreferredWidth(26);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


        return true;
    }

    @Override
    public Component getMapComponent() {
        return jTableMap;
    }

    @Override
    public AbstractGameMap getGameMap() {
        return gameMap;
    }
    private TimeMover timeMover;

    @Override
    public void start() {
        timeMover.start();
    }

    @Override
    public void stop() {
        timeMover.stop();
    }

    private class TimeMover implements ActionListener, MoveResultListener {

        private Timer timer;
        private final static int MOVING_PAUSE = 500;
        private final static int INIT_PAUSE = 1000;

        private TimeMover() {
            timer = new Timer(MOVING_PAUSE, this);
            timer.setInitialDelay(INIT_PAUSE);
            timer.start();
            gameMap.getGameCollection().addMoveListener(this);
        }

        public void start() {
            timer.start();
        }

        public void stop() {
            timer.stop();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            gameMap.getGameCollection().moveObject(new AgressiveMoving(), GameObjectType.MONSTER);
        }

        @Override
        public void notifyActionResult(ActionResult actionResult, AbstractMovingObject movingObject) {
            switch (actionResult) {
                case DIE:
                case WIN: {
                    timer.stop();
                    break;
                }
            }
        }
    }
}
