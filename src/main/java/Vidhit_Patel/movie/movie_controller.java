package Vidhit_Patel.movie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*")
public class movie_controller {
    @Autowired
    private MovieService movieservice;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieservice.allMovie(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getsingleMovie(@PathVariable String imdbId)
    {
        return new ResponseEntity<Optional<Movie>>(movieservice.singlemovie(imdbId), HttpStatus.OK);
    }

}
