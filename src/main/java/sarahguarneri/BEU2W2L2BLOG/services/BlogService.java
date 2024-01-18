package sarahguarneri.BEU2W2L2BLOG.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W2L2BLOG.DAO.BlogDAO;
import sarahguarneri.BEU2W2L2BLOG.entities.Author;
import sarahguarneri.BEU2W2L2BLOG.entities.Blog;
import sarahguarneri.BEU2W2L2BLOG.payload.NewBlogPayload;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogDAO blogDAO;

    @Autowired
    private AuthorService authorService;

//    public List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs(){
        return blogDAO.findAll();
    }

    //metodo save
    public Blog save(NewBlogPayload body){
        Author found = authorService.findById(body.getBlogAuthorId());
        Blog blogPost = new Blog();
        blogPost.setCategoria(body.getCategoria());
        blogPost.setContenuto(body.getContenuto());
        blogPost.setTitolo(body.getTitolo());
        blogPost.setCover(body.getCover());
        blogPost.setMinutiLettura(body.getMinutiLettura());
//        Random rndm = new Random();
//        body.setId(rndm.nextInt(100, 1000));
//        this.blogs.add(body);
        return blogDAO.save(blogPost);
    }

    public Blog findByIdAndUpdate(int id, Blog body) {
        Blog found = this.findById(id);
        found.setId(id);
        found.setCategoria(body.getCategoria());
        found.setContenuto(body.getContenuto());
        found.setTitolo(body.getTitolo());
        found.setCover(body.getCover());
        found.setTitolo(body.getTitolo());
        return blogDAO.save(found);
    }

    public void findAndDelete(int id){
        Blog found = this.findById(id);
        blogDAO.delete(found);
    }

    public Blog findById(int id) {
        return blogDAO.findById(id).orElseThrow(() -> new RuntimeException("erroreeeee"));
    }
}
