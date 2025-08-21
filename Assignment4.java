import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Random r = new Random();
        double balance = 0;
        boolean running = true;
        while (running) {
            System.out.println("[The Refueler Station]");
            System.out.println("1. Add Gas Car");
            System.out.println("2. Add electric car");
            System.out.println("3. Add hybrid car");
            System.out.println("4. Refuel all gas engines");
            System.out.println("5. Recharge all electric engines");
            System.out.println("6. Refuel and recharge all vehicles");
            System.out.println("7. Display all vehicles");
            System.out.println("8. Dispatch all vehicles");
            System.out.println("9. Quit");
            System.out.println("Gas: $4.00/gal | Electricity: $0.20/kW");
            System.out.print("Select option: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    double tankCapacity = r.nextInt(16) + 15;
                    double currentCapacity = r.nextInt(13) +2;
                    GasCar gascar = new GasCar(tankCapacity,currentCapacity);
                    cars.add(gascar);
                    System.out.println("Vehicle " + gascar.getId() + " has parked at the pump.");
                    break;
                case 2:
                    double maxBattery = r.nextInt(61) +40;
                    double currentCharge = r.nextInt(29) +2;
                    ElectricCar electricCar = new ElectricCar(maxBattery,currentCharge);
                    cars.add(electricCar);
                    System.out.println("Vehicle " + electricCar.getId() + " has parked at charger.");
                    break;
                case 3:
                    double MaxBattery = r.nextInt(61) +40;
                    double CurrentCharge = r.nextInt(29) +2;
                    double TankCapacity = r.nextInt(16) + 15;
                    double CurrentCapacity = r.nextInt(13) +2;
                    HybridCar hybridCar = new HybridCar(MaxBattery, CurrentCharge, TankCapacity, CurrentCapacity);
                    cars.add(hybridCar);
                    System.out.println("Vehicle " + hybridCar.getId() + " has parked at pump-charger.");
                    break;
                case 4:
                    double gasRevenue = 0;
                    for(Car car: cars){
                        if(car instanceof GasEngine gasCar){
                            double refueled= gasCar.refuelTank(Double.MAX_VALUE);
                            gasRevenue += refueled*4.00;
                        }
                    }
                    balance += gasRevenue;
                    System.out.println("All gas vehicles refueled. Current balance is $" + balance);
                    break;
                case 5:
                    double electricRevenue = 0;
                    for(Car car: cars){
                        if(car instanceof ElectricEngine electriccar){
                            double recharged = electriccar.rechargeBattery(Double.MAX_VALUE);
                            electricRevenue += recharged*0.20;
                        }
                    }
                    balance += electricRevenue;
                    System.out.println("All electric vehicles recharged. Current balance is $" +balance);
                    break;
                case 6:
                    double allRevenue = 0;
                    for(Car car: cars){//gasCars
                        if(car instanceof GasEngine gasCar){
                            double refueled= gasCar.refuelTank(Double.MAX_VALUE);
                            allRevenue += refueled*4.00;
                        }
                    }
                    for(Car car: cars){//electricCars
                        if(car instanceof ElectricEngine electriccar){
                            double recharged = electriccar.rechargeBattery(Double.MAX_VALUE);
                            allRevenue += recharged*0.20;
                        }
                    }
                    balance += allRevenue;
                    System.out.println("All vehicles refueled and recharged. Current balance is $" +balance);
                    break;
                case 7:
                    if(cars.isEmpty()){
                        System.out.println("List is empty, please add elements.");
                    }else{
                        for(Car car: cars){
                            System.out.println(car);
                        }
                    }
                    break;
                case 8:
                    cars.clear();
                    System.out.println("All vehicles have left.");
                    break;
                case 9:
                    System.out.println("Shutting down...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}