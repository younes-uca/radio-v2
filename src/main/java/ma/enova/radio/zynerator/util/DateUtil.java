package ma.enova.radio.zynerator.util;

import ma.enova.radio.zynerator.exception.BusinessRuleException;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtil {

    public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
    public static final String DEFAULT_DATE_FORMAT_SQL = "yyyy-MM-dd";
    public static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm";
    public static final String DATE_TIME_FORMAT_FOR_BEAN = "yyyy-MM-dd'T'HH:mm";
    public static final String DATE_TIME_FORMAT_SQL = "dd/MM/yyyy HH:mm";
    // public static final String DATE_FORMAT_WITH_HOUR = "dd/MM/yyyy HH:mm";
    public static final String DATE_FORMAT_WITH_HOUR = "dd/MM/yyyy HH:mm";
    public static final String DATE_FORMAT_WITH_HOUR_FROM_BEAN = "MM/dd/yyyy HH:mm";
    public static final String DATE_FORMAT_NAME = "ddMMyyyyHHmmss";
    public final static String DATE_FORMAT_FILE = "yyMMddHHmmss";
    public static final String HOUR_FORMAT = "HH:mm:ss";
    public static final String DATE_FORMAT_ENG = "EEE MMM dd yyyy HH:mm:ss 'GMT'z";
    public static final String DATE_FORMAT_PF = "EEE MMM dd HH:mm:ss z yyyy";
    public static final long ONE_HOUR = 60 * 60 * 1000L;


    public static Calendar dateToCalendar(final Date date) {
        if (date != null) {
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);
            return cal;
        }
        return null;
    }

    public static LocalDateTime addDaysToDate(LocalDateTime date, long days) {
        if (date != null)
            return date.plusDays(days);
        return null;
    }

    public static long daysBetween(Date d1, Date d2) {
        return ((d2.getTime() - d1.getTime() + ONE_HOUR) / (ONE_HOUR * 24));
    }

    public static LocalDateTime stringEnToDate(final String strDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        return LocalDateTime.parse(strDate, formatter);

    }

    public static String getCurrentDate() {
        return dateToString(LocalDate.now());
    }

    public static String getCurrentDateTime() {
        return dateTimeToString(LocalDateTime.now());
    }

    public static LocalDate stringToDate(final String strDate) {
        if (StringUtils.hasLength(strDate)) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
                formatter = formatter.withZone(ZoneId.systemDefault()); // Set the time zone to UTC
                LocalDate date = LocalDate.parse(strDate, formatter);
                return date;

            } catch (Exception e) {
                throw new BusinessRuleException("errors.format.date");
            }
        }

        return null;
    }

    public static LocalDateTime stringTextToDate(final String strDate) {
        if (StringUtils.hasLength(strDate)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_PF, Locale.US);
            return LocalDateTime.parse(strDate, formatter);
        }

        return null;
    }
    public static LocalDateTime stringTextToSimpleDate(final String strDate) {
        if (StringUtils.hasLength(strDate)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
            return LocalDateTime.parse(strDate, formatter);
        }

        return null;
    }

    public static LocalDateTime stringToDateTime(final String strDate) {
        try {
            if (StringUtils.hasLength(strDate)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_WITH_HOUR_FROM_BEAN);
                return LocalDateTime.parse(strDate, formatter);
            }
        } catch (Exception e) {
            throw new BusinessRuleException("errors.format.datetime");
        }

        return null;
    }

    public static Timestamp stringToTimestamp(final String strDate) {
        if (StringUtils.hasLength(strDate)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
            return new Timestamp(
                    LocalDateTime.parse(strDate, formatter).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        }
        return null;
    }

    public static String dateFormatFichier() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_FILE);
        return LocalDateTime.now().format(formatter);
    }

    public static Long stringToLongTime(final String strDate) {
        if (StringUtils.hasLength(strDate)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
            return LocalDateTime.parse(strDate, formatter).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
        return null;
    }

    public static String dateToString(final LocalDate date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
            return date.format(formatter);
        }
        return "";
    }

    public static String dateToString(final LocalDateTime date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return date.format(formatter);
        }
        return "";
    }
    public static String dateToStringForBean(final LocalDateTime date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT_FOR_BEAN);
            return date.format(formatter);
        }
        return "";
    }

    /*
        public static String dateTimeToString(final LocalDateTime date) {
            try {
                if (date != null) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_WITH_HOUR);
                    return date.format(formatter);
                }
            } catch (Exception e) {
                return null;
            }
            return null;
        }
    */
    public static String dateTimeToString(final LocalDateTime date) {
        try {
            if (date != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_WITH_HOUR, Locale.ENGLISH);
                OffsetDateTime off = OffsetDateTime.of(date, ZoneOffset.UTC);
              //  ZonedDateTime zoned = off.atZoneSameInstant(ZoneId.of("UTC+1"));
                ZonedDateTime zoned = off.atZoneSameInstant(ZoneId.of("UTC+1"));
                return zoned.toLocalDateTime().format(formatter);
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public static String dateTimeToString(final LocalDate date) {
        try {
            if (date != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
                return date.format(formatter);
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public static String dateToStringWithHour(final LocalDateTime date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_WITH_HOUR);
            return date.format(formatter);
        }
        return "";
    }

    public static String dateToStringWithHour(final Long d) {
        if (d != null && d != 0) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_WITH_HOUR);
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(d), ZoneId.systemDefault());
            return date.format(formatter);
        }
        return "";
    }

    public static String timesTimpToStringWithHour(final Timestamp d) {
        if (d != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(d.getTime()), ZoneId.systemDefault());
            return date.format(formatter);
        }
        return "";
    }

    public static String timesTimpToStringWithHour(final Long d) {
        if (d != null) {
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(d), ZoneId.systemDefault());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return date.format(formatter);
        }
        return "";
    }

    public static String timesTimpToStringWithHourName(final Timestamp d) {
        if (d != null) {
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(d.getTime()), ZoneId.systemDefault());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_NAME);
            return date.format(formatter);
        }
        return "";
    }

    public static String timesTimpToHour(final Timestamp d) {
        if (d != null) {
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(d.getTime()), ZoneId.systemDefault());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(HOUR_FORMAT);
            return date.format(formatter);
        }
        return "";
    }

    public static Timestamp StringToTimesTimpWithHour(final String date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return new Timestamp(
                    LocalDateTime.parse(date, formatter).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());

        }
        return null;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public static LocalDate addFrequence(LocalDate dateDebutTraitement, int i, String code) {
        LocalDate myLocalDateTime = null;
        if ("heure".equals(code)) {
            //myLocalDateTime = dateDebutTraitement.pl(i);
        } else if ("jour".equals(code)) {
            myLocalDateTime = dateDebutTraitement.plusDays(i);
        } else if ("semaine".equals(code)) {
            myLocalDateTime = dateDebutTraitement.plusWeeks(i);
        } else if ("mois".equals(code)) {
            myLocalDateTime = dateDebutTraitement.plusMonths(i);
        }else
        	myLocalDateTime = dateDebutTraitement.plusDays(i);
        return myLocalDateTime;
    }

    public static boolean isBeforeNow(LocalDate dateSouhaiteDebutTraitement) {
        return dateSouhaiteDebutTraitement.isBefore(LocalDate.now());
    }
}
