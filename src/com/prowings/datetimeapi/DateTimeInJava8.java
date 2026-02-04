package com.prowings.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeInJava8 {
	
	public static void main(String[] args) {
		
		LocalDate todaysDate = LocalDate.now();
		
		System.out.println(todaysDate);
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime meetingTime = LocalTime.of(10, 30);
		System.out.println(meetingTime);
		
		 ZonedDateTime indiaTime = ZonedDateTime.now();
		
		System.out.println(indiaTime);
		
		Instant now2 = Instant.now();
        System.out.println(now2); // 2026-02-03T06:15:23.456Z
		
        //Age Calculate
        LocalDate birthDate = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();

        Period period = Period.between(birthDate, end);
        System.out.println("Current age is : "+period.getYears() + " years "
                + period.getMonths() + " months "
                + period.getDays() + " days");
   
        
        //difference between 2 dates
        
        LocalDate joinDate = LocalDate.of(2024, 6, 10);
        LocalDate today = LocalDate.now();
        
        long years = ChronoUnit.YEARS.between(joinDate, today);
        System.out.println("Years passed : "+years);
        
        long months = ChronoUnit.MONTHS.between(joinDate, today);
        System.out.println("Months passed : "+months);
        
        LocalDate todays = LocalDate.now();
        
        LocalDate futureDate = todays.plus(84, ChronoUnit.DAYS);

        System.out.println("Date after 10 days : "+futureDate);
        
        
	}

}
