package com.springboot.repository;


import com.springboot.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPost,Integer> {
    List<BlogPost> findByBlogCategory_Id (Integer id);
    List<BlogPost> findByOrderByDateAsc ();
    List<BlogPost> findByOrderByDateDesc ();
    List<BlogPost> findBlogPostsByAuthorContainingOrderByIdAsc (String search);
    List<BlogPost> findBlogPostsByTitleContainingOrderByIdAsc (String search);
    List<BlogPost> findBlogPostsByDateContainingOrderByIdAsc (Date search);

}
