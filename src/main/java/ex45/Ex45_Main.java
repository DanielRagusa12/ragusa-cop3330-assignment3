package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.*;
import java.util.ArrayList;

public class Ex45_Main
{
    public static void main(String[] args ) throws IOException
    {

        ArrayList<String> line_list = new ArrayList<>();
        File input_file=new File("src/main/java/ex45/exercise45_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input_file));
        //reading current line
        String line = br.readLine();
        //passing each line separately into line_list
        while (line != null)
        {
            line_list.add(line);
            line = br.readLine();
        }
        br.close();
        //new list to hold the data for output
        ArrayList<String> new_list = new ArrayList<>();
        //calling word_replace with line_list
        new_list=word_replace(line_list);

        File output_file = new File("src/main/java/ex45/exercise45_output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(output_file));
        //writing each line separately into output file
        for(int i=0;i< new_list.size();i++)
        {
            bw.write(new_list.get(i)+"\n");
        }
        bw.flush();
        bw.close();


    }
    public static ArrayList<String> word_replace(ArrayList<String> line_list)
    {
        //new array list to hold data that is returned to main
        ArrayList<String> new_list = new ArrayList<>();
        //iterating through the input strings in line_list
        for(int i=0;i< line_list.size();i++)
        {
            //reading current line
            String current_line=line_list.get(i);
            //replacing the word "utilize" with "use"
            new_list.add(current_line.replaceAll("utilize", "use"));
        }
        //returning new_list which contains the data for output file
        return new_list;
    }

}
