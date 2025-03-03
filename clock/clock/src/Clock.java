public sealed abstract class Clock permits BRLClock, USClock {

    protected int hour;

    protected int minute;

    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;


    }

    public int getMinute() {
        
        return minute;
    }

    public void setMinute(int minute) {
        
        if(minute >= 60){
            this.minute = 60;
            return;
        }
        
        
        this.minute = minute;
    }

    public int getSecond() {

    
        
        return second;
    }

    public void setSecond(int second) {

        if(second>= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    public Clock convert(Clock clock);
    this.second = clock.getSecond();
    this.minute = clock.getMinute();
    this.hour = clock.getHour();
    return this;
    
}
