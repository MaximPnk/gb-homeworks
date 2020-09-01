package course2.homework1v2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Human {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isWeak;

    public Human(String name) {
        this.name = name;
        maxJump = (int) (Math.random()*7+1);
        maxRun = (int) (Math.random()*500+100);
    }
}
