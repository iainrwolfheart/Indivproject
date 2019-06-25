package Persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ptuploads {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String file_name;
    private String song_name;
    private String url_link;				//???????????????????????????????

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return file_name;
	}

	public void setFileName(String file_name) {
		this.file_name = file_name;
	}

	public String getSongName() {
		return song_name;
	}

	public void setSongName(String song_name) {
		this.song_name = song_name;
	}
	public String getURL() {
		return song_name;
	}

	public void setURL(String url_link) {
		this.url_link = url_link;
	}

}