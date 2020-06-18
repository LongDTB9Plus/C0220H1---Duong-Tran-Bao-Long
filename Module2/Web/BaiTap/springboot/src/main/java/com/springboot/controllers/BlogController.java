package com.springboot.controllers;


import com.springboot.models.BlogPost;
import com.springboot.services.BlogCategoryServices;
import com.springboot.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
    public String getBlog(Model model, @PageableDefault(size = 2) Pageable pageable,
                          @RequestParam Optional<Integer> category,
                          @RequestParam Optional<String> searchType,
                          @RequestParam Optional<String> search,
                          @RequestParam Optional<String> type, @RequestParam Optional<Integer> page) {
        if (category.isPresent()) {
            Integer id = category.get();
            return ("redirect:/sort/" + id + "?page=" + page.get());
        }
        if ((searchType.isPresent()) && (search.isPresent())) {
            if ((!searchType.get().isEmpty()) && (!search.get().isEmpty())) {
                return ("redirect:/search?search=" + search.get() + "&searchType=" + searchType.get() + "&page=" + page.get());
            }
        }
        if (type.isPresent()) {
            if (!type.get().isEmpty()) {
                return ("redirect:/order/" + type.get() + "?page=" + page.get());
            }
        }
        model.addAttribute("postBlog", blogServices.findAll(pageable));
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        return "main";
    }

    @GetMapping("/sort/{id}")
    public String getSortBlogByCategory(@PathVariable Integer id, Model model,
                                        @RequestParam(required = false) Integer page,
                                        @RequestParam(required = false) Integer pageSize ) {
        Pageable pageable = PageRequest.of((page == null ? 0 : page), (pageSize == null ? 2 : pageSize));
        model.addAttribute("postBlog", blogServices.findByBlogCategory_Id(pageable, id));
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        model.addAttribute("category", id);
        return "main";
    }

    @GetMapping("/search")
    public String getSearch(@RequestParam String searchType, @RequestParam String search, Model model,
                            @PageableDefault(size = 2) Pageable pageable) {
        Page<BlogPost> blogPostList = blogServices.search(searchType, search, pageable);
        if (blogPostList.isEmpty()) {
            model.addAttribute("message", "Not Found!");
        } else {
            model.addAttribute("postBlog", blogPostList);
        }
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        model.addAttribute("searchType", searchType);
        model.addAttribute("search", search);
        return "main";
    }

    @GetMapping("/order/{type}")
    public String getSortBlogByOrder(@PathVariable String type, Model model,
                                     @RequestParam(required = false) Integer page,
                                     @RequestParam(required = false) Integer pageSize ) {
        Pageable pageable = PageRequest.of((page == null ? 0 : page), (pageSize == null ? 2 : pageSize));
        switch (type) {
            case "asc":
                model.addAttribute("postBlog", blogServices.findByOrderByDateAsc(pageable));
                break;
            case "desc":
                model.addAttribute("postBlog", blogServices.findByOrderByDateDesc(pageable));
                break;
        }
        model.addAttribute("listCategory", blogCategoryServices.findAll());
        model.addAttribute("type", type);
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
