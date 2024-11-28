import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Path to the movie file
        String moviePath = "data/Film.txt";
        //Opret scanner til brug i login
        Scanner scanner = new Scanner(System.in);




            // Opret en instans af FileUI
            FileIO fileIO = new FileIO();
            //List<Movie> movies = fileIO.readMovieData(moviePath);

            // Læs filmene fra filen
            List<Movie> movies = FileIO.readMovieData(moviePath);


            Menu.logIn(scanner);
                Menu.selectMovie(scanner,movies);
            // Print detaljer om hver film i en mere læselig form

        /*
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genres: " + String.join(", ", movie.getGenres())); // Hvis genres er en liste
            System.out.println("Rating: " + movie.getRating());
            System.out.println(); // For at lave et ekstra linjeskift mellem filmene


        */
        }
    }