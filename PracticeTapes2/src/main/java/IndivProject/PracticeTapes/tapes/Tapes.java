package IndivProject.PracticeTapes.tapes;

import java.sql.Date;
//import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tapes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Integer trackNo;
	private String songName;
	private String urlLink;  
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private long uploadDate;
	
	
	public Integer getTrackNo() {
		return trackNo;
	}
	public void setTrackNo(Integer trackNo) {
		this.trackNo = trackNo;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getUrlLink() {
		return urlLink;
	}
	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}
	public long getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate.getTime();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id; 
	}
}
