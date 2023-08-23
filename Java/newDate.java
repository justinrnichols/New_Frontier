package newOregonTrail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class newDate {
	Scanner in = new Scanner(System.in);
	private static int month;
	private static int day;

	newDate(){}
	
	public void dateInfo() throws FileNotFoundException, IOException {
    	try (BufferedReader reader = new BufferedReader(new FileReader("date_info.txt"))) {
 		   String line = null;
 		   while ((line = reader.readLine()) != null)
 		       System.out.println(line);
 		}
    }
	
	public int defaultMonth() {
		month = 3;
		return month;
	}
	
	public int defaultDay() {
		day = 28;
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int newMonth) {
		month += newMonth;
	}
	
	public void setDay(int newDay){
		day += newDay;
	}
	
	public String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1847);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, day);
		return String.format(dateFormat.format(cal.getTime()));
	}
	
	public int enterMonth() {
		do {
			System.out.println("Enter a number for a new month. March = 3, April = 4, or May = 5");
			try {
				month = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.print("Numbers only. ");
			}
			if(!(month >= 3 && month <= 5))
				System.out.println("Invalid input. Please try again.");
			System.out.println(month);
		}
		while(!(month >= 3 && month <= 5));
		return month;
	}
	
	
	public int enterDay() {
		do {
			System.out.println("Enter a number for a new day: ");
			try {
				day = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.print("Numbers only. ");
			}
			if(month == 4 && (!(day >= 1 && day <= 30)))
				System.out.println("Invaid input. Please try again. April only has 30 days.");
			else if(!(day >= 1 && day <= 31))
				System.out.println("Invalid input. Please try again.");
				
		}
		while(!(day >= 1 && day <= 31) || (month == 4 && (!(day >= 1 && day <= 30))));
		return day;
	}
}