package test;

import practice.FileOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;

public class FileByte {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream in = null;
            FileOutputStream out = null;
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }

    }
}
