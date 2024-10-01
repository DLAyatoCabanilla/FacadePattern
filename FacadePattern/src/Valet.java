import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Valet implements HotelService {

    private String plateNumber;

    @Override
    public boolean takeInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("The CFV Valet Hotel Service requires your plate number to be handled");
        System.out.print("Plate Number: ");

        plateNumber = scan.nextLine();

        return plateNumber.length() != 0;
    }

    @Override
    public void startService() {
        pickUpVehicle(plateNumber);
    }

    @Override
    public void reportDone() {
        System.out.println("The CFV Valet Hotel Service Report:");
        System.out.println("Successfully parked and picked-up car: " + plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Receiving key to the client's car: " + plateNumber);

        System.out.println("Starting Car.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Parking please wait....");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Turning off Car.");
    }
}