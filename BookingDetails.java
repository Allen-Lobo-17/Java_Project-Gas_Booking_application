package in.edu.app;
import java.io.*;
import java.util.*;
import java.text.*;

public class BookingDetails {
	void displayGasBookings()throws IOException
    {   
        
        FileInputStream fi=new FileInputStream("bookinggas.dat");
        DataInputStream fi1=new DataInputStream(fi);
        Date today=new Date(); String status;
        DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
        String dat=fmt.format(today);
        
        String nm,address,city;
		int pin,consno,sl=1,no,chk=0,nm1,dep,payDate;
		char ch;
		long telno=0;
		boolean EOF=false;

		System.out.println("\t\t\t\tINDANE GAS BOOKING");
		System.out.println("\t\t\t\tList of booking ");
		System.out.println("Sl No.\tConsumer No.\tName of the customer\tDate of booking \t Status");
		
		while(EOF!=true)
        {
			try
			{
				consno=fi1.readInt();
				nm=fi1.readUTF();
				address=fi1.readUTF();
				dat=fi1.readUTF();
				status=fi1.readUTF();

				if(status.equalsIgnoreCase("Not yet Delivered"))
				{
					System.out.println(sl+"\t"+consno+"\t\t"+nm+"\t\t\t"+dat+"\t"+status);

					sl++;
					chk=1;
                  }
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
