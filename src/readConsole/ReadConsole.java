package readConsole;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        try{
            cin = new InputStreamReader(System.in);
            System.out.println("Nhập kí tự, 'q' để thoát");
            char c;
            do{
                c = (char)cin.read();
                System.out.println(c);
            } while (c != 'q');
        } finally {
            if(cin != null){
                cin.close();
            }
        }

    }
}
