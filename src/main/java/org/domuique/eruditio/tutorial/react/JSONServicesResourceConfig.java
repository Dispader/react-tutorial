package org.domuique.eruditio.tutorial.react;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("service")
class JSONServicesResourceConfig extends ResourceConfig {
    public JSONServicesResourceConfig() {
        packages("org.domuique.eruditio.tutorial.react");
    }
}
