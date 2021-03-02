package nl.han.dea;

import nl.han.dea.services.dto.ItemDTO;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/items")
public class ItemRecourse {

    @Path("/1")
    @GET
    @Produces("text/plain")
    public String item() {
        return "Bread, Butter";
    }

    @Path("/2")
    @GET
    @Produces("application/json")
    public String itemsJSON() {
        return "[\"bread\", \"butter\"]";
    }

}
