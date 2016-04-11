package pl.btbw.module.post;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/post")
public class PostController {

    @Inject
    private PostRepository postRepository;

    @GET
    @Path("/create")
    public String create() {
        postRepository.save(new Post("test 1"));
        postRepository.save(new Post("test 2"));
        postRepository.save(new Post("test 3"));
        return "ok";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post one(@PathParam("id") long id) {
        return postRepository.find(id);
    }

}
