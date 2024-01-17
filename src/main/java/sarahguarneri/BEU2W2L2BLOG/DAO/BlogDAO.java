package sarahguarneri.BEU2W2L2BLOG.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W2L2BLOG.entities.Blog;

@Repository
public interface BlogDAO extends JpaRepository<Blog, Integer> {
}
