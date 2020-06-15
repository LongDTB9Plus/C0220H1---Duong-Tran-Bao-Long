package com.springboot.controllers;


import com.springboot.models.BlogPost;
import com.springboot.services.BlogCategoryServices;
import com.springboot.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogServices blogServices;
    @Autowired
    BlogCategoryServices blogCategoryServices;

    @GetMapping("/")
    public String getBlog(Model model) {
        model.addAttribute("postBlog", blogServices.findAll());
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "main";
    }

    @GetMapping("/sort/{id}")
    public String getSortBlogByCategory(@PathVariable Integer id, Model model) {
        model.addAttribute("postBlog", blogServices.findByBlogCategory_Id(id));
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "main";
    }

    @GetMapping("/search")
    public  String getSearch(@RequestParam String searchType,@RequestParam String search,Model model){
        Optional<BlogPost> blogPostList = blogServices.search(searchType,search);
        if (!blogPostList.isPresent()){
            model.addAttribute("message","Not Found!");
        }else model.addAttribute("postBlog",blogPostList);
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "main";
    }

    @GetMapping("/order/{type}")
    public String getSortBlogByOrder(@PathVariable String type,Model model){
        switch (type){
            case "asc":
                model.addAttribute("postBlog",blogServices.findByOrderByDateAsc());
                break;
            case "desc":
                model.addAttribute("postBlog",blogServices.findByOrderByDateDesc());
                break;
        }
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "main";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("postBlog", new BlogPost());
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute BlogPost postBlog) {
        blogServices.save(postBlog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("postBlog", blogServices.findById(id));
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String postEdit(@ModelAttribute BlogPost postBlog) {
        blogServices.edit(postBlog);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String getDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("postBlog", blogServices.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String postDelete(@ModelAttribute BlogPost postBlog) {
        blogServices.delete(postBlog);
        return "redirect:/";
    }
}
