package com.javabegin.training.game.goldman_13h.score.interfaces;


import com.javabegin.training.game.goldman_13h.objects.UserScore;

import java.util.ArrayList;

public interface ScoreSaver{
    
    boolean saveScore(UserScore userScore);

    ArrayList<UserScore> getScoreList();

}
