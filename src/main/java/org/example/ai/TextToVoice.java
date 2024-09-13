//package org.example.ai;
//
//import com.sun.speech.freetts.*;
//
//public class TextToVoice {
//    public static void main(String[] args) {
//        // The voice we want to use from FreeTTS
//        String voiceName = "kevin16"; // kevin16 is a built-in voice in FreeTTS
//
//        // Create a voice synthesizer
//        VoiceManager voiceManager = VoiceManager.getInstance();
//        Voice voice = voiceManager.getVoice(voiceName);
//
//        if (voice != null) {
//            voice.allocate();  // Allocate resources for the voice
//
//            // Text to be spoken
//            String text = "Hello, this is a Text to Speech conversion using FreeTTS.";
//            System.out.println("Speaking: " + text);
//
//            // Speak the text
//            voice.speak(text);
//
//            // Deallocate resources after speaking
//            voice.deallocate();
//        } else {
//            System.out.println("Cannot find voice: " + voiceName);
//        }
//    }
//}
