package practice;

import java.io.*;

public class FileInputStreams {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);
            while (true) {
                System.out.println(din.readInt());// đọc dữ liệu kiểu int;
            }
        } catch (EOFException e){

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
