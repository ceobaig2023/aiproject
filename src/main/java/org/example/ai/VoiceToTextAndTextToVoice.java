package org.example.ai;

//import com.sun.speech.freetts.*;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class VoiceToTextAndTextToVoice {

    public static void main(String[] args) {
        try {
            // Step 1: Convert Voice to Text using PocketSphinx
            Configuration configuration = new Configuration();
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
            configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
            recognizer.startRecognition(true);
            System.out.println("Say something (say 'exit' to stop)...");

            while (true) {
                String result = recognizer.getResult().getHypothesis();
                System.out.println("You said: " + result);

                // Step 2: Convert Text to Voice using FreeTTS
            //    textToSpeech(result);

                // Exit condition
                if ("exit".equalsIgnoreCase(result)) {
                    System.out.println("Exiting...");
                    break;
                }
            }

            recognizer.stopRecognition();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Text to Speech using FreeTTS
//    public static void textToSpeech(String text) {
//        String voiceName = "kevin16"; // Built-in FreeTTS voice
//        VoiceManager voiceManager = VoiceManager.getInstance();
//        Voice voice = voiceManager.getVoice(voiceName);
//
//        if (voice != null) {
//            voice.allocate();
//            System.out.println("Speaking: " + text);
//            voice.speak(text);
//            voice.deallocate();
//        } else {
//            System.out.println("Voice not found: " + voiceName);
//        }
//    }
}

