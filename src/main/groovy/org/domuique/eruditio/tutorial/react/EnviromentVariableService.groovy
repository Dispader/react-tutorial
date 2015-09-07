package org.domuique.eruditio.tutorial.react

import javax.ws.rs.*

@Path('environmentVariable')
class EnvironmentVariableService {
    @Produces(['application/json']) @GET def get() { System.getenv().sort() }
}
