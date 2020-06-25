package com.springboot.services.Impl;

import com.springboot.models.BlogPost;
import com.springboot.repository.BlogPostRepository;
import com.springboot.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
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
    public Page<BlogPost> findByBlogCategory_Id(Pageable pageable,Integer id) {
        return blogPostRepository.findByBlogCategory_Id(pageable,id);
    }

    @Override
    public List<BlogPost> findByBlogCategory_Id(Integer id) {
        return blogPostRepository.findByBlogCategory_Id(id);
    }

    @Override
    public Page<BlogPost> findByOrderByDateAsc(Pageable pageable) {
        return blogPostRepository.findByOrderByDateAsc(pageable);
    }

    @Override
    public Page<BlogPost> findByOrderByDateDesc(Pageable pageable) {
        return blogPostRepository.findByOrderByDateDesc(pageable);
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
    public Page<BlogPost> search(String type, String search,Pageable pageable) {
        Page<BlogPost> blogPostList = null;
        switch (type) {
            case "id":
                Integer searchID = Integer.parseInt(search);
//                List<Integer> searchIDs = new ArrayList<>();
//                searchIDs.add(searchID);
                List<BlogPost> blogPost = new ArrayList<>();
                blogPost.add(blogPostRepository.findById(searchID).get());
                blogPostList = new PageImpl<>(blogPost, pageable, 1);
                break;
            case "title":
                blogPostList = blogPostRepository.findBlogPostsByTitleContainingOrderByIdAsc(search,pageable);
                break;
            case "author":
                blogPostList = blogPostRepository.findBlogPostsByAuthorContainingOrderByIdAsc(search,pageable);
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
