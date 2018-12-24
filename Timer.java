
package com.theinvader360.racegame;

public class Timer {
    private final long nanosPerMilli = 1000000;
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    // Start measuring
    public void start() {
        this.startTime = System.nanoTime();       
        this.running = true;
    }

	// Stop measuring
    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }

    // Reset
    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
        this.running = false;
    }

    // Get elapsed milliseconds
    public long getElapsedMilliseconds() {
        long elapsed;
        if (running) {
             elapsed = (System.nanoTime() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed / nanosPerMilli;
    }

    // Get formatted elapsed time
    public String getElapsed() {
        String timeFormatted = "";
        timeFormatted = formatTime(getElapsedMilliseconds());        
        return timeFormatted;
    }

    // Helper method splits time into minutes, seconds, hundredths, and formats
    public static String formatTime(final long millis) {
		int minutesComponent = (int)(millis / (1000 * 60));
		int secondsComponent = (int)((millis / 1000) % 60);
		int hundredthsComponent = (int)((millis / 10) % 100);
		String paddedMinutes = String.format("%02d", minutesComponent);
		String paddedSeconds = String.format("%02d", secondsComponent);
		String paddedHundredths = String.format("%02d", hundredthsComponent);
		String formattedTime;
		if ((millis>0)&&(millis<3600000)) {
			formattedTime = paddedMinutes+":"+paddedSeconds+":"+paddedHundredths;
		}
		else {
			formattedTime = 59+":"+59+":"+99;
		}
        return formattedTime;
    }
}
