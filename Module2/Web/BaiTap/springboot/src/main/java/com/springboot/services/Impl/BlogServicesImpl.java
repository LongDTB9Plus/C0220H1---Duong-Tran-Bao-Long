package com.springboot.services.Impl;

import com.springboot.models.BlogPost;
import com.springboot.repository.BlogPostRepository;
import com.springboot.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sun.util.calendar.BaseCalendar;

import java.time.LocalDate;
import java.util.*;

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
    public Page<BlogPost> findAll(Pageable pageable) {
        return blogPostRepository.findAll(pageable);
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
    public List<BlogPost> search(String type, String search) {
        List<BlogPost> blogPostList = null;
        switch (type) {
            case "id":
                Integer searchID = Integer.parseInt(search);
                List<Integer> searchIDs = new ArrayList<>();
                searchIDs.add(searchID);
                blogPostList = blogPostRepository.findAllById(searchIDs);
                break;
            case "title":
                blogPostList = blogPostRepository.findBlogPostsByTitleContainingOrderByIdAsc(search);
                break;
            case "author":
                blogPostList = blogPostRepository.findBlogPostsByAuthorContainingOrderByIdAsc(search);
                break;
            case "year":
//                blogPostList = blogPostRepository.findBlogPostsByDateContainingOrderByIdAsc(searchIDf);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return blogPostList;
    }
}
