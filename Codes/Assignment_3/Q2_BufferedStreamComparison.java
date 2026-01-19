package Assignment_3;

import java.io.*;

public class Q2_BufferedStreamComparison {

    public static void copyNonBuffered(FileInputStream fis,
                                       FileOutputStream fos) throws IOException {

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
    }

    public static void copyBuffered(BufferedInputStream bis,
                                    BufferedOutputStream bos) throws IOException {

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
    }

    public static void main(String[] args) {

        long nonBufferedTime;
        long bufferedTime;

        // -------- Non-buffered copy --------
        long start = System.currentTimeMillis();

        try (FileInputStream fis =
                     new FileInputStream("C:\\Users\\VE00YN351\\Downloads\\Dog.jpg");
             FileOutputStream fos =
                     new FileOutputStream("C:\\Users\\VE00YN351\\Downloads\\Dog_non_buffered.jpg")) {

            copyNonBuffered(fis, fos);

        } catch (IOException e) {
            e.printStackTrace();
        }

        nonBufferedTime = System.currentTimeMillis() - start;

        // -------- Buffered copy --------
        start = System.currentTimeMillis();

        try (BufferedInputStream bis =
                     new BufferedInputStream(
                             new FileInputStream("C:\\Users\\VE00YN351\\Downloads\\Dog.jpg"));
             BufferedOutputStream bos =
                     new BufferedOutputStream(
                             new FileOutputStream("C:\\Users\\VE00YN351\\Downloads\\Dog_buffered.jpg"))) {

            copyBuffered(bis, bos);

        } catch (IOException e) {
            e.printStackTrace();
        }

        bufferedTime = System.currentTimeMillis() - start;

        // -------- Results --------
        System.out.println("Without buffering: " + nonBufferedTime + " ms");
        System.out.println("With buffering   : " + bufferedTime + " ms");
        System.out.println("Performance gain : " +
                (nonBufferedTime - bufferedTime) + " ms");
    }
}
