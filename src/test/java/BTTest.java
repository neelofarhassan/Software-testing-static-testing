import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration (
//following are REQUIRED
        url = "https://rmit.spiraservice.net/",
        login = "Neelofar",
        rssToken = "{5453FC59-F005-4118-9428-4A7248C97CEE}",
        projectId = 544,
//following are OPTIONAL
        releaseId = 7,
        testSetId = 1
)
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
    @SpiraTestCase(testCaseId = 46605)
    public void search() {
        assertTrue(true);
    }

    @Test
    public void countMultiNodesTreeTest() {

    }

    @Test
    void inorderEmptyTree() {

    }

    @Test
    public void countOneNodeTreeTest() {
        assertFalse(true);
    }

}