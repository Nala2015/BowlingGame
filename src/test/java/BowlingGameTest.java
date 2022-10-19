import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    BowlingGame uut;

    int expectedresult;
    int actualResult;

    @BeforeEach
    public void setUp(){
        uut = new BowlingGame();
    }

    @Test
    public void testForTwoRounds() {

        int statusOfFirst = uut.playBowling();

    }

}
