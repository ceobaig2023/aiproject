package org.example.aisunderproject.entity;

package com.example.demo.entity;

import com.example.demo.constants.GenderConstants.HairLength;
import com.example.demo.constants.GenderConstants.HairColor;
import com.example.demo.constants.GenderConstants.Muscularity;
import com.example.demo.constants.GenderConstants.YesNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gender {

    private HairLength hairLength;      // Enum: SHORT, LONG
    private YesNo hasFacialHair;        // Enum: YES, NO
    private YesNo hasMustache;          // Enum: YES, NO
    private HairColor hairColor;        // Enum: BLACK, BROWN, BLONDE, RED, OTHER
    private YesNo wearsMakeup;          // Enum: YES, NO
    private YesNo wearsEarring;         // Enum: YES, NO - New field for earrings
    private Muscularity isMuscular;     // Enum: MUSCULAR, NON_MUSCULAR
}

