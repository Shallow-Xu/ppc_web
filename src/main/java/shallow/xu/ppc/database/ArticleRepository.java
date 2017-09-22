package shallow.xu.ppc.database;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import shallow.xu.ppc.database.entity.Article;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    Page<Article> findAll(Pageable pageable);
}
