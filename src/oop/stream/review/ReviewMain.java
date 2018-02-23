package oop.stream.review;

import oop.stream.review.controller.Summarizer;
import oop.stream.review.model.Review;
import oop.stream.review.model.Summary;
import oop.stream.review.parser.ReviewParser;
import oop.stream.review.view.Displayer;

import java.util.List;

public class ReviewMain {

    public static void main(String[] args) {
        // translate the file into a List of Reviews
        // read the file into lines
        // translate lines into Reviews

        ReviewParser parser = new ReviewParser();
        List<Review> reviews = parser.getReviews();
        //reviews.forEach(e -> System.out.println(e));

        // get answers from the List of Reviews

        Summarizer summarizer = new Summarizer();
        Summary summary = summarizer.summarize(reviews);

        // display the summary
        Displayer displayer = new Displayer();
        displayer.display(summary);
    }

}
