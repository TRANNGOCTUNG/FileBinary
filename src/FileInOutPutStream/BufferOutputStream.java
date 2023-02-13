package FileInOutPutStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStream {
    public static void main(String[] args) {
            String data = "This is a line of text inside the file";

            try {
                // Creates a FileOutputStream
                FileOutputStream file = new FileOutputStream("C:\\File Codegym\\New folder\\docs\\FileSerialization\\src\\output.txt");

                // Creates a BufferedOutputStream
                BufferedOutputStream output = new BufferedOutputStream(file);

                byte[] array = data.getBytes();

                // Writes data to the output stream
                output.write(array);
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
    }
}
