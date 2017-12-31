package shallow.xu.ppc.database;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import shallow.xu.ppc.database.entity.Article;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    @Query("select a from Article a order by a.addTime,a.articleId desc")
    Page<Article> findAll(Pageable pageable);
}
