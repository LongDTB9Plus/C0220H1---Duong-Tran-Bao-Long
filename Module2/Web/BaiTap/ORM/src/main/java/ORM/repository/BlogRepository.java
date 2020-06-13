package ORM.repository;

import ORM.models.BlogPost;

import java.util.List;

public interface BlogRepository {
    BlogPost findById(Integer id);

    String save(BlogPost blogPost);

    List<BlogPost> findAll();

    void edit(BlogPost blogPost);
}
