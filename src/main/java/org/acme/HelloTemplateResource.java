package org.acme;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-template")
public class HelloTemplateResource {

    @Inject
    Template hello; // corresponds to templates/hello.txt

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public TemplateInstance get() {
        return hello.data("name", "Quarkus");
    }
}
