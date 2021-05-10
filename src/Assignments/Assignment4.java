package Assignments;

import java.util.*;

public class Assignment4 {
	private void findRange(Date date[],Date da) {
		if(date[0].after(date[1]))
			System.out.println("No Range");
		else {
		Date after30 = addDays(da,30);
		Date before30 = substractDays(da,30);
		System.out.print(before30.getDate()+"-"+(before30.getMonth()+1)+"-"+(before30.getYear()+1900)+" ");
		if(date[1].before(after30))
			System.out.println(date[1].getDate()+"-"+(date[1].getMonth())+"-"+(date[1].getYear()+1900));
		else
			System.out.println(after30.getDate()+"-"+(after30.getMonth())+"-"+(after30.getYear()+1900));
	}
	}
	private Date addDays(Date date,int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
	private Date substractDays(Date date,int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);
		return cal.getTime();
	}
	public static void main(String[] args){
		Assignment4 assign = new Assignment4();
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		Date date[] = new Date[2];
		Calendar cal = Calendar.getInstance();
		int currYear=-1,currMonth=-1,currDay=-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				String d = sc.next();
				int year = Integer.parseInt(d.substring(6));
				int month = Integer.parseInt(d.substring(3, 5));
				if(j==1) {
					currYear = year;
				}
				int day = Integer.parseInt(d.substring(0, 2));
				if(j==0) {
					currMonth = month;
					currDay = day;
				}
				cal.set(year, month, day);
				date[j]=cal.getTime();
			}
			cal.set(currYear, currMonth-1, currDay);
			Date da = cal.getTime();
			assign.findRange(date,da);
		}
	}
}
