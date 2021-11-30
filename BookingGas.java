package in.edu.app;
import java.io.*;
import java.util.*;
import java.text.*;

public class BookingGas {
	void bookGas()throws IOException
    {   
        FileInputStream fi=new FileInputStream("gas.dat");
        DataInputStream fi1=new DataInputStream(fi);
        FileOutputStream fo=new FileOutputStream("bookinggas.dat",true);
        DataOutputStream fo1=new DataOutputStream(fo);
        Date today=new Date();
        
        DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
        String dat=fmt.format(today);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String nm,dat1,address,city;
        int pin,consno,sl=1,no,chk=0,nm1,dep;
        char ch;
        long telno;
        boolean EOF=false;

        System.out.println("\t\t\t\tINDANE GAS BOOKING");
        System.out.println("Enter Consumer number");
        int cn=Integer.parseInt(br.readLine());

        System.out.print("Sl No.\tConsumer No.\tName of the customer\t\tAddress\t\tDate of Booking\n ");

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

				if(consno==cn)
				{
				
					chk=1;
					System.out.println(sl+"\t"+consno+"\t\t"+nm+"\t\t\t\t"+address+"\t\t\t"+dat);
					System.out.println("\nTelephone Number:"+telno+"\n");
					System.out.println("\nDate of booking :"+dat);

					sl++;
					chk=1;
					fo1.writeInt(consno);
					fo1.writeUTF(nm);
					fo1.writeUTF(address);
					fo1.writeUTF(dat);
					fo1.writeUTF("Not Yet Delivered ");          
					}
            } catch(EOFException e)
                {
                    EOF=true;
                }
            }

		if(chk==0)
		            {
		System.out.println("Details not found in Database");
		            }
		fi.close();
		fi1.close();
		        }

}
