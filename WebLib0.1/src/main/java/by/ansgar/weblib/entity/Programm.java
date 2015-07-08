package by.ansgar.weblib.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programm_web")
public class Programm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "picture")
	private String picture;
	@Column(name = "developer")
	private String developer;
	@Column(name = "website")
	private String website;
	@Column(name = "language")
	private String language;
	@Column(name = "platorm")
	private String platform;
	@Column(name = "format")
	private String format;
	@Column(name="title")
	private String title;

	public Programm() {

	}

	public Programm(long id, String picture, String developer, String website,
			String language, String platform, String format, String title) {
		this.id = id;
		this.developer = developer;
		this.website = website;
		this.language = language;
		this.platform = platform;
		this.format = format;
		this.picture = picture;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
