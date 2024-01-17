package sarahguarneri.BEU2W2L2BLOG.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W2L2BLOG.entities.Author;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {
}
