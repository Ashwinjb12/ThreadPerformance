import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadRunnable implements Runnable{

	int loopCount;
	public ThreadRunnable(int lCount) {
		// TODO Auto-generated constructor stub
		this.loopCount=lCount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < loopCount; i++) {
			System.out.println(Thread.currentThread().getName() + " is running for the " + i + " time.");
			try {
				FileOutputStream fout = new FileOutputStream(new File("D:/thread/"+Thread.currentThread().getName()+ "_" + i +"_.txt"));
				String content = Thread.currentThread().getName() + " is runnnig for the " + i + " time";
				fout.write(content.getBytes());
				fout.close();
				Thread.sleep(100);
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Runnable Interface: " + Thread.currentThread().getName() + " has finished running ");
			
	}

	
}
