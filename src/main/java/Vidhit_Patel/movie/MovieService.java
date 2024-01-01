package Vidhit_Patel.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movie_repo;
    public List<Movie> allMovie(){
        return movie_repo.findAll();
    }

    public Optional<Movie> singlemovie(String imdbId)
    {
        return movie_repo.findMovieByimdbId(imdbId);
    }
}
