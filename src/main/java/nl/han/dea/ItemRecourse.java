package nl.han.dea;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/items")
public class ItemRecourse {

    @GET
    @Produces("text/plain")
    public String items() {
        return "Bread, Butter";
    }

}
