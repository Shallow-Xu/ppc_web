package shallow.xu.ppc.database;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import shallow.xu.ppc.database.entity.Article;

/**
 * 持久层
 * 文章信息
 * @author shallow
 */
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    /**
     * 查询全部文章
     * @param pageable 分页信息
     * @return 文章信息列表
     */
    @Override
    @Query("select a from Article a order by a.articleId desc ")
    Page<Article> findAll(Pageable pageable);

}