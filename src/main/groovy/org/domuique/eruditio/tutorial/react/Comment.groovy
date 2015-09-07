package org.domuique.eruditio.tutorial.react

import javax.ws.rs.*
import javax.ws.rs.core.*

@Path('comment')
class Comment {
    
    private static List<Map> comments = [
        [ 'author': 'Niels Bohr',
          'text': 'An *expert* is a person who has made all the mistakes that can be made in a very narrow field.'],
        [ 'author': 'Albert Einstein',
          'text': '*Education* is what remains after one has forgotten what one has learned in school.' ]
    ]
    
    @Produces(MediaType.APPLICATION_JSON)
    @GET def get() { this.comments }
    
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @POST def post(@FormParam('author') String author,
                    @FormParam('text')   String text ) { 
        this.comments << [ 'author': author, 'text': text ]
    } 
}
