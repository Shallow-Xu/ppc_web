package shallow.xu.ppc.api.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import shallow.xu.ppc.database.ArticleRepository;
import shallow.xu.ppc.database.entity.Article;

@Service
public class TextService {
    @Autowired
    private ArticleRepository articleRepository;


    public Page<Article> getTextList(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }
}
