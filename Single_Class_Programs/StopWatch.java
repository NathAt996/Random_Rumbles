package Single_Class_Programs;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch () {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0l;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {

        if (this.endTime == 0) {

            return System.currentTimeMillis() - this.startTime;
        }

        else {

            return this.endTime - this.startTime;
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public static void main(String[] args) {

        StopWatch timer = new StopWatch();

        System.out.println("Timer starts.");
        timer.start();
        System.out.println("Start Time (ms): " + timer.getStartTime());

        System.out.println();

        timer.stop();
        System.out.println("Timer stopped.");
        System.out.println("End Time (ms):   " + timer.getEndTime());

        System.out.println("Elapsed Time (ms): " + timer.getElapsedTime());

    }
}
