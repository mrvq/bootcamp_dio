public class App {
    public static void main(String[] args) throws Exception {

        Clock brlClock = new BRLClock();
        brlClock.setHour(10);
        brlClock.setMinute(30);
        brlClock.setSecond(45);
        System.out.println("BRLClock: " + brlClock.getHour() + ":" + brlClock.getMinute() + ":" + brlClock.getSecond());

        System.out.println(new USClock().convert(brlClock).getHour() + ":" + new USClock().convert(brlClock).getMinute()
                + ":" + new USClock().convert(brlClock).getSecond());

    }
}
