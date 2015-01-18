package de.vion.eyetracking.testframework.tests.word.logging;

/**
 * The callbacks for the logging of words
 * 
 * @author Andr� Pomp
 * 
 */
public interface LogObjectWordCallback {

	public void onTestStarted();

	public void onSequenceStarted(String fontSize, long time);

	public void onWordPositionCalculated(String currentWord, int topLeftX,
			int topLeftY, int bottomRightX, int bottomRightY, long currentTime);

	public void onSequenceFinished();
}
