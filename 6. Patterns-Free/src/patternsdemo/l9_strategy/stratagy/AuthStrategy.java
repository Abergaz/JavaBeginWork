package patternsdemo.l9_strategy.stratagy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
