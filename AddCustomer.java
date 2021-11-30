package in.edu.app;
import java.io.*;

public class AddCustomer {
	public void addCustRecord()throws IOException
    {
		FileOutputStream fo=new FileOutputStream("gas.dat",true);
		DataOutputStream fo1=new DataOutputStream(fo);
        String nm,address,city;
        int pin,consno,no,dep;
        char ch;
        long telno;
        
        do
        {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t\t\t\tINDANE GAS BOOKING");
			System.out.println("\t\t\tPlease Enter the Customer Details");
			System.out.println("Enter the Consumer number");
			consno=Integer.parseInt(br.readLine());
			System.out.println("Enter the Name of the customer");
			nm=br.readLine();
			System.out.println("Enter the address");
			address=br.readLine();
			System.out.println("Enter the name of the city");
			city=br.readLine();
			System.out.println("Enter the pincode of the city");
			pin=Integer.parseInt(br.readLine());
			System.out.println("Enter the number of gas cylinders alotted");
			no=Integer.parseInt(br.readLine());
			System.out.println("Enter the Contact No.");
			telno=Long.parseLong(br.readLine());
			System.out.println("Enter the Deposit Amount");
			dep=Integer.parseInt(br.readLine());
			fo1.writeInt(consno);
			fo1.writeUTF(nm);
			fo1.writeUTF(address);
			fo1.writeUTF(city);
			fo1.writeInt(pin);
			fo1.writeInt(no);
			fo1.writeLong(telno);
			fo1.writeInt(dep);

			System.out.println("Do you want to add any more Customer Data?[y/n]");
			ch=(char)br.read();
        }while(ch=='y');
        
        fo1.close();
    }
}
