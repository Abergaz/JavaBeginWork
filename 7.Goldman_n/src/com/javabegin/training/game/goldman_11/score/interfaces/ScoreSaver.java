package com.javabegin.training.game.goldman_11.score.interfaces;


import com.javabegin.training.game.goldman_11.objects.UserScore;

import java.util.ArrayList;

public interface ScoreSaver{
    
    boolean saveScore(UserScore userScore);

    ArrayList<UserScore> getScoreList();

}
