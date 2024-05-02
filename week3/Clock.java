package week3;

public class Clock {
    public static void main(String[] args) {
        ClockDisplay jam = new ClockDisplay(10, 15, 0);

        for (int i = 0; i < 3600; i++) {
            jam.timeTick();
            System.out.println(jam.getTime());
        }
    }
}
