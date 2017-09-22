package shallow.xu.ppc.database.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "article")
public class Article {

    private Integer id;
    private Integer site;
    private Integer articleIdd;
    private String url;
    private String content;
    private Timestamp addTime;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site", nullable = false)
    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }

    @Column(name = "article_id", nullable = false)
    public Integer getArticleIdd() {
        return articleIdd;
    }

    public void setArticleIdd(Integer articleIdd) {
        this.articleIdd = articleIdd;
    }

    @Column(name = "article_url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "add_time")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }
}
