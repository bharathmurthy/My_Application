package com.example.kumar.myapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kumar on 2/14/2015.
 */
public class FactBook {
 //   private static ArrayList<Integer> indexUsed = new ArrayList<Integer>();
    public static String getFact(){
        ArrayList<String> facts = new ArrayList<String>();
        facts.add("Ostriches can run faster than horses...");
        facts.add("olympic gold medals are actually made mostly of silver...");
        facts.add("You are born with 300 bones; by the time you are an adult you will have 206.");
        facts.add("It takes about 8 minutes for light from the Sun to reach Earth.");
        facts.add("Some bamboo plants can grow almost a meter in just one day.");
        facts.add("The state of Florida is bigger than England.");
        facts.add("Some penguins can leap 2-3 meters out of the water.");
        facts.add("On average, it takes 66 days to form a new habit.");
        facts.add("Mammoths still walked the earth when the Great Pyramid was being built.");
        facts.add("John F. Kennedy was buried without his brain after it was lost during the autopsy.");
        facts.add("There are more chickens in world than human.");
        facts.add("A woodpecker has a shock absorber head.");
        facts.add("The bones of pigeon are lighter than feathers.");
        facts.add("Kiwi bird are blind they hunt by smell.");
        facts.add("Humming bird is the only bird that can fly backwards.");
        facts.add("A flamingo can eat only when its head is upside down.");
        facts.add("The earliest recorded coin collection belonged to augustus caesar, the first emperor of Rome.");
        facts.add("Humans and giraffe have the same number of bones in their necks.");
        facts.add("There are trillions of microbes living on and in human body.");
        facts.add("Yawning may help in keeping you alert by allowing you to intake more oxygen which the brain needs to function properly.");
        facts.add("Sea star fish have no brains.");
        facts.add("Scientists can tell the age of a dolphin by counting the rings on its teeth.");
        facts.add("In its very first flight the world's first successful aeroplane was airborne for only 12 seconds.");
        facts.add("The world's smallest spider is the size of a pinhead.");
        facts.add("The giraffe has the highest blood pressure of any animal.");
        facts.add("The birth rate in India is so high that each year,it has more births than the entire population of Australia.");
        facts.add("A camels hump does not store water at all it stores fat.");
        facts.add("In 1969 novelist Georges Perec wrote an entire novel without using the letter 'e'.");
        facts.add("Elephants can swim for as long as six hours at a time without a break.");
        facts.add("The world's oldest pet goldfish lived to be 43 years old.");
        facts.add("The largest natural bridge on Earth was virtually unknown to the rest of the world, until it was observed on Google Earth.");
        facts.add("Unlike most fish the seahorse swims in an upright position.");
        facts.add("Great white shark can weigh as much as 15 gorillas.");
        facts.add("Humans and chimps share 98.8% of their DNA.");
        facts.add("The red bump and itching caused by a mosquito bite is actually an allergic reaction to the mosquito's saliva.");
        facts.add("Fish actually cough.");
        facts.add("Even identical twins do not have identical fingerprint.");
        facts.add("Brain cells lack the ability to regenerate.");
        facts.add("An earthworm has 5 hearts!!!");
        facts.add("Earth isn't the only planet with volcanoes, Mars has the largest volcano in the solar system.");
        facts.add("Baby goats are referred to as kids.");
        facts.add("Bangkok is known by Thai people as 'Krung Thep',which means 'City of Angles.");
        facts.add("Vampire bats adopt orphans, and are one of the few mammals known to risk their own lives to share food with less fortunate roost-mates.");
        facts.add("Ostrich males can roar like lions...");
        facts.add("There are more people speaking French than in France.");
        facts.add("Sheep are born with long tails.");
        facts.add("An average human loses about 200 head hairs per day.");
        facts.add("A full moon is nine times brighter than a half moon.");
        facts.add("A female ferret will die if it goes into heat and cannot find a mate.");
        facts.add("The average Japanese household watches more than 10 hours of television a day.");
        facts.add("Winston Churchill was born in a ladies’ room during a dance.");
        facts.add("Donald Duck comics were banned from Finland because he doesn’t wear pants!");
        facts.add("There are more than 10 million bricks in the Empire State Building!");
        facts.add("Camels have three eyelids to protect themselves from blowing sand!");
        facts.add("Over 1000 birds a year die from smashing into windows!");
        facts.add("Dolphins sleep with one eye open!");
        facts.add("In the White House, there are 13,092 knives, forks and spoons!");
        facts.add("Owls are one of the only birds who can see the color blue!");
        facts.add("In Bangladesh, kids as young as 15 can be jailed for cheating on their finals!");
        facts.add("Months that begin on a Sunday will always have a ‘Friday the 13th’.");
        facts.add("The fingerprints of koala bears are virtually indistinguishable from those of humans, so much so that they can be easily confused at a crime scene.");
        facts.add("Only one person in two billion will live to be 116 or older.");
        facts.add("38% of American men say they love their cars more than women.");
        facts.add("Bullet proof vests, fire escapes, windshield wipers, and laser printers were all invented by women.");
        facts.add("A duck’s quack doesn’t echo, and no one knows why.");
        facts.add("Cats urine glows under a black light.");
        facts.add("A spider has transparent blood.");
        facts.add("The most common street name in the U.S. is Second Street.");
        facts.add("Tehran is the most expensive city on earth.");
        facts.add("You spend 7 years of your life in the bathroom.");
        facts.add("Simplistic passwords contribute to over 80% of all computer password break-ins.");
        facts.add("The top 3 health-related searches on the Internet are (in this order): Depression, Allergies, & Cancer.");
        facts.add("Mosquito repellents don’t repel. They hide you. The spray blocks the mosquito’s sensors so they don’t know you’re there.");
        facts.add("A Saudi Arabian woman can get a divorce if her husband doesn’t give her coffee.");
        facts.add("The dot over the letter ‘i’ is called a tittle.");
        facts.add("7-Up – invented in 1920 contained Lithium – the drug commonly prescribed now to sufferers of bi-polar disorder.");
        facts.add("Nutritious food costs 10 times as much as junk food.");
        facts.add("Chewing gum while peeling onions will keep you from crying!");
        facts.add("Eating lemons make you live longer.");
        facts.add("Coffee is the world’s most recognizable smell.");
        facts.add("Carrots have zero fat content.");
        facts.add("When honey is swallowed, it enters the blood stream within a period of 20 minutes.");
        facts.add("Eggs contain most of the recognised vitamins with the exception of vitamin C.");
        facts.add("Chocolate can kill dogs; it directly affects their heart and nervous system.");
        facts.add("In the United States, lettuce is the second most popular fresh vegetable.");
        facts.add("Bananas are about 99.5% fat free.");
        facts.add("Honey is the only food that doesn’t spoil.");
        facts.add("Humans shed 40 pounds of skin in their lifetime, completely replacing their outer skin every month." );
        facts.add("It takes food seven seconds to go from the mouth to the stomach via the esophagus." );
        facts.add("It is impossible to sneeze with your eyes open." );
        facts.add("Your fingernails grow almost four times as fast as your toenails." );
        facts.add("Women speak about 20,000 words a day. That's 13,000 more than the average man." );
        facts.add("Sloths take two weeks to digest their food.");
        facts.add("Guinea pigs and rabbits can't sweat.");
        facts.add("Deer can't eat hay.");
        facts.add("The female lion does ninety percent of the hunting.");
        facts.add("The elephant is the only mammal that can’t jump!");
        facts.add("Like fingerprints, everyone’s tongue print is different!");
        facts.add("You’re born with 300 bones, but by the time you become an adult, you only have 206.");
        facts.add("Owls are the only birds who can see the colour blue.");
        facts.add("A giraffe can clean its ears with its 21-inch tongue!");
        facts.add("Butterflies taste with their feet.");
        facts.add("Most lipstick contains fish scales.");
        facts. add("Sea otters hold each other’s paws when they sleep so they don’t drift apart");
        facts. add("Flamingos pair for a lifetime. Some stay with their mates for 50 years or more.");
        facts. add("The most dangerous bird in the world is the Cassowary. With one kick it can kill its enemy. ");
        facts. add("It is impossible to lick your elbow");
        facts. add("A crocodile can't stick it's tongue out.");
        facts. add("It is physically impossible for pigs to look up into the sky.");
        facts. add("duck's quack doesn't echo, and no one knows why.");
        facts. add("Hot water is heavier than cold.");
        facts. add("cockroach can live several weeks with its head cut off.");
        facts. add("Human thigh bones are stronger than concrete.");
        facts. add("You can’t kill yourself by holding your breath. ");

        Random generator = new Random();
//        while (indexUsed.contains(random))
 //       {
 //           random = generator.nextInt(facts.size());
  //      }
   //     if(!indexUsed.contains(random))
    //        indexUsed.add(random);
 //       if(indexUsed.size()==facts.size()-1)
  //          indexUsed = new ArrayList<Integer>();
        return facts.get(generator.nextInt(facts.size()));

    }
}
