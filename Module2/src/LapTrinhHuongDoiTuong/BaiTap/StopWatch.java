package LapTrinhHuongDoiTuong.BaiTap;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

public class StopWatch {
    public StopWatch(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public StopWatch() {

    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    private long start,end;
    public void startTimer(){
        this.start = System.currentTimeMillis();
    }
    public void stopTimer() {
        this.end = System.currentTimeMillis();
    }
    public long elapsedTime(){
        return (this.end - this.start);
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu:\n1:Start Timer");
        int start = scanner.nextInt();
        if (start == 1) {
            watch.startTimer();
            System.out.println(watch.start);
            while (start == 1){
                System.out.println("Input 2 for Stop Timer And Display");
                start = scanner.nextInt();
                if (start == 2){
                    watch.stopTimer();
                    System.out.println(watch.end);
                    System.out.println(watch.elapsedTime() + "\tmillisecond");
            }else start = 1;
        }
        }else System.out.println("Invalid Input");
    }
}
