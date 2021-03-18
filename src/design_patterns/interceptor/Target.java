package design_patterns.interceptor;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
