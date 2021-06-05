package anup.shastri.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable process = new MessageProcessor(1);
		executor.execute(process);
		
		Runnable process2 = new MessageProcessor(2);
		executor.execute(process2);
		
		Runnable process3 = new MessageProcessor(3);
		executor.execute(process3);
		
		executor.shutdown();
		
	}

}
