package course2.homework1v2.services;

import course2.homework1v2.interfaces.CompetitorsService;
import course2.homework1v2.models.*;

public class CompetitorsServiceImpl implements CompetitorsService {

    @Override
    public void jump(Human human, Wall wall) {
        if (human.getMaxJump() < wall.getHeight()) {
            System.out.printf("%s can't jump. His max is %d, but wall's height is %d\n", human.getName(), human.getMaxJump(), wall.getHeight());
            human.setWeak(true);
        } else {
            System.out.printf("%s jump. His max is %d, wall's height is %d\n", human.getName(), human.getMaxJump(), wall.getHeight());
        }
    }

    @Override
    public void run(Human human, Track track) {
        if (human.getMaxJump() < track.getLength()) {
            System.out.printf("%s can't run. His max is %d, but track's length is %d\n", human.getName(), human.getMaxRun(), track.getLength());
        } else {
            System.out.printf("%s run. HHis max is %d, track's length is %d\n", human.getName(), human.getMaxRun(), track.getLength());
        }
    }

    @Override
    public void jump(Robot robot, Wall wall) {
        if (robot.getMaxJump() < wall.getHeight()) {
            System.out.printf("%s can't run. His max is %d, but wall's height is %d\n", robot.getName(), robot.getMaxJump(), wall.getHeight());
        } else {
            System.out.printf("%s run. His max is %d, wall's height is %d\n", robot.getName(), robot.getMaxJump(), wall.getHeight());
        }
    }

    @Override
    public void run(Robot robot, Track track) {
        if (robot.getMaxJump() < track.getLength()) {
            System.out.printf("%s can't run. His max is %d, but track's length is %d\n", robot.getName(), robot.getMaxRun(), track.getLength());
        } else {
            System.out.printf("%s run. HHis max is %d, track's length is %d\n", robot.getName(), robot.getMaxRun(), track.getLength());
        }
    }

    @Override
    public void jump(Cat cat, Wall wall) {
        if (cat.getMaxJump() < wall.getHeight()) {
            System.out.printf("%s can't run. His max is %d, but wall's height is %d\n", cat.getName(), cat.getMaxJump(), wall.getHeight());
        } else {
            System.out.printf("%s run. His max is %d, wall's height is %d\n", cat.getName(), cat.getMaxJump(), wall.getHeight());
        }
    }

    @Override
    public void run(Cat cat, Track track) {
        if (cat.getMaxJump() < track.getLength()) {
            System.out.printf("%s can't run. His max is %d, but track's length is %d\n", cat.getName(), cat.getMaxRun(), track.getLength());
        } else {
            System.out.printf("%s run. HHis max is %d, track's length is %d\n", cat.getName(), cat.getMaxRun(), track.getLength());
        }
    }
}
