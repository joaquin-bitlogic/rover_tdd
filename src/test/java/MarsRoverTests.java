import static org.junit.jupiter.api.Assertions.*;

import org.example.MarsRover;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {
    @Test
    void getRoverPosition(){

        MarsRover rover = new MarsRover(1, 1, "N");

        assertEquals(rover.getXCoordinate(), 1);
        assertEquals(rover.getYCoordinate(), 1);
        assertEquals(rover.getDirection(), "N");
    }

    @Test
    void isRoverInPosition(){
        MarsRover rover = new MarsRover(2,3, "S");

        assertTrue(rover.isInPosition(2, 3, "S"));
    }

    @Test
    void moveForward(){
        MarsRover rover = new MarsRover(1, 1, "S");

        rover.move("F");

        assertTrue(rover.isInPosition(1, 2, "S"));
    }

    @Test
    void moveBackwards(){
        MarsRover rover = new MarsRover(1, 1, "S");

        rover.move("B");

        assertTrue(rover.isInPosition(1, 0, "S"));
    }

    @Test
    void moveLeft(){
        MarsRover rover = new MarsRover(1, 1, "N");

        rover.move("L");

        assertTrue(rover.isInPosition(1, 1, "W"));
    }
    @Test
    void moveRight(){
        MarsRover rover = new MarsRover(1, 1, "N");

        rover.move("R");

        assertTrue(rover.isInPosition(1, 1, "E"));
    }

    @Test
    void moveLeftThenRight(){
        MarsRover rover = new MarsRover(1, 1, "N");

        rover.move("LR");

        assertTrue(rover.isInPosition(1, 1, "N"));
    }

    @Test
    void sampleCommandSequence4(){
        MarsRover rover = new MarsRover(1, 1, "N");

        rover.move("FBBLRR");

        assertTrue(rover.isInPosition(1, 0, "E"));
    }

}
