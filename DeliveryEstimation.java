package in.edu.app;
import java.util.*;
import java.text.*;

public class DeliveryEstimation {
	void getEstimatedDeliveryDate()
    {
        GregorianCalendar duedate=new GregorianCalendar();
        DateFormat fmt=DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
        Date today=new Date();
        String tode,payDate;
        duedate.add(GregorianCalendar.DATE,15);
        Date due=duedate.getTime();
        payDate=fmt.format(due);
        tode=fmt.format(today);
        System.out.println("Date of Booking			:"+tode);
        System.out.println("Estimated Delivery Date	:"+payDate);

    }

}
