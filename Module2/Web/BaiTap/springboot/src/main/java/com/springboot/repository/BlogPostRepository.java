package com.springboot.repository;


import com.springboot.models.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost,Integer> {
    Page<BlogPost> findByBlogCategory_Id (Pageable pageable,Integer id);
    Page<BlogPost> findByOrderByDateAsc (Pageable pageable);
    Page<BlogPost> findByOrderByDateDesc (Pageable pageable);
    Page<BlogPost> findBlogPostsByAuthorContainingOrderByIdAsc (String search,Pageable pageable);
    Page<BlogPost> findBlogPostsByTitleContainingOrderByIdAsc (String search,Pageable pageable);
    List<BlogPost> findBlogPostsByDateContainingOrderByIdAsc (Date search);
}
