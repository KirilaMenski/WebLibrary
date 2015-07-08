package by.ansgar.weblib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "link_news_com_web")
public class LinkNewsCom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@ManyToOne
	@JoinColumn(name = "news_id",referencedColumnName = "id")
	private News news;
	@ManyToOne
	@JoinColumn(name = "com_id", referencedColumnName = "id")
	private NewsComments newsCom;

	public LinkNewsCom() {

	}

	public LinkNewsCom(long id, News news, NewsComments newsCom) {
		this.id = id;
		this.news = news;
		this.newsCom = newsCom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsComments getNewsCom() {
		return newsCom;
	}

	public void setNewsCom(NewsComments newsCom) {
		this.newsCom = newsCom;
	}
}
