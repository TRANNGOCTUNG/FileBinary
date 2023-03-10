package FileInOutPutStream;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("src/input.txt");
            System.exit(0);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            int byteRead = -1;

            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
