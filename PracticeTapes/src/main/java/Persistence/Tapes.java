package Persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tapes {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String song_name;
    private String url_link;

    public Tapes() {
    	
    }
    
    public Tapes(Integer id, String song_name, String url_link) 
	{
		this.id = id;
		this.song_name = song_name;
		this.url_link = url_link;
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSongName() {
		return song_name;
	}

	public void setSongName(String song_name) {
		this.song_name = song_name;
	}
	public String getURL() {
		return url_link;
	}

	public void setURL(String url_link) {
		this.url_link = url_link;
	}

}