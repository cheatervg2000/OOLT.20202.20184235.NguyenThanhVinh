package lab04;

import java.util.Scanner;
import java.util.Calendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public MyDate() {
		this.year = Calendar.getInstance().get(Calendar.YEAR);
		this.month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		this.day = Calendar.getInstance().get(Calendar.DATE);
	}
	
	public MyDate(int day, int month, int year) {
		int day_pred = checkDay(month, year);
		if (day_pred == 0 || 0 >= day || day > day_pred) {
			System.out.println("ngay thang khong ton tai");
			return;
		}
		else {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public MyDate(String date) {
		stringToDate(date);
	}
	
	public void stringToDate(String date) {
		String[] dayStr = date.split("/");
		int year = Integer.parseInt(dayStr[2]);
		int month = checkMonth(dayStr[0]);
		int day = 0;
		int lengthDay = dayStr[1].length();
		if (lengthDay == 1 || lengthDay == 2)
			day = Integer.parseInt(dayStr[2]);
		if (lengthDay == 3) 
			day = Integer.parseInt(dayStr[2].substring(0, 1));
		if (lengthDay == 4) 
			day = Integer.parseInt(dayStr[2].substring(0, 2));
		
		int day_pred = checkDay(month, year);
		if (day_pred == 0 || 0 >= day || day > day_pred) {
			System.out.println("ngay thang khong ton tai");
			return;
		}
		else {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public void accept() {
		System.out.println("nhap ngay theo dinh dang mm/dd/yy");
		try (Scanner scanner = new Scanner(System.in)) {
			String date = scanner.nextLine();
			stringToDate(date);
		}
	}
	

	
	public boolean checkYear(int a) {
		return a <= 0;
	}
	
	public boolean isLeap(int year) {
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
           return false;
	}
	
	public int checkMonth(String month) {
		if(month.equals("1") || month.equals("January") || month.equals("Jan.") || month.equals("Jan"))
			return 1;
		if(month.equals("2") || month.equals("February") || month.equals("Feb.") || month.equals("Feb"))
			return 2;
		if(month.equals("3") || month.equals("March") || month.equals("Mar.") || month.equals("Mar"))
			return 3;
		if(month.equals("4") || month.equals("April") || month.equals("Apr.") || month.equals("Apr"))
			return 4;
		if(month.equals("5") || month.equals("May"))
			return 5;
		if(month.equals("6") || month.equals("June") || month.equals("Jun"))
			return 6;
		if(month.equals("7") || month.equals("July") || month.equals("Jul"))
			return 7;
		if(month.equals("8") || month.equals("August") || month.equals("Aug.") || month.equals("Aug"))
			return 8;
		if(month.equals("9") || month.equals("September") || month.equals("Sept.") || month.equals("Sep"))
			return 9;
		if(month.equals("10") || month.equals("October") || month.equals("Oct.") || month.equals("Oct"))
			return 10;
		if(month.equals("11") || month.equals("November") || month.equals("Nov.") || month.equals("Nov"))
			return 11;
		if(month.equals("12") || month.equals("December") || month.equals("Dec.") || month.equals("Dec"))
			return 12;
		else
			return 0;
	}
	
	public int checkDay(int month, int year) {
		if (checkYear(year)) return 0;
		boolean is_leap = isLeap(year);
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 2 && is_leap == true)
			return 29;
		if (month == 2 && is_leap == false)
			return 28;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		return 0;
	}
	
	
	public void print(){
		String months[] = {"", "January", "February ", "March", "April", "May",
                "June", "July", "Augues", "September", "October",
                "November", "December"};
		System.out.print(months[this.getMonth()]+" ");
		System.out.print("Date" + this.getDay());
		if (this.getDay() == 1 || this.getDay() == 21)
			System.out.print("st ");
		if (this.getDay() == 2 || this.getDay() == 22)
			System.out.print("nd ");
		if (this.getDay() == 3 || this.getDay() == 23)
			System.out.print("rd ");
		else
			System.out.print("th ");

		System.out.println(this.getYear());
	}
}
