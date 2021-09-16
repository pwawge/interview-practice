package com.practice.version8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class LocalDateFormat {
int a;
	public static void main(String[] args) {
		// Create date
		LocalDate date = LocalDate.now();
		System.out.println("current date = " + date);

		// Current date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("current dateTime = " + dateTime);

		// Current date and time upto end 
		LocalDateTime dateTimeCurrent = LocalDateTime.now();
		LocalDateTime dateTimeUptoEnd = date.atTime(LocalTime.MAX);
		System.out.println(dateTimeCurrent + " to  " + dateTimeUptoEnd);
		
		// format date into dd-MM-yyyy HH:mm:ss
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = dateTime.format(dateTimeFormatter);
		System.out.println("formattedDate = "+formattedDate);
		
		// get Date , Day , Week , Month , Year
		System.out.println("Date = "+dateTime.getDayOfMonth());
		System.out.println("Day = "+dateTime.getDayOfWeek());
		System.out.println("DAY OF THE WEEK = "+dateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println("DAY OF THE YEAR = "+dateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println("DAY OF THE MONTH = "+dateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("HOURS OF THE DAY = "+dateTime.get(ChronoField.HOUR_OF_DAY));
		System.out.println("MINUTE OF THE DAY = "+dateTime.get(ChronoField.MINUTE_OF_DAY)); 

		System.out.println("MONTH = "+dateTime.getMonthValue());

		// Create date after 5 days
		System.out.println("Before Date : " + date);
		System.out.println("After 5 Days : " + date.plusDays(5));
		
		// Create date before 5 days
		System.out.println("Before Date : " + date);
		System.out.println("After 5 Days : " + date.minusDays(5)); 
		
		// Print month and day
		MonthDay monthDay = MonthDay.now();
		System.out.println("Month and day "+monthDay);
		
		//OffsetTime
		OffsetTime offset = OffsetTime.now();  
		System.out.println("OffsetTime  : " + offset);
		//OffsetDateTime
		OffsetDateTime offsetDateTime = OffsetDateTime.now();  
		System.out.println("OffsetDateTime  : " + offsetDateTime);
		
		//Clock
		Clock c = Clock.systemDefaultZone();      
	    System.out.println("Default zone "+c.getZone());
	    
	    
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		LocalDate date1 = LocalDate.now();
		date1.atStartOfDay().atOffset(ZoneOffset.UTC).format(dtf);	
	    System.out.println(date1);
	    
	    TimeZone tz = TimeZone.getTimeZone("UTC");
	    
	    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
	   // dateTimeFormatter1.setTimeZone(tz);
		String formattedDate1 = dateTime.format(dateTimeFormatter1);
		System.out.println("formattedDate = "+formattedDate1);
		
		System.out.println(ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT) );
		
		System.out.println(ZonedDateTime.now( ZoneId.of( "Europe/Warsaw" ) )
        .truncatedTo( ChronoUnit.MINUTES )
        .format( DateTimeFormatter.ISO_DATE_TIME ));
	    

	}
}
