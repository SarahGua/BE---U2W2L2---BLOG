package sarahguarneri.BEU2W2L2BLOG.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarahguarneri.BEU2W2L2BLOG.services.BlogService;
import sarahguarneri.BEU2W2L2BLOG.entities.Blog;

import java.util.List;

@RestController //definisce lista di endpoint
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    public BlogService blogService;

    // 1. get --> http://localhost:3001/blog
    // 2. post --> http://localhost3001/blog (+ body)
    // 3. put --> http://localhost3001/blog/:id (+ body)
    // 4. delete --> http://localhost3001/blog/:id
    // 5. get con :id --> http://localhost3001/blog/:id

    // 1. get --> http://localhost:3001/blog
    @GetMapping
    public List<Blog> getBlogs(){
        return blogService.getBlogs();
    };

    // 2. post --> http://localhost3001/blog (+ body)
    @PostMapping
    public Blog saveBlog(@RequestBody Blog body){
        return blogService.save(body);
    };

    // 3. put --> http://localhost3001/blog/:id (+ body)
    @PutMapping("/{id}")
    public Blog findByIdAndUpdate(@PathVariable int id, @PathVariable Blog body){
        return this.blogService.findByIdAndUpdate(id, body);
    }

    // 4. delete --> http://localhost3001/blog/:id
    @DeleteMapping("/{id}")
    public void findAndDelete(@PathVariable int id){
        this.blogService.findAndDelete(id);
    }

    // 5. get con :id --> http://localhost3001/blog/:id
    public Blog findById(@PathVariable int id){
        return blogService.findById(id);
    }
}
