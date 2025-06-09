//Jia Yi

public class Clock {

    private long timer = 0;

    public Clock(int t) {
        this.timer = t * 60000;
    }

    public void startTimer() throws InterruptedException
    {
        long taskTime = System.currentTimeMillis() + timer;
        while (taskTime > System.currentTimeMillis())
        {
            //System.out.println((taskTime - System.currentTimeMillis())/1000);
            Thread.sleep(1000);
            System.out.printf("%02d:%02d\n",
            (taskTime - System.currentTimeMillis()) / 60000,
            ((taskTime - System.currentTimeMillis()) / 1000) % 60);
            System.out.flush();
        }
    }
}
