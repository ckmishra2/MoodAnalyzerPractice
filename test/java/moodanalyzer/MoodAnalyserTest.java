package moodanalyzer;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("Sad", actualResult);
	}

}