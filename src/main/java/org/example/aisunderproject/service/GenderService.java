package org.example.aisunderproject.service;

import org.example.aisunderproject.constants.GenderConstants.*;
import org.example.aisunderproject.entity.Gender;

public class GenderService {

    public String identifyGender(Gender gender) {
        // Simple rule-based logic for identifying gender
        if (gender.getWearsEarring() == YesNo.YES || gender.getWearsMakeup() == YesNo.YES) {
            return "Female";
        }

        if (gender.getHasFacialHair() == YesNo.YES || gender.getHasMustache() == YesNo.YES || gender.getIsMuscular() == Muscularity.MUSCULAR) {
            return "Male";
        }

        if (gender.getHairLength() == HairLength.LONG && gender.getHasFacialHair() == YesNo.NO && gender.getHasMustache() == YesNo.NO) {
            return "Female";
        }

        // Default if uncertain
        return "Uncertain";
    }
}




//package org.example.aisunderproject.service;
//
//package com.example.demo.service;
//
//import org.example.demo.constants.GenderConstants.HairLength;
//import com.example.demo.constants.GenderConstants.YesNo;
//import com.example.demo.constants.GenderConstants.Muscularity;
//import com.example.demo.entity.Gender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GenderService {
//
//    public String identifyGender(Gender gender) {
//        // Identify Female if wearing earrings
//        if (gender.getWearsEarring() == YesNo.YES) {
//            return "Female ";
//        }
//
//        // Male characteristics
//        if (gender.getHasFacialHair() == YesNo.YES || gender.getHasMustache() == YesNo.YES || gender.getIsMuscular() == Muscularity.MUSCULAR) {
//            if (gender.getWearsMakeup() == YesNo.NO) {
//                return "Male";
//            }
//        }
//
//        // Female characteristics
//        if (gender.getHairLength() == HairLength.LONG && gender.getHasFacialHair() == YesNo.NO && gender.getHasMustache() == YesNo.NO) {
//            if (gender.getWearsMakeup() == YesNo.YES) {
//                return "Female";
//            }
//        }
//
//        // Default case
//        return "Uncertain";
//    }
//}
//
