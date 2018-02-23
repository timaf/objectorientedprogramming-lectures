package oop.stream.review.controller;

import oop.stream.review.model.Review;
import oop.stream.review.model.Summary;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Summarizer {

    public Summary summarize(List<Review> reviews) {


        // the 3 most rated recipies
        List<String> most3ratedReviews = reviews.stream()
                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(3)
                .map(e -> e.getRecipe() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());

        // feedback word that was used the most
        Map<String, Long> appearances = reviews.stream()
                .map(review -> review.getFeedback())
                .flatMap(feedback -> feedback.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


        List<String> topFeedbackWord = appearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());



        // display 3 most rated recipies
        System.out.println("3 most rated recipies:");
        most3ratedReviews.forEach(review -> System.out.println(review));
        System.out.println(" ------ ");

        // display the most feedback appearing word
        System.out.println("most feedback appearing word: ");
        topFeedbackWord.forEach(word -> System.out.println(word));

        return new Summary();
    }

}
