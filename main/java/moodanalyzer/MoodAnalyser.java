package moodanalyzer;

public class MoodAnalyser {

	//method to analyse mood by reading string
	public String analyseMood(String message) {
		if (message.contains("Happy")) {
			return "Happy";
		} else if (message.contains("Sad")) {
			return "Sad";
		} else {
			return null;
		}
	}

	//main method
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am Happy");
		System.out.println(mood);
		mood = moodAnalyser.analyseMood("I am Sad");
		System.out.println(mood);
	}
}