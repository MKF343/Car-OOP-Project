public class GasCar extends Car implements GasEngine{
    private double tankCapacity;
    private double currentVolume;
    //constructor
    public GasCar(double tankCapacity, double currentVolume) {
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }

    //interface methods
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
    public String toString() {
        return "Car: " + getId() + " | " + " Current Fuel: " + getCurrentVolume() + "/" + getTankCapacity() + " gals";
    }
}
