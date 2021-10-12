package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ex46_Main
{
    public static void main(String[] args ) throws IOException
    {
        //array list for storing words
        ArrayList<String> word_list = new ArrayList<>();
        File input_file=new File("src/main/java/ex46/exercise46_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input_file));

        String line = br.readLine();
        //loop for filling up word list from input file
        while (line != null)
        {
            word_list.add(line);
            line = br.readLine();
        }
        br.close();
        //loop to add each line into 1 continuous string
        String full_text="";
        for(int i=0;i< word_list.size();i++)
        {
            full_text+= word_list.get(i)+" ";
        }
        //array list for storing each unique word
        ArrayList<String> key_words = new ArrayList<>();
        String [] arr_split=full_text.split(" ");
        //adding the 1st word as the first unique word
        key_words.add(arr_split[0]);
        //a loop to find each unique word and store in key_words
        int flag=0;
        for(int i=0;i< arr_split.length;i++)
        {
            flag=0;
            String current_word=arr_split[i];
            for(int j=0;j< key_words.size();j++)
            {
                if(current_word.equals(key_words.get(j)))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                key_words.add(current_word);
            }

        }
        //an integer array list to store the corresponding frequency of each unique word.
        ArrayList<Integer> key_word_count=new ArrayList<Integer>();
        key_word_count=find_frequency(key_words,arr_split);
        print_histogram(key_words,key_word_count);

    }
    public static ArrayList<Integer> find_frequency(ArrayList<String> key_words,String [] arr_split)
    {
        int count=0;
        ArrayList<Integer> key_word_count=new ArrayList<Integer>();
        for(int i=0;i< key_words.size();i++)
        {
            count=0;
            String current=key_words.get(i);
            for(int j=0;j< arr_split.length;j++)
            {
                if(current.equals(arr_split[j]))
                {
                    count++;
                }
            }
            key_word_count.add(count);
        }
        return key_word_count;
    }
    public static void print_histogram(ArrayList<String> key_words,ArrayList<Integer> key_word_count)
    {

        for(int i=0;i< key_words.size();i++)
        {
            System.out.print(key_words.get(i)+":");
            for(int j=0;j<key_word_count.get(i);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
