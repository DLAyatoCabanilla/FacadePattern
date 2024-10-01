public class FrontDesk {
    private HotelService service;

    public FrontDesk(HotelService service) {
        this.service = service;
    }

    public void doService() {
        while (!service.takeInput()) {
            System.out.println("Invalid input, try again\n");
        }
        System.out.println();
        service.startService();

        System.out.println();
        service.reportDone();
        System.out.println();
    }
}