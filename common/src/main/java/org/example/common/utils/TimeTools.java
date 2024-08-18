package org.example.common.utils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTools {

    private static final String YYYY_MM_DD_T_HH_MM_SS_SSS = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX'['VV']'";

    /**
     * @return 2024-08-16T00:24:28.077+08:00[Asia/Shanghai]
     */
    public static String getZoneDateTimeNow(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(YYYY_MM_DD_T_HH_MM_SS_SSS);
        return zonedDateTime.format(dateTimeFormatter);
    }

}
