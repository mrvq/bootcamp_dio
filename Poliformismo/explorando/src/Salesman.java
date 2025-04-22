public non-sealed class Salesman extends Employee {

    private double percentPerSold;
    private double soldAmount;

    public Salesman(double salary,
            String code,
            String name,
            String address,
            String age,
            double percentPerSold,
            double soldAmount) {
        super(salary, code, name, address, age);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {

        return "SL" + super.getCode();
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public Salesman() {

    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        return this.getSalary() + (this.getSoldAmount() * this.getPercentPerSold() / 100);
    }

}
