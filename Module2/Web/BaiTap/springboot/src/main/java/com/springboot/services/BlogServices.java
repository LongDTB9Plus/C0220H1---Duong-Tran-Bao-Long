package com.springboot.services;


import com.springboot.models.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogServices {
    Optional<BlogPost> findById(Integer id);

    void save(BlogPost postBlog);

    Page<BlogPost> findAll(Pageable pageable);

    void edit(BlogPost postBlog);

    void delete(BlogPost postBlog);

    List<BlogPost> findByBlogCategory_Id(Integer id);

    List<BlogPost> findByOrderByDateAsc();

    List<BlogPost> findByOrderByDateDesc();

//    List<BlogPost> findDistinctByAuthorContainingIgnoreCase(String search);
//
//    List<BlogPost> findDistinctByTitleContainingIgnoreCase(String search);

    //    List<BlogPost> findByDate_Year (Integer search);
    List<BlogPost> search(String type, String search);

}
