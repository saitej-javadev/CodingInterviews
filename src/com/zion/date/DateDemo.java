package com.zion.date;
//2021-10-05 00:00:00
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//parse converts String to Date
// format converts Date into Specified Date format
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = "2021-10-05 00:00:00";
        System.out.println(sdf.format(sdf.parse(strDate)));





    }
}
