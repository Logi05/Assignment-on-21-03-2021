package test5;

import java.util.EnumSet;

enum DaysOfWeek
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumExample {
public static void main(String args[])
{
	EnumSet<DaysOfWeek> set1=EnumSet.allOf(DaysOfWeek.class);
	System.out.println("DaysOfWeek: "+set1);
	
	EnumSet<DaysOfWeek> set2=EnumSet.of(DaysOfWeek.SUNDAY,DaysOfWeek.SATURDAY);
	System.out.println("WeekEnds: "+set2);
	
	EnumSet<DaysOfWeek> set3=EnumSet.of(DaysOfWeek.MONDAY,DaysOfWeek.TUESDAY,DaysOfWeek.WEDNESDAY,DaysOfWeek.THURSDAY,DaysOfWeek.FRIDAY);
	System.out.println("WeekDays: "+set3);
}
}
