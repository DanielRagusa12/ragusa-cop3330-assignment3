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

        String line = br.readLine();
        while (line != null)
        {
            line_list.add(line);
            line = br.readLine();
        }
        br.close();
        ArrayList<String> new_list = new ArrayList<>();
        new_list=word_replace(line_list);

        File output_file = new File("src/main/java/ex45/exercise45_output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(output_file));
        for(int i=0;i< new_list.size();i++)
        {
            bw.write(new_list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
        

    }
    public static ArrayList<String> word_replace(ArrayList<String> line_list)
    {
        ArrayList<String> new_list = new ArrayList<>();
        for(int i=0;i< line_list.size();i++)
        {
            String current_line=line_list.get(i);
            new_list.add(current_line.replaceAll("utilize", "use"));
        }
        return new_list;
    }

}
