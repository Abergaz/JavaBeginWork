package patternsdemo.l9_strategy.start;


import patternsdemo.l9_strategy.auth.UserChecker;
import patternsdemo.l9_strategy.stratagy.DBAuth;
import patternsdemo.l9_strategy.stratagy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
