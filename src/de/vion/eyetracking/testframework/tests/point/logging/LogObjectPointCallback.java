package de.vion.eyetracking.testframework.tests.point.logging;

/**
 * The callback for the logging of points
 * 
 * @author Andr� Pomp
 * 
 */
public interface LogObjectPointCallback {

	public void onTestStarted();

	public void onPointStarted(int centerX, int centerY, long startTime);

	public void onTestFinished();

}
