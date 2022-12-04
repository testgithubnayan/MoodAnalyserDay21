package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message){
        this.message = message;
    }
    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad"))     //returning the sad 
                return "SAD";
            else
                return "HAPPY";
        }
        catch (Exception e){
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NULL,("Message is Null"));
        }
    }
}
