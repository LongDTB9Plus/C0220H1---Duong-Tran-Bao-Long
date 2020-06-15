package com.springboot.services.Impl;

import com.springboot.models.BlogPost;
import com.springboot.repository.BlogPostRepository;
import com.springboot.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServicesImpl implements BlogServices {
    @Autowired
    BlogPostRepository blogPostRepository;

    @Override
    public Optional<BlogPost> findById(Integer id) {
        return blogPostRepository.findById(id);
    }

    @Override
    public void save(BlogPost postBlog) {
        blogPostRepository.save(postBlog);
    }

    @Override
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public void edit(BlogPost postBlog) {
        blogPostRepository.save(postBlog);
    }

    @Override
    public void delete(BlogPost postBlog) {
        blogPostRepository.delete(postBlog);
    }

    @Override
    public List<BlogPost> findByBlogCategory_Id(Integer id) {
        return blogPostRepository.findByBlogCategory_Id(id);
    }

    @Override
    public List<BlogPost> findByOrderByDateAsc() {
        return blogPostRepository.findByOrderByDateAsc();
    }

    @Override
    public List<BlogPost> findByOrderByDateDesc() {
        return blogPostRepository.findByOrderByDateDesc();
    }

//    @Override
//    public List<BlogPost> findDistinctByAuthorContainingIgnoreCase(String search) {
//        return blogPostRepository.findDistinctByAuthorContainingIgnoreCase(search);
//    }
//
//    @Override
//    public List<BlogPost> findDistinctByTitleContainingIgnoreCase(String search) {
//        return blogPostRepository.findDistinctByTitleContainingIgnoreCase(search);
//    }

//    @Override
//    public List<BlogPost> findByDate_Year(Integer search) {
//        return blogPostRepository.findByDate_Year(search);
//    }

    @Override
    public Optional<BlogPost> search(String type, String search) {
        Optional<BlogPost> blogPostList = null;
        switch (type) {
            case "id":
                Integer searchID = Integer.parseInt(search);
                blogPostList = blogPostRepository.findById(searchID);
                break;
            case "title":
                blogPostList = blogPostRepository.findDistinctByTitleContainingIgnoreCase(search);
                break;
            case "author":
                blogPostList = blogPostRepository.findDistinctByAuthorContainingIgnoreCase(search);
                break;
            case "year":
//                blogPostList = blogPostRepository.findByDate_Year(Integer.parseInt(search));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return blogPostList;
    }
}
