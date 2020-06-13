package ORM.services.Impl;

import ORM.models.BlogPost;
import ORM.repository.BlogRepository;
import ORM.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServicesImpl implements BlogServices {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public BlogPost findById(Integer id) {
        return blogRepository.findById(id);
    }

    @Override
    public String save(BlogPost blogPost) {
        return blogRepository.save(blogPost);
    }

    @Override
    public List<BlogPost> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void edit(BlogPost postBlog) {
        blogRepository.edit(postBlog);
    }
}
