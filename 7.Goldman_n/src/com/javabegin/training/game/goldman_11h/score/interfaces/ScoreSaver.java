package com.javabegin.training.game.goldman_11h.score.interfaces;


import com.javabegin.training.game.goldman_11h.objects.UserScore;

import java.util.ArrayList;

public interface ScoreSaver{
    
    boolean saveScore(UserScore userScore);

    ArrayList<UserScore> getScoreList();

}
