package week_four.monday;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class TextbookTest {

    @Test
    public void testGetTitle(){
        Textbook tb = new Textbook("Computer Science", 20.77, 8);
        assertEquals("Computer Science", tb.getTitle());
    }

    @Test
    public void testGetEditions(){
        Textbook tb = new Textbook("Computer Science", 20.77, 8);
        assertEquals(8, tb.getEdition());
    }

    @Test
    public void testGetPrice(){
        Textbook tb = new Textbook("Computer Science", 20.77, 8);
        assertEquals(20.77, tb.getPrice());
    }
    
    @Test
    public void testGetBookInfo() {
        Textbook tb = new Textbook("Computer Science", 14.99, 9);
        assertEquals("Computer Science _ 14.99_9", tb.getBookInfo());
    }
    
    @Test
    public void testCanSubstituteFor_canSubstitute() {
        Textbook tb = new Textbook("Computer Science", 14.99, 9);
        Textbook tb2 = new Textbook("Computer Science", 19.99, 2);
        assertEquals(true, tb.canSubstituteFor(tb2));
    }
    
    @Test
    public void testCanSubstituteFor_cannotSubstitute() {
        Textbook tb = new Textbook("Computer Science", 14.99, 9);
        Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
        assertEquals(false, tb.canSubstituteFor(tb2));
    }

}