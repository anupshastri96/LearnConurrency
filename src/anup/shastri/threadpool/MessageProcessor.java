package anup.shastri.threadpool;

public class MessageProcessor implements Runnable{
	
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("[RECEVIED] Processing the Message for thread: "+ Thread.currentThread().getName()+", MESSAGE"+message);
		respondToMessage();
		System.out.println("[DONE] Responding to Thread: "+Thread.currentThread().getName()+"For MESSAGE: "+message);
	}

	private void respondToMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		
	}
	
	

}
