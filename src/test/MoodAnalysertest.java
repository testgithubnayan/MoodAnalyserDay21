import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {

    @Test
    public void givenMessageWhenSadShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("SAD", result);
        }
        catch (MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.exceptionType.NULL,e.type);
        }
    }
        @Test
     public void givenMessageWhenHappyShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch (MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.exceptionType.NULL,e.type);
        }
     }

     @Test
     public void shouldHandleNullMessage(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch (MoodAnalyserException e){
            Assertions.assertEquals("Message is Null",e.getMessage());
        }
     }
}
