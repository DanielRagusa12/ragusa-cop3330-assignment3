package ex46;

import ex45.Ex45_Main;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Ex46_MainTest extends TestCase {

    public void testFind_frequency()
    {
        Ex46_Main a=new Ex46_Main();
        ArrayList<String> key_words = new ArrayList<>();
        String [] arr_split={"badger","badger","badger","badger","mushroom","mushroom","snake","badger","badger","badger"};
        key_words.add("badger");
        key_words.add("mushroom");
        key_words.add("snake");
        ArrayList<Integer> key_word_count=a.find_frequency(key_words,arr_split);
        int test1=key_word_count.get(0);
        assertEquals(7,test1);
        int test2=key_word_count.get(1);
        assertEquals(2,test2);
        int test3=key_word_count.get(2);
        assertEquals(1,test3);

    }
}