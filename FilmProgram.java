import java.util.List;
import java.util.List;

    public class FilmProgram {
        private String titel;
        private int year;
        private List<String> genre;  // Use a List<String> for multiple genres
        private double rating;

        // Constructor
        public FilmProgram(String titel, int year, String genre, double rating) {
            this.titel = titel;
            this.year = year;

            // Split genre into a list if it's a comma-separated string
            this.genre = List.of(genre.split(","));

            this.rating = rating;
        }

        // Getter methods
        public String getTitel() {
            return titel;
        }

        public int getYear() {
            return year;
        }

        public List<String> getGenre() {
            return genre;
        }

        public double getRating() {
            return rating;
        }

        // Overridden toString method for displaying the film information
        @Override
        public String toString() {
            return titel + " (" + year + ") - Genre: " + String.join(", ", genre) + " - Rating: " + rating;
            //String join skal slettes vi har ik haft om det før
        }
    }


