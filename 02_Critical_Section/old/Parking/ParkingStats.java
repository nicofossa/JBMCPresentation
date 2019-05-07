public class ParkingStats { 
          private long numberCars; 
          private long numberMotorcycles; 
          private ParkingCash cash;
public ParkingStats(ParkingCash cash) { 
numberCars = 0; 
numberMotorcycles = 0; 
this.cash = cash; 
}

public void carComeIn() {
          numberCars++;
        }
public void carGoOut() {
numberCars--;
cash.vehiclePay();
}
public void motoComeIn() {
          numberMotorcycles++;
        }
public void motoGoOut() {
numberMotorcycles--;
cash.vehiclePay();
}

}
