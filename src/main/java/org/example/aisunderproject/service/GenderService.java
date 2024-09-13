package org.example.aisunderproject.service;

package com.example.demo.service;

import com.example.demo.constants.GenderConstants.HairLength;
import com.example.demo.constants.GenderConstants.YesNo;
import com.example.demo.constants.GenderConstants.Muscularity;
import com.example.demo.entity.Gender;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    public String identifyGender(Gender gender) {
        // Identify Female if wearing earrings
        if (gender.getWearsEarring() == YesNo.YES) {
            return "Female";
        }

        // Male characteristics
        if (gender.getHasFacialHair() == YesNo.YES || gender.getHasMustache() == YesNo.YES || gender.getIsMuscular() == Muscularity.MUSCULAR) {
            if (gender.getWearsMakeup() == YesNo.NO) {
                return "Male";
            }
        }

        // Female characteristics
        if (gender.getHairLength() == HairLength.LONG && gender.getHasFacialHair() == YesNo.NO && gender.getHasMustache() == YesNo.NO) {
            if (gender.getWearsMakeup() == YesNo.YES) {
                return "Female";
            }
        }

        // Default case
        return "Uncertain";
    }
}

