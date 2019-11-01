package com.javabegin.training.game.goldman_14h.gamemap.facades;

import java.awt.Component;

import com.javabegin.training.game.goldman_14h.enums.GameObjectType;
import com.javabegin.training.game.goldman_14h.enums.LocationType;
import com.javabegin.training.game.goldman_14h.enums.MovingDirection;
import com.javabegin.training.game.goldman_14h.gamemap.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_14h.gamemap.adapters.HybridMapLoader;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_14h.gameobjects.impl.GoldMan;
import com.javabegin.training.game.goldman_14h.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_14h.objects.MapInfo;
import com.javabegin.training.game.goldman_14h.objects.SavedMapInfo;
import com.javabegin.training.game.goldman_14h.objects.UserScore;
import com.javabegin.training.game.goldman_14h.score.interfaces.ScoreSaver;
import com.javabegin.training.game.goldman_14h.sound.impl.WavPlayer;
import com.javabegin.training.game.goldman_14h.sound.interfaces.SoundPlayer;


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

    public GameFacade() {
    }

    public void setSoundPlayer(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    public void setMapLoader(HybridMapLoader mapLoader) {
        this.mapLoader = mapLoader;

        // слушатели для звуков должны идти в первую очередь, т.к. они запускаются в отдельном потоке и не мешают выполняться следующим слушателям
        if (soundPlayer instanceof MoveResultListener) {
            mapLoader.getGameMap().getGameCollection().addMoveListener((MoveResultListener) soundPlayer);
        }

        updateMap();
    }

    public ScoreSaver getScoreSaver() {
        return scoreSaver;
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
        gameMap = mapLoader.getGameMap();
        mapInfo = gameMap.getMapInfo();


        gameMap.updateMap();
    }
    
      public void updateObjects(AbstractGameObject obj1, AbstractGameObject obj2) {
        gameMap.updateMapObjects(obj1, obj2);
    }
}
