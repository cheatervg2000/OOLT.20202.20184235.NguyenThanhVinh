package lab03;
import java.util.Scanner;
import java.time.LocalDate;
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
		String[] todayStr = LocalDate.now().toString().split("-");
		setYear(Integer.parseInt(todayStr[0]));
		setMonth(Integer.parseInt(todayStr[1]));
		setDay(Integer.parseInt(todayStr[2]));
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
	
	public int checkMonth(String mont) {
		if(mont.equals("1") || mont.equals("January") || mont.equals("Jan.") || mont.equals("Jan"))
			return 1;
		if(mont.equals("2") || mont.equals("February") || mont.equals("Feb.") || mont.equals("Feb"))
			return 2;
		if(mont.equals("3") || mont.equals("March") || mont.equals("Mar.") || mont.equals("Mar"))
			return 3;
		if(mont.equals("4") || mont.equals("April") || mont.equals("Apr.") || mont.equals("Apr"))
			return 4;
		if(mont.equals("5") || mont.equals("May"))
			return 5;
		if(mont.equals("6") || mont.equals("june") || mont.equals("Jun"))
			return 6;
		if(mont.equals("7") || mont.equals("July") || mont.equals("Jul"))
			return 7;
		if(mont.equals("8") || mont.equals("August") || mont.equals("Aug.") || mont.equals("Aug"))
			return 8;
		if(mont.equals("9") || mont.equals("September") || mont.equals("Sept.") || mont.equals("Sep"))
			return 9;
		if(mont.equals("10") || mont.equals("October") || mont.equals("Oct.") || mont.equals("Oct"))
			return 10;
		if(mont.equals("11") || mont.equals("November") || mont.equals("Nov.") || mont.equals("Nov"))
			return 11;
		if(mont.equals("12") || mont.equals("December") || mont.equals("Dec.") || mont.equals("Dec"))
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
		String months[] = {"", "January", "February ", "march", "April", "May",
                "June", "July", "Augues", "september", "october",
                "November", "December"};
		System.out.print(months[this.getMonth()]+" ");
		System.out.print("Date" + this.getDay());
		if (this.getDay() == 1 || this.getDay() == 21)
			System.out.print("St ");
		if (this.getDay() == 2 || this.getDay() == 22)
			System.out.print("Nd ");
		if (this.getDay() == 3 || this.getDay() == 23)
			System.out.print("Rd ");
		else
			System.out.print("Th ");

		System.out.println(this.getYear());
	}
	
}
