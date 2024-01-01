package Vidhit_Patel.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {
    @Autowired
    private ReviewService review_service;

    @PostMapping
    private ResponseEntity<Reviews> createReview(@RequestBody Map<String, String>payload)
    {
        return new ResponseEntity<Reviews>(review_service.createReview(payload.get("reviewBody"),  payload.get("imdbId")), HttpStatus.CREATED);
    }
}
