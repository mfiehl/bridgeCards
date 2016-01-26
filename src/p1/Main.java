package p1;

/*
 * Project that simulates a game of bridge by shuffling a deck of cards and dealing them out.
 * CSC 164
 * Mike Fiehl
 * 26, Jan 2016
 * Version 1.0
 */

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] deck = new int [52];
        int[] north = new int [13];
        int[] east = new int [13];
        int[] south = new int [13];
        int[] west = new int [13];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize the cards
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }// end for

        // Shuffle the deck 3 times
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < deck.length; j++)
            {
                // Generate an index randomly
                int index = (int)(Math.random() * deck.length);
                int temp = deck[j];
                deck[j] = deck[index];
                deck[index] = temp;
            }// end for inner

        }// end for outer


        // Print out deck
        for(int i = 0; i < deck.length; i++)
        {
            System.out.println(deck[i]);
        }// end for

        // Split the deck array into 4 different arrays which simulates each player

        // North's hand
        System.arraycopy(deck, 0, north, 0, 13);

        // East's hand
        System.arraycopy(deck, 13, east, 0, 13);

        // South's hand
        System.arraycopy(deck, 26, south, 0, 13);

        // West's hand
        System.arraycopy(deck, 39, west, 0, 13);

        System.out.printf("North Array\n");
        for(int i = 0; i < north.length; i++)
            System.out.println(north[i]);

        System.out.printf("East Array\n");
        for(int i = 0; i < north.length; i++)
            System.out.println(east[i]);

        System.out.printf("South Array\n");
        for(int i = 0; i < north.length; i++)
            System.out.println(south[i]);

        System.out.printf("West Array\n");
        for(int i = 0; i < north.length; i++)
            System.out.println(west[i]);


    }
}
