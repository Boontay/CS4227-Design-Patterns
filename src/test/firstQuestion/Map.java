package test.firstQuestion;

import java.util.HashMap;
import java.util.Map;

interface Handler {
    void execute();
}

class StartHandler implements Handler {
    private String action;

    public StartHandler(String action) {
        this.action = action;
    }

    public void execute() {
        System.out.println(action);
    }
}

class MapHandlerExample {
    private Map<Handler, String> handlerList = new HashMap<>();

    public void addHandler(Handler handler, String name) {
        handlerList.put(handler, name);
    }

    public void findHandler(String handlerName){
        for (Map.Entry<Handler, String> entry : handlerList.entrySet()) {
            if (entry.getValue().equals(handlerName)) {
                entry.getKey().execute();
            }
        }
    }
}
