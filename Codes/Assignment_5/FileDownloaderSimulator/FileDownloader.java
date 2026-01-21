package Assignment_5_Q1_FileDownloaderSimulator;


public class FileDownloader implements Runnable{
	private String str;
	
	public FileDownloader(String str) {
		super();
		this.str = str;
	}

	private void downloadFile() {
		System.out.println("Downloading..." + Thread.currentThread().getName() +" : " + str);
	}
	
	private void downloadCompleted() {
		System.out.println("Download Completed..." + Thread.currentThread().getName() +" : " + str);
	}

	@Override
	public void run() {
		try {
			downloadFile();
			Thread.sleep((long)Math.random()*1000);
			downloadCompleted();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}	
}
