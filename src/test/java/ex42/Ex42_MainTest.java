package ex42;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class Ex42_MainTest extends TestCase {

    public void testCsv_parse() throws IOException {
        String [][] arr_2=new String[100][100];
        File input_file = new File("src/main/java/ex42/exercise42_input.txt");
        Ex42_Main a=new Ex42_Main();

        String [][] arr_2_parsed=a.csv_parse(input_file,arr_2);

        assertEquals("Ling",arr_2_parsed[0][0]);
        assertEquals("Mai",arr_2_parsed[0][1]);
        assertEquals("55900",arr_2_parsed[0][2]);

        assertEquals("Johnson",arr_2_parsed[1][0]);
        assertEquals("Jim",arr_2_parsed[1][1]);
        assertEquals("56500",arr_2_parsed[1][2]);

        assertEquals("Jones",arr_2_parsed[2][0]);
        assertEquals("Aaron",arr_2_parsed[2][1]);
        assertEquals("46000",arr_2_parsed[2][2]);

        assertEquals("Jones",arr_2_parsed[3][0]);
        assertEquals("Chris",arr_2_parsed[3][1]);
        assertEquals("34500",arr_2_parsed[3][2]);

        assertEquals("Zarnecki",arr_2_parsed[6][0]);
        assertEquals("Sabrina",arr_2_parsed[6][1]);
        assertEquals("51500",arr_2_parsed[6][2]);


    }
}