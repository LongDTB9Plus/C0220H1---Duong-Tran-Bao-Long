package ORM.services;

import ORM.models.BlogPost;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BlogServices {
    BlogPost findById(Integer id);

    String save(BlogPost postBlog);

    List<BlogPost> findAll();

    void edit(BlogPost postBlog);

    void delete(BlogPost postBlog);
}
