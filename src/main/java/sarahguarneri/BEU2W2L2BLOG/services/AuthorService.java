package sarahguarneri.BEU2W2L2BLOG.services;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

//    @Autowired
//    private AuthorDAO authorDAO;
//
//
//
//    public List<Author> getAutori(){
//        return authorDAO.findAll();
//    }
//
//    public Author save(Author body){
//        return authorDAO.save(body);
//    }
//
//    public Author findByIdAndUpdate(int id, Author  body){
//        Author found = this.findById(id);
//        found.setId(id);
//        found.setNome(body.getNome());
//        found.setEmail(body.getEmail());
//        found.setCognome(body.getCognome());
//        found.setAvatar(body.getAvatar());
//        found.setDataDiNascita(body.getDataDiNascita());
//        return authorDAO.save(body);
//
//    }
//
//    public void findAndDelete(int id){
//        Author found = this.findById(id);
//        authorDAO.delete(found);
//    }
//
//    public Author findById(int id){
//        return authorDAO.findById(id).orElseThrow(() -> new RuntimeException("erroreeroore"));
//    }
}
