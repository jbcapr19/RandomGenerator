package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MoviesArrayList {
    public static void main(String[] args) {

        // Prompt the user to enter the name of their favorite movie
        // Continue asking and adding until user types "q"
        ArrayList<String> movies = new ArrayList<>();
        String userInput = "";
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("What is your favorite movie? Press Q to quit.");
            userInput = keyboard.nextLine();

            // Add the movie to the list unless userInput was "q"
            if(!userInput.equalsIgnoreCase("q")){
                movies.add(userInput);
            }
        }
        while(!userInput.equalsIgnoreCase("q"));


        // Once user types "q", print the list of movies
        System.out.println("\nList of movies: ");
        for(int i=0; i<movies.size(); i++){
            System.out.println(movies.get(i));
        }


        // BONUS:
        // Sort movie list in alphabetical order
        // Remember to import Collections Library
        Collections.sort(movies);


        // Print after sort
        System.out.println("\nList of movies in alphabetical order: ");
        int index = 0;
        while(movies.size()>index){
            System.out.println(movies.get(index));
            index++;
        }

        // Print after shuffle
        Collections.shuffle(movies);
        System.out.println("\nList of movies in shuffled order: ");
        System.out.println(movies);


        // BONUS x2:
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(movies.size());
        System.out.println("\nHere is a movie suggestion for tonight!");
        System.out.println(movies.get(randomIndex));


        // Exit
        keyboard.close();
        System.exit(0);
    }
}