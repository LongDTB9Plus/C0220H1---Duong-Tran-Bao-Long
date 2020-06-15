package com.springboot.services;


import com.springboot.models.BlogPost;

import java.util.List;
import java.util.Optional;

public interface BlogServices {
    Optional<BlogPost> findById(Integer id);

    void save(BlogPost postBlog);

    List<BlogPost> findAll();

    void edit(BlogPost postBlog);

    void delete(BlogPost postBlog);

    List<BlogPost> findByBlogCategory_Id(Integer id);

    List<BlogPost> findByOrderByDateAsc();

    List<BlogPost> findByOrderByDateDesc();

//    List<BlogPost> findDistinctByAuthorContainingIgnoreCase(String search);
//
//    List<BlogPost> findDistinctByTitleContainingIgnoreCase(String search);

    //    List<BlogPost> findByDate_Year (Integer search);
    Optional<BlogPost> search(String type, String search);

}
