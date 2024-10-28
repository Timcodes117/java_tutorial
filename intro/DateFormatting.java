import java.util.*;
import java.text.*;

public class DateFormatting{

	public static void DateDemo1(){
		Date dNow = new Date();
		SimpleDateFormat tc = new SimpleDateFormat(" dd,MM,yyyy  hh:mm:ss z");
		System.out.println(tc.format(dNow));
	}

	public static void DateDemo2(){ 
	}

	public static void main(String[] args){
		DateDemo1();
	}
}