package Course2.homework1v2;

import Course2.homework1v2.models.Human;
import Course2.homework1v2.models.Wall;
import Course2.homework1v2.services.CompetitorsServiceImpl;

public class Main {
    

    public static void main(String[] args) {
        CompetitorsServiceImpl competitorsService = new CompetitorsServiceImpl();

        Human[] humans = new Human[5];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human("Человек №" + (i+1));
        }

        Wall[] walls = new Wall[5];
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall(i);
        }

        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < walls.length; j++) {
                if (!humans[i].isWeak()) {
                    competitorsService.jump(humans[i], walls[j]);
                }
                if (j == walls.length - 1 && !humans[i].isWeak()) {
                    System.out.println("Successfully finished");
                }
            }
        }
    }
}
