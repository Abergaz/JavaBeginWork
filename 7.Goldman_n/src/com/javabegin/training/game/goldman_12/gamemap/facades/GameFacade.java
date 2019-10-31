package com.javabegin.training.game.goldman_12.gamemap.facades;


import com.javabegin.training.game.goldman_12.enums.GameObjectType;
import com.javabegin.training.game.goldman_12.enums.LocationType;
import com.javabegin.training.game.goldman_12.enums.MovingDirection;
import com.javabegin.training.game.goldman_12.gamemap.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_12.gamemap.adapters.HybridMapLoader;
import com.javabegin.training.game.goldman_12.gameobjects.impl.GoldMan;
import com.javabegin.training.game.goldman_12.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_12.objects.MapInfo;
import com.javabegin.training.game.goldman_12.objects.SavedMapInfo;
import com.javabegin.training.game.goldman_12.objects.UserScore;
import com.javabegin.training.game.goldman_12.score.interfaces.ScoreSaver;
import com.javabegin.training.game.goldman_12.sound.impl.WavPlayer;
import com.javabegin.training.game.goldman_12.sound.interfaces.SoundPlayer;

import java.awt.*;

public class GameFacade {

    private HybridMapLoader mapLoader;
    private SoundPlayer soundPlayer;
    private ScoreSaver scoreSaver;
    private MapInfo mapInfo;
    private AbstractGameMap gameMap;

    public GameFacade(HybridMapLoader mapLoader, SoundPlayer soundPlayer, ScoreSaver scoreSaver) {
        this.mapLoader = mapLoader;
        this.scoreSaver = scoreSaver;
        this.soundPlayer = soundPlayer;
    }


    private void init() {
        gameMap = mapLoader.getGameMap();
        mapInfo = gameMap.getMapInfo();

        // слушатели для звуков должны идти в первую очередь, т.к. они запускаются в отдельном потоке и не мешают выполняться следующим слушателям
        if (soundPlayer instanceof MoveResultListener) {
            mapLoader.getGameMap().getGameCollection().addMoveListener((MoveResultListener) soundPlayer);
        }


    }

    public GameFacade() {
    }

    public void setSoundPlayer(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

 
    public void setMapLoader(HybridMapLoader mapLoader) {
        this.mapLoader = mapLoader;
    }

    public void setScoreSaver(ScoreSaver scoreSaver) {
        this.scoreSaver = scoreSaver;
    }

    public void stopGame() {
        soundPlayer.stopBackgoundMusic();
        mapLoader.getGameMap().stop();
    }

    public void moveObject(MovingDirection movingDirection, GameObjectType gameObjectType) {
        gameMap.getGameCollection().moveObject(movingDirection, gameObjectType);
    }

    public Component getMap() {
        init();
        gameMap.drawMap();
        return mapLoader.getGameMap().getMapComponent();
    }

    public void saveScore() {
        UserScore userScore = new UserScore();
        userScore.setUser(mapInfo.getUser());
        userScore.setScore(getGoldMan().getTotalScore());
        scoreSaver.saveScore(userScore);
    }

    public void addMoveListener(MoveResultListener listener) {
        mapLoader.getGameMap().getGameCollection().addMoveListener(listener);
    }

    public void saveMap() {
        SavedMapInfo saveMapInfo = new SavedMapInfo();
        saveMapInfo.setId(mapInfo.getId());
        saveMapInfo.setUser(mapInfo.getUser());
        saveMapInfo.setTotalScore(getGoldMan().getTotalScore());
        saveMapInfo.setTurnsCount(getGoldMan().getTurnsNumber());
        mapLoader.saveMap(saveMapInfo, LocationType.DB);
    }

    public void startGame() {
        soundPlayer.startBackgroundMusic(WavPlayer.SOUND_BACKGROUND);
        mapLoader.getGameMap().start();
    }

    private GoldMan getGoldMan() {
        return (GoldMan) mapLoader.getGameMap().getGameCollection().getGameObjects(GameObjectType.GOLDMAN).get(0);
    }

    public int getTurnsLeftCount() {
        return mapInfo.getTurnsLimit() - getGoldMan().getTurnsNumber();
    }

    public int getTotalScore() {
        return getGoldMan().getTotalScore();
    }

    public void updateMap() {
        gameMap.drawMap();
    }
}