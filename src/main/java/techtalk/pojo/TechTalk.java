package techtalk.pojo;

import java.sql.Time;
import java.util.Date;

public class TechTalk {
	private int techid;
	private String venue;
	private String speaker;
	private Date date;
	private Time time;
	private String title;
	private String Description;
	public TechTalk() {
		// TODO Auto-generated constructor stub
	}
	public TechTalk(int techid, String venue, String speaker, Date date, Time time, String title, String description) {
		
		this.techid = techid;
		this.venue = venue;
		this.speaker = speaker;
		this.date = date;
		this.time = time;
		this.title = title;
		this.Description = description;
	}
	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return String.format("TechTalk [techid=%s, venue=%s, speaker=%s, date=%s, time=%s, title=%s, Description=%s]",
				techid, venue, speaker, date, time, title, Description);
	}
   
}
