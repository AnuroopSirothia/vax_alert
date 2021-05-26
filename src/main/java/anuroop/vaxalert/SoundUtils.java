package anuroop.vaxalert;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoundUtils {

	private static final Logger log = LoggerFactory.getLogger(SoundUtils.class);
	
	public static float SAMPLE_RATE = 8000f;

	public static void tone(int hz, int msecs) 
			throws LineUnavailableException 
	{
		tone(hz, msecs, 1.0);
	}

	public static void tone(int hz, int msecs, double vol)
			throws LineUnavailableException 
	{
		byte[] buf = new byte[1];
		AudioFormat af = 
				new AudioFormat(
						SAMPLE_RATE, // sampleRate
						8,           // sampleSizeInBits
						1,           // channels
						true,        // signed
						false);      // bigEndian
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		for (int i=0; i < msecs*8; i++) {
			double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
			buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
			sdl.write(buf,0,1);
		}
		sdl.drain();
		sdl.stop();
		sdl.close();
	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
			Thread.currentThread().setName("Slot-Available-Beeper");
			String threadName = Thread.currentThread().getName();

			for(int i = 0; i < 80; i++) {
				try {
					SoundUtils.tone(1000,100);
					SoundUtils.tone(5000,100);
					log.debug(threadName + ": Slot found!");

				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}