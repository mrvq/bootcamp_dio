public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {

        switch (clock) {

            case USClock usClock ->
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();

            case BRLClock brlClock ->  super.convert(clock);

        }

        return this;
    }

}
