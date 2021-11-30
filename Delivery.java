package in.edu.app;
import java.io.*;

public class Delivery {
	void delivery()throws IOException
    {
        
        FileInputStream fi=new FileInputStream("bookinggas.dat");
        DataInputStream fi1=new DataInputStream(fi);
        int consno[]=new int[50];
        String nm[]=new String[50];
        String address[]=new String[50];
        String dat1[]=new String[50];
        String status[]=new String[50];
             
        //DateFormat fmt=DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sl=0,chk=0;
        int nm1,index=0;
        boolean EOF=false;
        
        System.out.println("\t\t\t\tINDANE GAS BOOKING");
        System.out.println("Enter the consumer number");
        nm1=Integer.parseInt(br.readLine());
        
        while(EOF!=true)
        {
        	try
            {
				consno[index]=fi1.readInt();
				nm[index]=fi1.readUTF();
				address[index]=fi1.readUTF();
				dat1[index]=fi1.readUTF();
				status[index]=fi1.readUTF();
				
				if(nm1==consno[index])
				{
				    System.out.println("Sl.No.\tConsumer No.\tName of Customer\tDate of Delivery");
				    System.out.println(sl+"\t"+consno[index]+"\t\t"+nm[index]+"\t\t\t"+dat1[index]);
				    System.out.println("Your order has been successful.Gas will be delivered");
				    status[index]="Delivered";
				    sl++;
				    chk=1;

                   }
                    index=index+1;
            	}
        	    catch(EOFException e)
                {
                    EOF=true;
                }
            }
        
        fi.close();
        fi1.close();
        
        if(chk==1)
          {
            FileOutputStream fa=new FileOutputStream("bookinggas.dat",false);
            DataOutputStream fa1=new DataOutputStream(fa);
        
            for(int i=0;i<index;i++)
            {
            	fa1.writeInt(consno[i]);
            	fa1.writeUTF(nm[i]);
            	fa1.writeUTF(address[i]);
            	fa1.writeUTF(dat1[i]);
            	fa1.writeUTF(status[i]);
                      
            }
                
            fa.close();
            fa1.close();
            
        }
        
        }
}