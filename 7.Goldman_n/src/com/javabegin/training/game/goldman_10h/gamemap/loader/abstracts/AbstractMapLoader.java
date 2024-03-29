package com.javabegin.training.game.goldman_10h.gamemap.loader.abstracts;


import com.javabegin.training.game.goldman_10h.creators.GameObjectCreator;
import com.javabegin.training.game.goldman_10h.database.SQLiteConnection;
import com.javabegin.training.game.goldman_10h.enums.GameObjectType;
import com.javabegin.training.game.goldman_10h.gamemap.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_10h.gamemap.loader.interfaces.MapLoader;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10h.gameobjects.impl.Coordinate;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractMapLoader implements MapLoader {

    protected AbstractGameMap gameMap;

    protected AbstractMapLoader(AbstractGameMap gameMap) {
        this.gameMap = gameMap;
    }

    protected void createGameObject(String str, Coordinate coordinate) {
        
        String strUp = str.toUpperCase();
            
        GameObjectType type = GameObjectType.valueOf(strUp);


        AbstractGameObject newObj = GameObjectCreator.getInstance().createObject(type, coordinate);

        gameMap.getGameCollection().addGameObject(newObj);

        if (newObj.getType() == GameObjectType.EXIT) {
            gameMap.getMapInfo().setExitExist(true);
        } else if (newObj.getType() == GameObjectType.GOLDMAN) {
            gameMap.getMapInfo().setGoldManExist(true);
        }

    }

    public AbstractGameMap getGameMap() {
        return gameMap;
    }

    public int getPlayerId(String username) {

        PreparedStatement selectStmt = null;
        PreparedStatement insertStmt = null;
        ResultSet rs = null;

        try {

            // если есть уже такой пользователь - получить его id
            selectStmt = SQLiteConnection.getInstance().getConnection().prepareStatement("select id from player where username = ?");
            selectStmt.setString(1, username);

            rs = selectStmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            selectStmt.close();


            // если нет такого пользователя - создать его и вернуть id
            insertStmt = SQLiteConnection.getInstance().getConnection().prepareStatement("insert into player(username) values(?)");
            insertStmt.setString(1, username);
            insertStmt.executeUpdate();

            // получить id созданного пользователя
            selectStmt = SQLiteConnection.getInstance().getConnection().prepareStatement("select last_insert_rowid()");
            return selectStmt.executeQuery().getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(AbstractMapLoader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (selectStmt != null) {
                    selectStmt.close();
                }
                if (insertStmt != null) {
                    insertStmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AbstractMapLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return 0;
        
    }
}
