import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    public void testExample()  {
        BowlingGame g = new BowlingGame();
        g.addFrame(new Frame(2, 4));
        assertEquals(6, g.score());
    }

    //TODO: You are expected to create JUnit test cases to verify the behavior of this
    // implementation as thorough as possible based on the description of a BowlingGame.
}
