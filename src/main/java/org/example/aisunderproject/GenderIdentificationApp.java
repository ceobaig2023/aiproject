package org.example.aisunderproject;

import org.example.aisunderproject.constants.GenderConstants.*;
import org.example.aisunderproject.entity.Gender;
import org.example.aisunderproject.service.GenderService;

import java.util.Scanner;

public class GenderIdentificationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenderService genderService = new GenderService();

        System.out.println("Welcome to the Gender Identification App!");

        // Ask for Hair Length
        System.out.print("Is the hair length LONG or SHORT? ");
        String hairLengthInput = scanner.nextLine().toUpperCase();
        HairLength hairLength = HairLength.valueOf(hairLengthInput);

        // Ask for Facial Hair
        System.out.print("Does the person have facial hair? (YES/NO): ");
        String facialHairInput = scanner.nextLine().toUpperCase();
        YesNo hasFacialHair = YesNo.valueOf(facialHairInput);

        // Ask for Mustache
        System.out.print("Does the person have a mustache? (YES/NO): ");
        String mustacheInput = scanner.nextLine().toUpperCase();
        YesNo hasMustache = YesNo.valueOf(mustacheInput);

        // Ask for Hair Color
        System.out.print("What is the hair color? (BLACK/BROWN/BLONDE/RED/OTHER): ");
        String hairColorInput = scanner.nextLine().toUpperCase();
        HairColor hairColor = HairColor.valueOf(hairColorInput);

        // Ask for Makeup
        System.out.print("Does the person wear makeup? (YES/NO): ");
        String wearsMakeupInput = scanner.nextLine().toUpperCase();
        YesNo wearsMakeup = YesNo.valueOf(wearsMakeupInput);

        // Ask for Earrings
        System.out.print("Does the person wear earrings? (YES/NO): ");
        String wearsEarringInput = scanner.nextLine().toUpperCase();
        YesNo wearsEarring = YesNo.valueOf(wearsEarringInput);

        // Ask for Muscularity
        System.out.print("Is the person muscular? (MUSCULAR/NON_MUSCULAR): ");
        String muscularityInput = scanner.nextLine().toUpperCase();
        Muscularity isMuscular = Muscularity.valueOf(muscularityInput);

        // Create a Gender object with the gathered data
        Gender gender = new Gender(hairLength, hasFacialHair, hasMustache, hairColor, wearsMakeup, wearsEarring, isMuscular);

        // Identify Gender
        String identifiedGender = genderService.identifyGender(gender);
        System.out.println("The identified gender is: " + identifiedGender);

        scanner.close();
    }
}
