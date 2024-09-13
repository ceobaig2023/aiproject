package org.example.ai;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class VoiceToText {
    public static void main(String[] args) {
        try {
            // Configure PocketSphinx
            Configuration configuration = new Configuration();

            // Set path to acoustic model, dictionary, and language model (downloaded from PocketSphinx)
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
            configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

            // Initialize live speech recognizer
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
            recognizer.startRecognition(true);
            System.out.println("Say something...");

            // Continuous speech recognition loop
            while (true) {
                String result = recognizer.getResult().getHypothesis();
                System.out.println("You said: " + result);
                // Stop the recognition if needed
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
}
