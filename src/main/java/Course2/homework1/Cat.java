package Course2.homework1;

public class Cat implements Runnable, Jumpable, Movable {
    private String name;
    private int maxRun;
    private int maxJump;
    boolean isWeak;

    public Cat(String name) {
        this.name = name;
        maxJump = (int) (Math.random()*3+1);
        maxRun = (int) (Math.random()*50+50);
    }

    @Override
    public void run(RunningTrack runningTrack) {
        System.out.print(String.format("%-40s", this.name + " начал бежать."));
        if (runningTrack.getLength() > this.maxRun) {
            isWeak = true;
            System.out.println(String.format("%-40s", this.name + " не справился :(") + String.format("%s", "Длина " + runningTrack.getLength() + ", а его максимум " + this.maxRun));
        } else {
            System.out.println(String.format("%-40s", this.name + " пробежал!") + String.format("%s", "Длина " + runningTrack.getLength() + ", а его максимум " + this.maxRun));
        }
    }

    @Override
    public void jump(Wall wall) {
        System.out.print(String.format("%-40s", this.name + " готовится к прыжку."));
        if (wall.getHeight() > this.maxJump) {
            isWeak = true;
            System.out.println(String.format("%-40s", this.name + " не справился :(") + String.format("%s", "Высота " + wall.getHeight() + ", а его максимум " + this.maxJump));
        } else {
            System.out.println(String.format("%-40s", this.name + " перепрыгнул!") + String.format("%s", "Высота " + wall.getHeight() + ", а его максимум " + this.maxJump));
        }
    }

    @Override
    public boolean isWeak() {
        return isWeak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }
}
