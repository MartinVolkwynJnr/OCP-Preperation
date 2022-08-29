package Chapter8;

interface CanBurrow {
    Float getSpeed(int age);
    int MINIMUM_DEPTH = 2;
}
interface Climb {
    int MINIMUM_HEIGHT = 2;
}
public class FieldMouse implements Climb, CanBurrow {
    public Float getSpeed(int age){
        return 11f;
    }
}




public interface Soar {
    int MAX_HEIGHT = 10;
    final static boolean UNDERATER = true;
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

public abstract interface Soar {
    public static int MAX_HEIGHT = 10;
    public final static boolean UNDERATER = true;
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}