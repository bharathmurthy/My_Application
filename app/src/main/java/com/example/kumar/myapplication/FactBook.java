package com.example.kumar.myapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kumar on 2/14/2015.
 */
public class FactBook {
    public static String getFact(){
        ArrayList<String> facts = new ArrayList<String>();
        facts.add("Ants strech when they wake up in the morning...");
        facts.add("Ostriches can run faster than horses...");
        facts.add("olympic gold medals are actually made mostly of silver...");
        facts.add("You are born with 300 bones; by the time you are an adult you will have 206.");
        facts.add("It takes about 8 minutes for light from the Sun to reach Earth.");
        facts.add("Some bamboo plants can grow almost a meter in just one day.");
        facts.add("The state of Florida is bigger than England.");
        facts.add("Some penguins can leap 2-3 meters out of the water.");
        facts.add("On average, it takes 66 days to form a new habit.");
        facts.add("Mammoths still walked the earth when the Great Pyramid was being built.");
        Random generator = new Random();
        return facts.get(generator.nextInt(facts.size()));

    }
}
