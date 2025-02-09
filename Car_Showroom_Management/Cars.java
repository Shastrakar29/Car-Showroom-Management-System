package Car_Showroom_Management;
import java.util.Scanner;

public class Cars extends ShowRoom implements utility{
   public String car_name;
   public String car_color;
   public String car_fuel_type;
   private int car_price;
    public String car_type;
   public String car_transmission;

    @Override
    public void get_details() {
        System.out.println("NAME: " + car_name);
        System.out.println("COLOR: " + car_color);
        System.out.println("FUEL TYPE: " + car_fuel_type);
        System.out.println("PRICE: " + car_price);
        System.out.println("CAR_TYPE: " + car_type);
        System.out.println("TRANSMISSION: " + car_transmission);
    }
    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================== *** ENTER CAR DETAILS *** ====================");
        System.out.println("CAR NAME: ");
        car_name =  sc.nextLine();
        System.out.println("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission =  sc.nextLine();
        int total_cars_in_Stock = 0;
        total_cars_in_Stock++;





    }
}
