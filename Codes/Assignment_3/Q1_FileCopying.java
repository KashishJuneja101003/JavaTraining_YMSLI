package Assignment_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1_FileCopying {
	public static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
		int b;

		while ((b = fileInputStream.read()) != -1) {
			fileOutputStream.write(b);
		}
	}

	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream(
				new File("C:\\Users\\VE00YN351\\Downloads\\Dog.jpg"));
				
				FileOutputStream fileOutputStream = new FileOutputStream(
						new File("C:\\Users\\VE00YN351\\Downloads\\newFile.jpg"));) {

			copyFile(fileInputStream, fileOutputStream);

			System.out.println("File Copied Successfully");
			System.out.println(fileInputStream);
			System.out.println(fileOutputStream);
		} catch (FileNotFoundException e) {
			System.out.println("Exception Occurred: " + e);
		} catch (IOException e) {
			System.out.println("Exception Occurred: " + e);
		} catch (Exception e) {
			System.out.println("Exception Occurred: " + e);
		} finally {

		}

	}

}
