import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void allGuttersGameShouldBeZero(){
        Game game = new Game();
        for(int i = 0; i < 20; i++){
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test

    public void allOnesGameShouldScoreTwenty() {
        Game game = new Game();
        for(int i = 0; i < 20; i++){
            game.roll(1);
        }

        assertEquals(20, game.score());
    }
}
