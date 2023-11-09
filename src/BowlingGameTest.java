import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BowlingGameTest {
    /**
     * @param game game to repeat rolls on
     * @param rolls Number of rolls to repeat
     * @param pins Number of pins per roll to record
     */

    private static void rollMany(Game game, int rolls,int pins){
        for(int roll = 0; roll < rolls; roll++){
            game.roll(pins);
        }
    }

    @Test
    public void allGuttersGameShouldBeZero(){
        Game game = new Game();
        rollMany(game, 20, 0);
        assertEquals(0, game.score());
    }

    @Test

    public void allOnesGameShouldScoreTwenty() {
        Game game = new Game();
        rollMany(game, 20, 1);
        assertEquals(20, game.score());
    }
 }
