package design_patterns.observer.converter;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
