package com.springboot.repository;


import com.springboot.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPost,Integer> {
    List<BlogPost> findByBlogCategory_Id (Integer id);
    List<BlogPost> findByOrderByDateAsc ();
    List<BlogPost> findByOrderByDateDesc ();
    Optional<BlogPost> findBlogPostByAuthorContaining (String search);
    Optional<BlogPost> findDistinctByTitleContainingIgnoreCase (String search);
//    List<BlogPost> findByDate_Year
//            (Integer search);

}
