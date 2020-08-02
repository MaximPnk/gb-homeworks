package Course2.homework1v2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cat {
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name) {
        this.name = name;
        maxJump = (int) (Math.random()*3+1);
        maxRun = (int) (Math.random()*50+50);
    }
}
