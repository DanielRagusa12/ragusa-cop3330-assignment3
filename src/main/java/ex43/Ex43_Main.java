package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex43_Main
{
    public static void main( String[] args ) throws IOException {
        //basic input for website name, author name, and yes/no question for js and css folders.
        Scanner input=new Scanner(System.in);
        System.out.print("Site name: ");
        String site_name= input.nextLine();

        System.out.print("Author: ");
        String author= input.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        String js=input.next();

        System.out.print("Do you want a folder for CSS? ");
        String css= input.next();

        //calling a create function for each folder/file to be made.
        //the following print statements will only execute if the corresponding file/folder is successfully made.

        if(create_website(site_name))
        {
            System.out.println("Created ./website/"+site_name);

        }
        if(!create_html(site_name))
        {
            System.out.println("Created ./website/"+site_name+"/index.html");
        }

        //Checking for a yes response for js and css folders.
        if(js.matches("y") || js.matches("Y"))
        {
            if(create_js(site_name))
            {
                System.out.println("Created ./website/"+site_name+"/js/");
            }
        }
        if(css.matches("y") || css.matches("Y"))
        {
            if(create_css(site_name))
            {
                System.out.println("Created ./website/"+site_name+"/css/");
            }
        }
        //using buffered writer to write a basic html template to index.html.

        BufferedWriter html = new BufferedWriter(new FileWriter("src/main/java/ex43/website/"+site_name+"/"+"/index.html"));
        html.write("<!DOCTYPE html>"+"\n");
        html.write("<html lang=\"en\">"+"\n");
        html.write("   <head>"+"\n");
        html.write("      <meta author=\""+(author)+"\">"+"\n");
        html.write("      <title>"+(site_name)+"</title>"+"\n");
        html.write("   </head>"+"\n");
        html.flush();
        html.close();

    }

    //a create function for every file/folder to be created.

    public static boolean create_website(String site_name)
    {
        return new File("src/main/java/ex43/website/"+site_name).mkdirs();
    }
    public static Boolean create_html(String site_name)
    {
        File file = new File("src/main/java/ex43/website/"+site_name+"/"+"/index.html");
        return file.getParentFile().mkdirs();
    }
    public static boolean create_js(String site_name)
    {
        return new File("src/main/java/ex43/website/"+site_name+"/js/").mkdirs();
    }
    public static boolean create_css(String site_name)
    {
        return new File("src/main/java/ex43/website/"+site_name+"/css/").mkdirs();
    }
}
