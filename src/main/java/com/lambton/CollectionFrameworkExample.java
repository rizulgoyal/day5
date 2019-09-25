package com.lambton;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionFrameworkExample {

    public static void main(String[] args) {

        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("B");
        mStringArrayList.add("A");

        System.out.println(mStringArrayList);
        int i;
        int size = mStringArrayList.size();
        for (i = 0; i <= size - 1; i++) {

            System.out.println("Alphabet" + mStringArrayList.get(i));
        }

        for (String num : mStringArrayList) {
            System.out.println(num);
        }
        Iterator<String> iterator = mStringArrayList.iterator();
        while (iterator.hasNext()) {

            String s = iterator.next();
            System.out.println(s);
        }

        Set<String> mySet = new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("USA");
        mySet.add("India");
        System.out.println(mySet);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("IND", "India");
        stringMap.put("CAD", "Canada");
        stringMap.put("USA", "United States");
        stringMap.put("PAK", "Pakistan");
        stringMap.put("CAD", "New Canada");
        System.out.println(stringMap);

        System.out.println(stringMap.get("IND"));
        System.out.println(stringMap.values());


        List<String> canada = new ArrayList<>();
        canada.add("Ontario");
        canada.add("Manitoba");
        canada.add("British Columbia");

        List<String> india = new ArrayList<>();
        india.add("Punjab");
        india.add("Gujarat");
        india.add("Himachal");

        List<String> usa = new ArrayList<>();
        usa.add("New York");
        usa.add("California");
        usa.add("Texas");

        Map<String, ArrayList> provinces = new HashMap<>();
        provinces.put("Canada", (ArrayList) canada);
        provinces.put("India", (ArrayList) india);
        provinces.put("USA", (ArrayList) usa);

        System.out.println(provinces);

        ArrayList<Integer> myIntegerArray = new ArrayList<>();

        String test[] = new String[]{"abc", "cab", "cat", "mate", "Atem","bac","Tac","atc","PoP","Pat"};




    }
}
