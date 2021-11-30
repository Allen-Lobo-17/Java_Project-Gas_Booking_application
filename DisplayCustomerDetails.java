package in.edu.app;
import java.io.*;

public class DisplayCustomerDetails {
	void displayCustDetails()throws IOException
	   {
		FileInputStream fi=new FileInputStream("gas.dat");
		DataInputStream fi1=new DataInputStream(fi);
		String nm,address,city;
		int pin,consno,sl=1,no,dep;
		long telno;
		boolean EOF=false;
		
		System.out.println("\t\t\t\tINDANE GAS BOOKING");
		System.out.print("Sl No.\tConsumer No.\tName of the customer\tAddress\n");
	
		while(EOF!=true)
	        {
				try
	            {
					consno=fi1.readInt();
					nm=fi1.readUTF();
					address=fi1.readUTF();
					city=fi1.readUTF();
					pin=fi1.readInt();
					no=fi1.readInt();
					telno=fi1.readLong();
					dep=fi1.readInt();
					System.out.println(sl+"\t"+consno+"\t\t"+nm+"\t\t\t"+address+" "+city+" "+pin);
					System.out.println("\nTelephone No."+telno);
					System.out.println("Deposit Amount:"+dep+"\n");
					sl++;
	            }
				catch(EOFException e)
	            {
	                EOF=true;
	            }
	        }
				fi.close();
				fi1.close();
	    }
}
