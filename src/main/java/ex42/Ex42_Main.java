package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex42_Main
{
    public static void main( String[] args ) throws IOException
    {
        String [][] arr_2=new String[100][100];
        File input_file = new File("src/main/java/ex42/exercise42_input.txt");
        String [][] arr_2_parsed=csv_parse(input_file,arr_2);

        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.print("--------------------------"+"\n");

        int i=0;
        while(arr_2_parsed[i][0]!=null)
        {
            System.out.printf("%-10s%-10s%-10s\n", arr_2_parsed[i][0], arr_2_parsed[i][1], arr_2_parsed[i][2]);
            i++;
        }


    }
    public static String[][] csv_parse(File input_file,String[][] arr_2) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(input_file));

        String line = br.readLine();
        for (int i=0;line != null;i++)
        {
            String [] arr=line.split(",");
            arr_2[i][0]=arr[0];
            arr_2[i][1]=arr[1];
            arr_2[i][2]=arr[2];

            line = br.readLine();

        }
        br.close();
        return arr_2;
    }




}
