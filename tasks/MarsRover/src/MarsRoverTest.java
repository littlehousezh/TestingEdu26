import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    @Test
    void testExample() {
        MarsRover rover = new MarsRover(3, 3, "");
        String result = rover.execute("ffrf");
        assertEquals("(1,2,E)", result);
    }

    //TODO: You are expected to create JUnit test cases to verify the behavior of this
    // implementation as thorough as possible based on the description of a MarsRover.
}