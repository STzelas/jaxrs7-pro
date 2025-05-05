package gr.aueb.cf.jax.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Το convention είναι κάθε controller
 * να τελείωνει σε Resource
 */

@Path("/hello")   // /api/hello άρα
public class HelloResource {

    @GET
    @Path("/cf")            // Η μέθοδος υπάρχει στο /api/hello/cf endpoint
    // Ότι packet παίρνει/δίνει payload
    // θα πρέπει να δηλώνουμε
    // τι είναι αυτό το payload
    // Αν είναι εισερχόμενο(request) έχουμε @Consumes
    // Αν είναι εξερχόμενο(response) έχουμε @Produces
    @Produces(MediaType.TEXT_PLAIN)
    public String Hello() {
        return "Hello From CF7!!";
    }
}
