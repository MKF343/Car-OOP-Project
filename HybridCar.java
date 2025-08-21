public class HybridCar extends Car implements GasEngine,ElectricEngine{
    private double maxBattery;
    private double currentCharge;
    private double tankCapacity;
    private double currentVolume;
    //constructor
    public HybridCar(double maxBattery, double currentCharge, double tankCapacity, double currentVolume){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }
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

    @Override
    public double refuelTank(double amount) {
        double amountFilled = this.tankCapacity - this.currentVolume;
        double fuelAdded = Math.min(amount,amountFilled);
        this.currentVolume += fuelAdded;
        return fuelAdded;
    }

    @Override
    public double getTankCapacity() {
        return this.tankCapacity;
    }

    @Override
    public double getCurrentVolume() {
        return this.currentVolume;
    }
    //toString override
    @Override
    public String toString(){
        return "Car: " + getId() + " | " + " Current Charge: " + getCurrentCharge() + "/" + getMaxBattery() + " kW" + " | " + "Current Fuel: " +  getCurrentVolume() + "/" + getTankCapacity() + " gals";
    }
}
