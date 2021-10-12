package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.google.gson.*;

public class Ex44_Main
{
    public static void main(String[] args ) throws FileNotFoundException
    {
        //declaring an ArrayList for name,price,and quantity.
        ArrayList<String> name_arr = new ArrayList<>();
        ArrayList<Integer> price_arr = new ArrayList<>();
        ArrayList<Integer> quantity_arr = new ArrayList<>();

        //opening a new file reader for json file.
        File input=new File("src/main/java/ex44/exercise44_input.json");
        JsonElement fileElement= JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject= fileElement.getAsJsonObject();
        //locating "products" array in json file.
        JsonArray jsonArrayOfProducts= fileObject.get("products").getAsJsonArray();

        //a simple for loop that locates data in the json array, and stores the data in name,price, and quantity ArrayLists
        for(JsonElement productElement : jsonArrayOfProducts)
        {
            JsonObject productJsonObject= productElement.getAsJsonObject();

            name_arr.add(productJsonObject.get("name").getAsString());
            price_arr.add(productJsonObject.get("price").getAsInt());
            quantity_arr.add(productJsonObject.get("quantity").getAsInt());

        }
        Scanner user_input=new Scanner(System.in);

        //a while loop that prompts for user input, and then calls search_product function. If the product is found then the break line is executed.

        while(true)
        {
            System.out.print("What is the product name? ");
            String search_name= user_input.next();
            if(search_product(search_name,name_arr,price_arr,quantity_arr))
            {
                break;
            }

        }
    }
    //search_product function that takes in all ArrayLists, and searches for search_name in name_arr. If the name is found then the function will print price, and quantity, and return true. If the search_name is not found then an appropriate message is printed to user, and it returns false.
    public static boolean search_product(String search_name,ArrayList<String> name_arr,ArrayList<Integer> price_arr,ArrayList<Integer> quantity_arr)
    {
        for(int i=0;i< name_arr.size();i++)
        {
            if(search_name.equals(name_arr.get(i)))
            {
                System.out.print("Name: "+name_arr.get(i)+"\n");
                System.out.print("Price: "+price_arr.get(i)+"\n");
                System.out.print("Quantity: "+quantity_arr.get(i)+"\n");
                return true;
            }
        }
        System.out.print("Sorry, that product was not found in our inventory."+"\n");
        return false;

    }
}
