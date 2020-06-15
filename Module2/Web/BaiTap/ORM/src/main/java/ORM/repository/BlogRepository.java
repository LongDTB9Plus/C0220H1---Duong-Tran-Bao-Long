package ORM.repository;

import ORM.models.BlogPost;

import java.util.List;

public interface BlogRepository {
    BlogPost findById(Integer id);

    String save(BlogPost postBlog);

    List<BlogPost> findAll();

    void edit(BlogPost postBlog);

    void delete(BlogPost postBlog);
}
