package course2.homework1v2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Robot {
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name) {
        this.name = name;
        maxJump = (int) (Math.random()*10+1);
        maxRun = (int) (Math.random()*1000);
    }
}
