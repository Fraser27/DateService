package org.sillachi.controller;

import org.sillachi.model.TimeStampModel;
import org.sillachi.time.utils.TimestampUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Fraser Sequeira
 *
 */
@Controller
public class FetchTimeController {

	private static int count=0;
	
	/** Return an ISO 8601 combined date and time string for current date/time along with 
	 *  number of times the service was called
	 * @return TimeStampModel
	 */
	@RequestMapping(value="/getTimeStamp",method=RequestMethod.GET)
	public @ResponseBody TimeStampModel getTimeStamp(){
		System.out.println("Fetch ISO 8601 Format Timestamp");
		String currentTimestamp = TimestampUtils.getISO8601StringForCurrentDate();
		TimeStampModel tsm = new TimeStampModel(currentTimestamp, ++count);
		return tsm;
	}
	
}
