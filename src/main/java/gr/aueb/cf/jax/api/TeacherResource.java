package gr.aueb.cf.jax.api;

import gr.aueb.cf.jax.dto.TeacherReadOnlyDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Controller
 */

@Path("/teachers")
public class TeacherResource {


    /**
     * Response είναι ο βασικός container της jakarta
     * για να επιστρέφουμε Response packets
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)  // response - @Produces / request - @Consumes
    public Response getTeacher(@PathParam("id")Long id) {  // data binding του param στο Long id
        TeacherReadOnlyDTO dto = new TeacherReadOnlyDTO(id, "12345", "Alice", "W.");

        // ή ok είναι static μέθοδος επιστρέφει status 200
        return Response.ok(dto).build();

        // Αυτή είναι η εκτεταμένη έκδοση
        // που είναι πιο flexible.
        // Όταν έχουμε 200αρι όμως είναι πιο εύκολο
        // το απο πάνω
//        return Response.status(Response.Status.OK)
//                .entity(dto)
//                .build();
    }
}
