package ex44;

import ex43.Ex43_Main;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Ex44_MainTest extends TestCase {

    public void testSearch_product()
    {
        ArrayList<String> name_arr = new ArrayList<>();
        ArrayList<Integer> price_arr = new ArrayList<>();
        ArrayList<Integer> quantity_arr = new ArrayList<>();
        name_arr.add("Widget");
        name_arr.add("Thing");
        name_arr.add("Doodad");
        price_arr.add(25);
        price_arr.add(15);
        price_arr.add(5);
        quantity_arr.add(5);
        quantity_arr.add(5);
        quantity_arr.add(10);
        String search_name="Doodad";
        Ex44_Main a=new Ex44_Main();
        boolean val=a.search_product(search_name,name_arr,price_arr,quantity_arr);
        assertEquals(true,val);

        search_name="iPad";
        val=a.search_product(search_name,name_arr,price_arr,quantity_arr);
        assertEquals(false,val);
    }
}