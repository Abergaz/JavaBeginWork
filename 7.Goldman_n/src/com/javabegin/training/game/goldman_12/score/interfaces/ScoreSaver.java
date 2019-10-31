package com.javabegin.training.game.goldman_12.score.interfaces;


import com.javabegin.training.game.goldman_12.objects.UserScore;

import java.util.ArrayList;

public interface ScoreSaver{
    
    boolean saveScore(UserScore userScore);

    ArrayList<UserScore> getScoreList();

}
