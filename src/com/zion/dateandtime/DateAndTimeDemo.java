package com.zion.dateandtime;

import java.time.*;

public class DateAndTimeDemo {
    public static void main(String[] args) {
       /* LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        LocalDate date = LocalDate.now();
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy= date.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
*/

//       LocalTime time = LocalTime.now();
//        System.out.println(time.getHour()+":"+time.getMinute()+":"
//                                                                +time.getSecond()+":"+time.getNano());



//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.getDayOfMonth());


//        LocalDate birthDAte = LocalDate.of(1994,4,8);
//        LocalDate today = LocalDate.now();
//        Period period = Period.between(birthDAte,today);
//        System.out.println("Your age is "+period.getYears()+" years "+period.getMonths()+" months " +period.getDays()+" days");
//
//        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId);
//
        ZoneId LosAngles = ZoneId.of("America/Phoenix");
        System.out.println( ZonedDateTime.now(LosAngles));


    }
}
