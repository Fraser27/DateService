package org.sillachi.time.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.sillachi.model.TimeStampModel;
import org.springframework.beans.propertyeditors.ZoneIdEditor;


/**
 * @author Fraser Sequeira
 * @description Get ISO8601Timestamp
 */

public class TimestampUtils {

	/**
	 * Return an ISO 8601 combined date and time string for current date/time
	 * In IST format
	 * @return String with format "yyyy-MM-dd'T'HH:mm:ss'Z'"
	 */
	public static String getISO8601StringForCurrentDate() {
		Instant now = Instant.now();
		return now.toString().substring(0,now.toString().length()-1)+"+05:30[Asia/Calcutta]";
	}

	private TimestampUtils() {
	}
	
   public static void main(String[] args) {
	System.out.println(TimestampUtils.getISO8601StringForCurrentDate());
}
}