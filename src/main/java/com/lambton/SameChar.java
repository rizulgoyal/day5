package com.lambton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SameChar {
    public static void main(String[] args) {

        HashMap <String,ArrayList> map = new HashMap<>();
        ArrayList<String> inputStrings = new ArrayList<>();
        inputStrings.add("abc");
        inputStrings.add("cab");
        inputStrings.add("cat");
        inputStrings.add("mate");
        inputStrings.add("atem");
        inputStrings.add("bac");
        inputStrings.add("tac");
        inputStrings.add("atc");
        inputStrings.add("pop");
        inputStrings.add("pat");
        inputStrings.add("123");
        inputStrings.add("231");
        inputStrings.add("431");


        for (String s : inputStrings) {

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            ArrayList<String> al = map.get(key);
            if(al==null)
            {
                al= new ArrayList<>();


            }
            al.add(s);
            map.put(key,al);




        }

        System.out.println(map.values());


        int n= 3;

        int value = (1<<n)*n+1;
        System.out.println(value);

    }
    }
