package com.javabegin.training.game.goldman_11h.gameobjects.impl;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;
import com.javabegin.training.game.goldman_11h.enums.GameObjectType;
import com.javabegin.training.game.goldman_11h.enums.MovingDirection;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractSoundObject;
import com.javabegin.training.game.goldman_11h.sound.impl.WavPlayer;

import javax.sound.sampled.Clip;

/**
 * класс отвечает за работу объекта GOLDMAN - главный персонаж игры
 */
public class GoldMan extends AbstractSoundObject {

    private int totalScore = 0;// кол-во очков, собранных игроком
    private int turnsNumber = 0;// кол-во сделанных ходов
    private transient Clip moveClip;
    private transient Clip treasureClip;
    private transient Clip winClip;

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/goldman_up.png"));


    }

    public void addSTotalcore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/goldman_down.png"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/goldman_left.png"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/goldman_right.png"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/goldman_up.png"));
                break;
        }
    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        turnsNumber++;

        switch (gameObject.getType()) {

            case TREASURE: {
                totalScore += ((Treasure) gameObject).getScore();
                return ActionResult.COLLECT_TREASURE;
            }

            case MONSTER: {
                return ActionResult.DIE;
            }

            case EXIT: {
                totalScore *= 2;
                return ActionResult.WIN;
            }

        }

        return super.doAction(gameObject);
    }

    @Override
    public Clip getSoundClip(ActionResult actionResult) {

        if (moveClip ==null) {
            moveClip = openClip(WavPlayer.SOUND_MOVE);
        }
        
        if (treasureClip ==null) {
             treasureClip = openClip(WavPlayer.SOUND_TREASURE);
        }
        
        if (winClip ==null) {
            winClip = openClip(WavPlayer.SOUND_WIN);
        }

        switch (actionResult) {
            case MOVE: {
                return moveClip;
            }
            case COLLECT_TREASURE: {
                return treasureClip;
            }
            case DIE: {
                return super.getDieClip();
            }
            case WIN: {
                return winClip;
            }
        }

        return null;
    }
}
