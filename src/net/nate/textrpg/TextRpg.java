/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.nate.textrpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TextRpg {

    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String option = null;
        String name = null;



        System.out.println("Please enter your name so that we can begin: ");
        name = bR.readLine();
        System.out.println("Welcome " + name);
        player player = new player();
        System.out.println("2 attribute points starting with Strength if nothing type '0'");
        option = bR.readLine();
        int pts = 2;
        do {

            switch (option) {

                case "1":
                    player.str++;
                    pts--;
                    System.out.println("You have increased your strength by 1.  You now have " + pts);
                    break;
                case "0":
                    break;


            }
            if (pts == 0) {
                break;
            }
            System.out.println("Dexterity. ");
            option = bR.readLine();
            //System.out.println (""+pts);
            switch (option) {
                case "1":
                    player.dex++;
                    pts--;

                    System.out.println("You have increased your dexterity by 1. You have " + pts);
                    break;
                case "0":
                    break;


            }
            if (pts == 0) {
                break;
            }
            System.out.println("Vitality.");
            option = bR.readLine();
            switch (option) {
                case "1":
                    player.vit++;
                    pts = pts--;
                    System.out.println("You have increased your vitality by 1.  You have " + pts);
                    break;
                case "0":
                    break;


            }
            if (pts == 0) {
                break;
            }
            System.out.println("Defense. ");
            option = bR.readLine();
            switch (option) {
                case "1":
                    player.def++;
                    pts = pts--;
                    System.out.println("You have increased your defense by 1.  You have " + pts);
                    break;
                case "0":
                    break;


            }
            if (pts == 0) {
                break;
            }
            System.out.println("Intelligence");
            option = bR.readLine();
            switch (option) {
                case "1":
                    player.intel++;
                    pts = pts--;
                    System.out.println("You have increased your intelligence by 1. You have " + pts);
                    break;
                case "0":
                    break;

            }
            if (pts == 0) {
                break;
            }
            System.out.println("Speech");
            option = bR.readLine();
            switch (option) {
                case "1":
                    player.spch++;
                    pts = pts--;
                    System.out.println("You have increased speech by 1.  You have " + pts);
                    break;

                case "0":
                    break;

            }
        } while (pts != 0);
        if (pts == 0) {
            System.out.println("Your done creating yrou character here are your stats: ");
            System.out.println("Strength: " + player.str);
            System.out.println("Dexterity " + player.dex);
            System.out.println("Intelligence " + player.intel);
            System.out.println("Defense " + player.def);
            System.out.println("Speech" + player.spch);
        }

    }
}
