import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void isEmpty(){

    }

    @Test
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
        assertFalse(true);
    }

    @Test
    public void countMultiNodesTreeTest() {
        assertTrue(false);
    }

    @Test
    void inorderEmptyTree() {
    }

}