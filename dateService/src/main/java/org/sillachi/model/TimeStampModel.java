package org.sillachi.model;

/**
 * @author Fraser Sequeira
 * 
 * @Description Store TimeStampModel 
 */
public class TimeStampModel {

	String timeStamp;
	String calls;
	
	public TimeStampModel(String timeStamp,Integer count) {
		this.timeStamp=timeStamp;
		this.calls=String.valueOf(count);
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getCalls() {
		return calls;
	}
	public void setCalls(String calls) {
		this.calls = calls;
	}
	
	
	
}
