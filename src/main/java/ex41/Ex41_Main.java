package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ex41_Main
{
    public static void main( String[] args ) throws IOException
    {
        //declare an array list for names from input file, and initialize input, and output files

        ArrayList<String> name_list = new ArrayList<>();

        File input_file = new File("src/main/java/ex41/exercise41_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input_file));

        File output_file = new File("src/main/java/ex41/exercise41_output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(output_file));

        //read input file and store names in array list, after completion close input file
        String name = br.readLine();
        while (name != null)
        {
            name_list.add(name);
            name = br.readLine();
        }
        br.close();

        //create a new arraylist to store sorted names, and pass to a sort method

        ArrayList<String> sorted_list = new ArrayList<>();
        sorted_list=sort_names(name_list);

        //use sorted array list to print to output file, remember to close
        bw.write("Total of "+(sorted_list.size())+" names"+"\n");
        bw.write("-----------------"+"\n");

        for(int i=0;i< sorted_list.size();i++)
        {
            bw.write(sorted_list.get(i)+"\n");
        }
        bw.close();

    }
    //function that takes in unsorted array and returns alphabetically sorted array
    public static ArrayList<String> sort_names(ArrayList<String> name_list)
    {
        Collections.sort(name_list);
        return name_list;
    }
}
