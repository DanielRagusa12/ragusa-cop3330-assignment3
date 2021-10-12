package ex41;

import ex42.Ex42_Main;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Ex41_MainTest extends TestCase {

    public void testSort_names()
    {
        Ex41_Main a=new Ex41_Main();
        ArrayList<String> name_list = new ArrayList<>();
        name_list.add("Ling, Mai");
        name_list.add("Johnson, Jim");
        name_list.add("Zarnecki, Sabrina");
        name_list.add("Jones, Chris");
        name_list.add("Jones, Aaron");
        name_list.add("Swift, Geoffrey");
        name_list.add("Xiong, Fong");

        ArrayList<String> sorted_list = new ArrayList<>();

        sorted_list=a.sort_names(name_list);

        assertEquals("Johnson, Jim",sorted_list.get(0));
        assertEquals("Jones, Aaron",sorted_list.get(1));
        assertEquals("Jones, Chris",sorted_list.get(2));
        assertEquals("Ling, Mai",sorted_list.get(3));
        assertEquals("Swift, Geoffrey",sorted_list.get(4));
        assertEquals("Xiong, Fong",sorted_list.get(5));
        assertEquals("Zarnecki, Sabrina",sorted_list.get(6));







    }
}