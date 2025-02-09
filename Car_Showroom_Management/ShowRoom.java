package Car_Showroom_Management;
import java.util.Scanner;
public  class ShowRoom implements  utility {
   public String showroom_name;
   public  String showroom_address;
   public int total_employees;
   int total_cars_in_Stock =  0;
   public String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name : "+showroom_name);
        System.out.println("Showroom Address :"+showroom_address);
        System.out.println("Manager Name : "+manager_name);
        System.out.println("Total Employee :"+total_employees);
        System.out.println("Total Cars in Stocks :"+total_cars_in_Stock);
    }
    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================== *** ENTER SHOWROOM DETAILS *** ======================");
        System.out.println();
        System.out.println("SHOWROOM NAME:  ");
        showroom_name =  sc.nextLine();
        System.out.println(("SHOWROOM ADDRESS:  "));
        showroom_address =  sc.nextLine();
        System.out.println("MANAGER NAME: ");
        manager_name =  sc.nextLine();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_employees =  sc.nextInt();
        System.out.println("TOTAL CARS IN STOCKS: ");
        total_cars_in_Stock =  sc.nextInt();

    }
}
