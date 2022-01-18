package com.hometask.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        File file = new File("input.txt");

        Queue<User>users = new LinkedList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()){
                String str = br.readLine();
                String[] userLine=str.split(",");
                users.add(new User(userLine[1],Integer.parseInt(userLine[2])));
            }
        }catch (IOException e){
            System.out.println("Error-->"+e);
        }
        users.parallelStream().forEach(System.out::println);
    }
}

