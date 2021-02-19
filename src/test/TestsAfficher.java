package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Body;
import main.Header;
import main.RequeteHttp;
import main.Url;

public class TestsAfficher {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testAfficher() {
    	String [] str = {"Header","Salut"};
        RequeteHttp requeteHttp = new RequeteHttp(new Url("super/lol/test"), new Body("BodyContent"), new Header(str));
        requeteHttp.afficher();
        StringWriter out = new StringWriter();
        PrintWriter wr = new PrintWriter(out);
        wr.println("super/lol/test");
        wr.println("BodyContent");
        wr.println("Header"+"Salut");
        assertEquals(out.toString(), outContent.toString());
    }
}
