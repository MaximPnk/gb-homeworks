package course2.homework1v2.interfaces;

import course2.homework1v2.models.*;

public interface CompetitorsService {

    void jump(Human human, Wall wall);

    void run(Human human, Track track);

    void jump(Robot robot, Wall wall);

    void run(Robot robot, Track track);

    void jump(Cat cat, Wall wall);

    void run(Cat cat, Track track);
}
