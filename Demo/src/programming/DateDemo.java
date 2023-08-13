package programming;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(sdf.format(date));
		System.out.println(date.toString());

	}

}
