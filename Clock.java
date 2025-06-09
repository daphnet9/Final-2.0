//Jia Yi
import java.util.Scanner;

public class Clock {

    private long timer = 0;

    public Clock(int t) {
        this.timer = t * 60000;
    }

    public void startTimer(Scanner scanner, Task task) throws InterruptedException
    {
        long taskTime = System.currentTimeMillis() + timer;
        while (taskTime > System.currentTimeMillis())
        {
            int minutes = (int) (taskTime - System.currentTimeMillis()) / 60000;
            int seconds = (int) ((taskTime - System.currentTimeMillis()) / 1000) % 60;
            Thread.sleep(1000);
            System.out.printf("%02d:%02d\r", minutes, seconds);
            System.out.flush();
        }
    }
}
