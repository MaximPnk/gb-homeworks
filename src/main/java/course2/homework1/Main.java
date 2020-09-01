package course2.homework1;

public class Main {
    public static void main(String[] args) {
        //task 1
        Cat cat = new Cat("Барсик");
        Human human = new Human("Иван");
        Robot robot = new Robot("Амиго");

        //task 2
        Wall wall = new Wall(3);
        RunningTrack runningTrack = new RunningTrack(100);
        cat.run(runningTrack);
        cat.jump(wall);
        human.run(runningTrack);
        human.jump(wall);
        robot.run(runningTrack);
        robot.jump(wall);

        //task 3-4 - с двумя интерфейсами
        System.out.println();
        overcomingTracksAndWalls();

        //task3-4 - с одним интерфейсом
        System.out.println();
        overcomingTheObstacles();

    }

    public static void overcomingTracksAndWalls () {
        Object[] participants = new Object[15];
        Object[] obstacles = new Object[10];
        for (int i = 0; i < participants.length; i++) {
            if (i < 5) {
                participants[i] = new Cat("Кот №" + (i + 1));
            } else if (i < 10) {
                participants[i] = new Human("Человек №" + (i - 4));
            } else {
                participants[i] = new Robot("Робот №" + (i - 9));
            }
        }
        for (int i = 0; i < obstacles.length; i++) {
            if (i % 2 == 0) {
                obstacles[i] = new Wall(i/2);
            } else {
                obstacles[i] = new RunningTrack(i*100);
            }
        }
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    if (participants[i] instanceof Human) {
                        if (((Human) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Human) participants[i]).jump((Wall) obstacles[j]);
                        }
                    } else if (participants[i] instanceof Cat) {
                        if (((Cat) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Cat) participants[i]).jump((Wall) obstacles[j]);
                        }
                    } else {
                        if (((Robot) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Robot) participants[i]).jump((Wall) obstacles[j]);
                        }
                    }
                } else {
                    if (participants[i] instanceof Human) {
                        if (((Human) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Human) participants[i]).run((RunningTrack) obstacles[j]);
                        }
                    } else if (participants[i] instanceof Cat) {
                        if (((Cat) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Cat) participants[i]).run((RunningTrack) obstacles[j]);
                        }
                    } else {
                        if (((Robot) participants[i]).isWeak) {
                            break;
                        } else {
                            ((Robot) participants[i]).run((RunningTrack) obstacles[j]);
                        }
                    }
                }
            }
        }
    }

    public static void overcomingTheObstacles() {
        Movable[] participants = new Movable[15];
        Object[] obstacles = new Object[10];

        for (int i = 0; i < participants.length; i++) {
            if (i < 5) {
                participants[i] = new Cat("Кот №" + (i + 1));
            } else if (i < 10) {
                participants[i] = new Human("Человек №" + (i - 4));
            } else {
                participants[i] = new Robot("Робот №" + (i - 9));
            }
        }
        for (int i = 0; i < obstacles.length; i++) {
            if (i % 2 == 0) {
                obstacles[i] = new Wall(i/2);
            } else {
                obstacles[i] = new RunningTrack(i*100);
            }
        }

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (participants[i].isWeak()) {
                    break;
                }
                if (obstacles[j] instanceof RunningTrack) {
                    participants[i].run((RunningTrack) obstacles[j]);
                } else {
                    participants[i].jump((Wall) obstacles[j]);
                }
            }
        }
    }
}
