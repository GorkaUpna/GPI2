package es.unavarra.gpi2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Scanner;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	//Scanner scan = new Scanner(System.in);
	String expected = "Hello World!";
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       assertTrue(expected.equals(App.getSaludo()));
    }
}
