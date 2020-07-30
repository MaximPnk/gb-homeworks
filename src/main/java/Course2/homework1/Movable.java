package Course2.homework1;

public interface Movable {

    void run(RunningTrack runningTrack);

    void jump(Wall wall);

    boolean isWeak();
}
