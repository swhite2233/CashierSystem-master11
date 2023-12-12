package hust.mysql.utils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author muzong
 */
public class DateTimeUtil {
    public static Timestamp getTime(){
        Date date = new Date();
        return new Timestamp(date.getTime());
    }
}

