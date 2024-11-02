package AST;
import java.util.HashMap;
import java.util.Map;

public class Environment {
    private final Map<String, Type> env = new HashMap<>();
    private Type.Label pc = Type.Label.LOW; 

    public void declare(String varName, Type type) {
        env.put(varName, type);
    }

    public Type lookup(String varName){
        if (!env.containsKey(varName)) {
            return null;
        }
        return env.get(varName);
    }

    public boolean isDeclared(String varName) {
        return env.containsKey(varName);
    }

    public Type.Label getPC() {
        return pc;
    }

    public void setPC(Type.Label pc) {
        this.pc = pc;
    }
}

