package practice;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.println("Nhập 1 kí tự: ");
            int ch = is.read();// tạo 1 biến đọc kí tự:
            if( ch == 'q'){
                System.out.println("Finished!");
                break;
            }
            is.skip(2); // loại bỏ 2 kí tự r và n;
            System.out.println("Kí tự nhận được: " + (char)ch);

        }

    }
}
