package sarahguarneri.BEU2W2L2BLOG.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarahguarneri.BEU2W2L2BLOG.entities.Author;
import sarahguarneri.BEU2W2L2BLOG.services.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    public AuthorService authorService;

    // 1. get --> http://localhost:3001/author
    // 2. post --> http://localhost3001/author (+ body)
    // 3. put --> http://localhost3001/author/:id (+ body)
    // 4. delete --> http://localhost3001/author/:id
    // 5. get con :id --> http://localhost3001/author/:id

    // 1. get --> http://localhost:3001/author
    @GetMapping
    public List<Author> getAutori(){
        return authorService.getAutori();
    };

    // 2. post --> http://localhost:3001/author (+ body)
    @PostMapping
    public Author saveAuthor(@RequestBody Author body){
        return authorService.save(body);
    };

    // 3. put --> http://localhost:3001/author/:id (+ body)
    @PutMapping("/{id}")
    public Author findByIdAndUpdate(@PathVariable int id, @PathVariable Author body){
        return this.authorService.findByIdAndUpdate(id, body);
    }

    // 4. delete --> http://localhost:3001/author/:id
    @DeleteMapping("/{id}")
    public void findAndDelete(@PathVariable int id){
        this.authorService.findAndDelete(id);
    }

    // 5. get con :id --> http://localhost:3001/author/:id
    public Author findById(@PathVariable int id){
        return authorService.findById(id);
    }
}
