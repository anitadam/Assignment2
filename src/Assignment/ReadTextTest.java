package Assignment;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class ReadTextTest {

    @Test
    public void testOneRow() {


        ReadTextLogic testObj = new ReadTextLogic(); // objekt


        testObj.countLines("hej");
        int actual = testObj.getCountRows();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeRows() {


        ReadTextLogic testObj = new ReadTextLogic(); // objekt


        testObj.countLines("hej");
        testObj.countLines("hej");
        testObj.countLines("hej");
        int actual = testObj.getCountRows();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCharacters() {

        ReadTextLogic testObj = new ReadTextLogic(); // objekt


        testObj.countLines("Hej Staffan!");

        int actual = testObj.getCountChar();
        int expected = 12;
        assertEquals(expected,actual);
    }
}