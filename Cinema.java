package zotau.homework;

import java.util.*;

public class Cinema {
    Map<Integer, List<Movie>> cinemaMap; // TreeMap

    public boolean addMovie(Movie movie) {
        if (cinemaMap.containsKey(movie.getYear())) {
            List<Movie> movieList = cinemaMap.get(movie.getYear());
            if (!movieList.contains(movie)) {
                movieList.add(movie);
                cinemaMap.put(movie.getYear(), movieList);
                return true;
            } else {
                return false;
            }
        } else {
            List<Movie> movieList = new ArrayList<>();
            movieList.add(movie);
            cinemaMap.put(movie.getYear(), movieList);
            return true;
        }
    }

    public List<Movie> getMoviesByYear(int year) {
        return cinemaMap.getOrDefault(year, new ArrayList<Movie>());
    }


    public List<Movie> getMoviestByYearAndMonth(int year, int month) {
        List<Movie> moviesByYear = this.getMoviesByYear(year);
        List<Movie> moviesByYearAndMonth = new ArrayList<>();
        for (Movie movie : moviesByYear) {
            if (movie.getMonth() == month) {
                moviesByYearAndMonth.add(movie);
            }
        }
        return moviesByYearAndMonth;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        List<Movie> allMovies = this.allMoviesInCinema();
        List<Movie> moviesByGenre = new ArrayList<>();
        for (Movie movie : allMovies) {
            if (movie.getGenre().equals(genre)) {
                moviesByGenre.add(movie);
            }
        }
        return moviesByGenre;
    }

    List<Movie> topMovies() {
        List<Movie> allMovies = this.allMoviesInCinema();
        Collections.sort(allMovies);
        Collections.reverse(allMovies);
        List<Movie> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(allMovies.get(i));
        }
        return result;
    }

    public List<Movie> allMoviesInCinema() {
        List<Movie> allMovies = new ArrayList<>();
        for (Map.Entry<Integer, List<Movie>> entry : cinemaMap.entrySet()) {

            List<Movie> value = entry.getValue();
            allMovies.addAll(value);
        }
        return allMovies;
    }
}
