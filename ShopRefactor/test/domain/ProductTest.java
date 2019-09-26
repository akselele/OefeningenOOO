package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {
    Product movie;
    Product game;
    Product cd;



    @Before
    public void setUp(){
        movie = new Movie("Film 1");
        game = new Game("Game 1");
        cd = new CD("CD 1");
    }

    @Test
    public void movie_constructor_is_legal(){
        Assert.assertEquals("Film 1",movie.getNaam());
        Assert.assertEquals("Movie",movie.getType());

    }

    @Test
    public void cd_constructor_is_legal(){
        Assert.assertEquals("CD 1",cd.getNaam());
        Assert.assertEquals("CD",cd.getType());

    }

    @Test
    public void game_constructor_is_legal(){
        Assert.assertEquals("Game 1",game.getNaam());
        Assert.assertEquals("Game",game.getType());

    }

    @Test
    public void movie_type_is_correct(){
        Assert.assertEquals("Movie",movie.getType());

    }

    @Test
    public void cd_type_is_correct(){
        Assert.assertEquals("CD",cd.getType());
    }

    @Test
    public void game_type_is_correct(){
        Assert.assertEquals("Game",game.getType());
    }

    @Test(expected = DomainException.class)
    public void constructor_lege_naam_geeft_exception(){
        Product movie = new Movie("");
        Product game = new Game("");
        Product cd = new CD("");
    }

    @Test
    public void beschikbaarheid_is_correct(){
        movie.setBeschikbaar(false);
        Assert.assertFalse(movie.getBeschikbaar());
    }

    @Test
    public void prijs_movie_is_correct(){
        double delta = 0.0001;
        Assert.assertEquals(9,movie.getPrice(5),delta);
    }

    @Test
    public void prijs_cd_is_correct(){
        double delta = 0.0001;
        Assert.assertEquals(cd.getPrice(5),7.5,delta);
    }

    @Test
    public void prijs_game_is_correct(){
        double delta = 0.0001;
        Assert.assertEquals(game.getPrice(5),15,delta);
    }



}
