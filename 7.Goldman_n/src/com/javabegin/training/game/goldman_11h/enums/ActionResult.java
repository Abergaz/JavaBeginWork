package com.javabegin.training.game.goldman_11h.enums;

/**
 * типы действий, которые могут произойти после движения игрока по карте
 */
public enum ActionResult {

    NO_ACTION,// ничего не происходит
    DIE,// игрок умирает
    WIN,// игрок выиграл
    MOVE,// движение игрока
    COLLECT_TREASURE// собрал золото
}
