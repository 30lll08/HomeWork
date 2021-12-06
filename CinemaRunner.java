package zotau.homework;
import java.util.TreeMap;

/**
 * 1. Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе
 */
public class CinemaRunner {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.cinemaMap = new TreeMap<>();
        cinema.addMovie(new Movie(1, 2021, 1, "Комедия", 5.0));
        cinema.addMovie(new Movie(2, 2000, 5, "Комедия", 6.0));
        cinema.addMovie(new Movie(2, 2000, 5, "Документальный", 7.0));
        cinema.addMovie(new Movie(3, 2000, 1, "Ужасы", 8.0));
        cinema.addMovie(new Movie(4, 2009, 1, "Sci-Fi", 9.0));
        cinema.addMovie(new Movie(5, 2015, 12, "Мультфильм", 1.0));
        cinema.addMovie(new Movie(7, 2015, 4, "Комедия", 2.5));
        cinema.addMovie(new Movie(8, 2019, 1, "Фэнтези", 3.5));
        cinema.addMovie(new Movie(9, 2021, 12, "Комедия", 2.0));
        cinema.addMovie(new Movie(10, 2021, 12, "Фэнтези", 2.0));
        cinema.addMovie(new Movie(11, 2015, 12, "Комедия", 2.6));
        cinema.addMovie(new Movie(12, 1986, 11, "Фэнтези", 3.6));
        cinema.addMovie(new Movie(13, 1999, 8, "Комедия", 3.0));
        cinema.addMovie(new Movie(14, 1992, 3, "Фэнтези", 2.9));
        System.out.println("Фильмы 2000 года");
        System.out.println(cinema.getMoviesByYear(2000));
        System.out.println();
        System.out.println("Фильмы 2015-го года и 4-го месяца");
        System.out.println(cinema.getMoviestByYearAndMonth(2015, 4));
        System.out.println();
        System.out.println("Комедии");
        System.out.println(cinema.getMoviesByGenre("Комедия"));
        System.out.println();
        System.out.println("Топ 10");
        System.out.println(cinema.topMovies());
    }
}