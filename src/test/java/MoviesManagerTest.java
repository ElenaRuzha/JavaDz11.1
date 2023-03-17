import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void addMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film_1");
        manager.addMovie("Film_2");
        manager.addMovie("Film_3");
        manager.addMovie("Film_4");
        manager.addMovie("Film_5");
        manager.addMovie("Film_6");
        manager.addMovie("Film_7");

        String[] expected = {"Film_1", "Film_2", "Film_3", "Film_4", "Film_5", "Film_6", "Film_7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addLastMoviesIf_7() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film_1");
        manager.addMovie("Film_2");
        manager.addMovie("Film_3");
        manager.addMovie("Film_4");
        manager.addMovie("Film_5");
        manager.addMovie("Film_6");
        manager.addMovie("Film_7");

        String[] expected = {"Film_7", "Film_6", "Film_5", "Film_4", "Film_3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addLastMoviesIf_5() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film_1");
        manager.addMovie("Film_2");
        manager.addMovie("Film_3");
        manager.addMovie("Film_4");
        manager.addMovie("Film_5");

        String[] expected = {"Film_5", "Film_4", "Film_3", "Film_2", "Film_1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addLastMoviesIf_4() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Film_1");
        manager.addMovie("Film_2");
        manager.addMovie("Film_3");
        manager.addMovie("Film_4");

        String[] expected = {"Film_4", "Film_3", "Film_2", "Film_1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
