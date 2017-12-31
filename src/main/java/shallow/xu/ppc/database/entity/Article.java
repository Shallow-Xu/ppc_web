package shallow.xu.ppc.database.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "site", nullable = false)
    private Integer site;
    @Column(name = "article_id", nullable = false)
    private Integer articleId;
    @Column(name = "article_url")
    private String url;
    @Column(name = "content")
    private String content;
    @Column(name = "add_time")
    private Timestamp addTime;


}
