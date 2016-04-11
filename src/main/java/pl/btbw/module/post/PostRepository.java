package pl.btbw.module.post;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PostRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Post post) {
        em.persist(post);
        em.flush();
    }

    public Post find(long id) {
        return em.find(Post.class, id);
    }
}
