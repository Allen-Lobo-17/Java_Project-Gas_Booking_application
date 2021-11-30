package in.edu.app;
import java.io.*;

public class GasBookingApp {

	public static void main(String[] args) {
				
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=1;
		do
        {
			System.out.println("\t\t\t\tINDANE GAS BOOKING PROJECT");
			System.out.println("\t\t\t\tMAIN-MENU");
			System.out.println("__________________________________________________________________________________________________________________________________________________________");
			System.out.println("1. Add a New Customer ");
			System.out.println("2. Display customer information");
			System.out.println("3. Book a new gas cylinder");
			System.out.println("4. Estimated delivery details");
			System.out.println("5. Display gas booking records");
			System.out.println("6. Exit");
			System.out.println("Enter your choice[1-6] :");
			
			try{
				choice=Integer.parseInt(br.readLine());
				
				switch(choice)
	            {
					case 1:AddCustomer newCust=new AddCustomer();
					newCust.addCustRecord();
					break;
					
					case 2:DisplayCustomerDetails custDisp =new DisplayCustomerDetails();
					custDisp.displayCustDetails();
					break;
					
					case 3:BookingGas cylinederBooking=new BookingGas();
					cylinederBooking.bookGas();
					break;
					
					case 4:DeliveryEstimation delEstimate=new DeliveryEstimation();
					delEstimate.getEstimatedDeliveryDate();
					break;
					
					case 5:BookingDetails gasbookings=new BookingDetails();
					gasbookings.displayGasBookings();
					break;
					
					case 6:System.out.println("Thank You!");
					break;
					
					default:System.out.println("Invalid Choice");
				}
			}catch(IOException i)
			{
				System.out.println("File Error");
			}
        }while(choice!=6);
    }
}
