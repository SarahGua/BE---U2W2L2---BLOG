package sarahguarneri.BEU2W2L2BLOG.services;

import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W2L2BLOG.entities.Blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogService {

    public List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs(){
        return this.blogs;
    }

    //metodo save
    public Blog save(Blog body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(100, 1000));
        this.blogs.add(body);
        return body;
    }

    public Blog findByIdAndUpdate(int id, Blog body) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                found = blog;
                found.setId(id);
                found.setCategoria(blog.getCategoria());
                found.setContenuto(blog.getContenuto());
                found.setTitolo(blog.getTitolo());
                found.setCover(blog.getCover());
                found.setTitolo(blog.getTitolo());
            }
        }
        if (found == null) {
            throw new RuntimeException("ID non trovato");
        }
        return found;
    }

    public void findAndDelete(int id){
        Iterator<Blog> iterator = this.blogs.iterator();
        while(iterator.hasNext()){
            Blog current = iterator.next();
            if(current.getId() == id){
                iterator.remove();
            }
        }
    }

    public Blog findById(int id) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                found = blog;
            }
        }
        if (found == null) {
            throw new RuntimeException("ID non trovato");
        }
        return found;
    }
}
