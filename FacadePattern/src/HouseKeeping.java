import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HouseKeeping implements HotelService {

    private Integer roomNumber;

    @Override
    public boolean takeInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("The CFV House Keeping Hotel Service requires a number of your personal room");
        System.out.print("Room number: ");

        try {
            roomNumber = Integer.parseInt(scan.nextLine());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void startService() {
        cleanRoom(roomNumber);
    }

    @Override
    public void reportDone() {
        System.out.println("The CFV House Keeping Hotel Service Report:");
        System.out.println("Successfully cleaned room " + roomNumber);
    }

    public void cleanRoom(Integer roomNumber) {
        System.out.println("Preparing cleaning equipment for room " + roomNumber);
        System.out.println("Entering the room: " + roomNumber);

        for (int i = 0; i < 4; i++) {
            System.out.println("Cleaning....");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exiting room: " + roomNumber);
    }
}