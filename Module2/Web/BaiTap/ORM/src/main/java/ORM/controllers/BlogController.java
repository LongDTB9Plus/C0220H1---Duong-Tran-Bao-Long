package ORM.controllers;

import ORM.models.BlogPost;
import ORM.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class BlogController {
    @Autowired
    BlogServices blogServices;

    @GetMapping("/")
    public String getBlog(Model model) {
        model.addAttribute("postBlog", blogServices.findAll());
        return "main";
    }

    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("postBlog",new BlogPost());
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute BlogPost postBlog){
        blogServices.save(postBlog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable Integer id,Model model){
        model.addAttribute("postBlog",blogServices.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String postEdit(@ModelAttribute BlogPost postBlog){
        blogServices.edit(postBlog);
        return "redirect:/";
    }
}
