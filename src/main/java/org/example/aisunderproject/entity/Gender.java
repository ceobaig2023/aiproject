package org.example.aisunderproject.entity;

import org.example.aisunderproject.constants.GenderConstants.*;

public class Gender {

    private HairLength hairLength;      // Enum: SHORT, LONG
    private YesNo hasFacialHair;        // Enum: YES, NO
    private YesNo hasMustache;          // Enum: YES, NO
    private HairColor hairColor;        // Enum: BLACK, BROWN, BLONDE, RED, OTHER
    private YesNo wearsMakeup;          // Enum: YES, NO
    private YesNo wearsEarring;         // Enum: YES, NO
    private Muscularity isMuscular;     // Enum: MUSCULAR, NON_MUSCULAR

    // Constructors, Getters, and Setters
    public Gender(HairLength hairLength, YesNo hasFacialHair, YesNo hasMustache, HairColor hairColor, YesNo wearsMakeup, YesNo wearsEarring, Muscularity isMuscular) {
        this.hairLength = hairLength;
        this.hasFacialHair = hasFacialHair;
        this.hasMustache = hasMustache;
        this.hairColor = hairColor;
        this.wearsMakeup = wearsMakeup;
        this.wearsEarring = wearsEarring;
        this.isMuscular = isMuscular;
    }

    public HairLength getHairLength() {
        return hairLength;
    }

    public YesNo getHasFacialHair() {
        return hasFacialHair;
    }

    public YesNo getHasMustache() {
        return hasMustache;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public YesNo getWearsMakeup() {
        return wearsMakeup;
    }

    public YesNo getWearsEarring() {
        return wearsEarring;
    }

    public Muscularity getIsMuscular() {
        return isMuscular;
    }
}






//package org.example.aisunderproject.entity;
//
//package com.example.demo.entity;
//
//import com.example.demo.constants.GenderConstants.HairLength;
//import com.example.demo.constants.GenderConstants.HairColor;
//import com.example.demo.constants.GenderConstants.Muscularity;
//import com.example.demo.constants.GenderConstants.YesNo;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Gender {
//
//    private HairLength hairLength;      // Enum: SHORT, LONG
//    private YesNo hasFacialHair;        // Enum: YES, NO
//    private YesNo hasMustache;          // Enum: YES, NO
//    private HairColor hairColor;        // Enum: BLACK, BROWN, BLONDE, RED, OTHER
//    private YesNo wearsMakeup;          // Enum: YES, NO
//    private YesNo wearsEarring;         // Enum: YES, NO - New field for earrings
//    private Muscularity isMuscular;     // Enum: MUSCULAR, NON_MUSCULAR
//}
//
