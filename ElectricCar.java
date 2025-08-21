public class ElectricCar extends Car implements ElectricEngine{
    private double maxBattery;
    private double currentCharge;
    //constructor
    public ElectricCar(double maxBattery, double currentCharge){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
    }

    //interface methods
    @Override
    public double rechargeBattery(double amount) {
        double amountCharged = this.maxBattery - this.currentCharge;
        double chargeAdded = Math.min(amount,amountCharged);
        this.currentCharge += chargeAdded;
        return chargeAdded;
    }

    @Override
    public double getMaxBattery() {
        return this.maxBattery;
    }

    @Override
    public double getCurrentCharge() {
        return this.currentCharge;
    }
    //toString override
    @Override
    public String toString() {
        return "Car: " + getId() + " | " + " Current Charge: " + getCurrentCharge() + "/" + getMaxBattery() + " kW";
    }
}
