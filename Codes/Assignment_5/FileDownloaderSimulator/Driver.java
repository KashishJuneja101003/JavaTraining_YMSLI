package Assignment_5_Q1_FileDownloaderSimulator;

public class Driver {

	public static void main(String[] args) {
		for(int i=1; i<=25; i++) {
			String string = "https://www.dropbox.com/photo" + i + ".jpg";
			
			Runnable task= new FileDownloader(string);
			Thread thread = new Thread(task);
			
			try {
				Thread.sleep((long)Math.random()*2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			thread.start();
			
//			try {
////				thread.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

}
