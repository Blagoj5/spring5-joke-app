package baze.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfig {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){

        return new ChuckNorrisQuotes();

    }


}
