package ex45;

import ex44.Ex44_Main;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Ex45_MainTest extends TestCase {

    public void testWord_replace()
    {
        Ex45_Main a=new Ex45_Main();
        ArrayList<String> line_list = new ArrayList<>();
        line_list.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        line_list.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        line_list.add("uses an IDE to write her Java programs\".");
        ArrayList<String> new_list = new ArrayList<>();
        new_list=a.word_replace(line_list);
        assertEquals(new_list.get(0),"One should never use the word \"use\" in writing. Use \"use\" instead.");
        assertEquals(new_list.get(1),"For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        assertEquals(new_list.get(2),"uses an IDE to write her Java programs\".");
    }
}