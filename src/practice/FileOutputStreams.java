package practice;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileOutputStreams{


    public static void main(String[] args) {
        // khai báo một mảng ArrayList languages
        ArrayList<String> languages = new ArrayList<>();
        System.out.println("Các phần tử trong mảng languages: " + languages);
        // kiểm tra xem mảng languages có trống hay không
        boolean result = languages.isEmpty(); // true
        System.out.println("Mảng trống đúng hay sai? ->>>> " + result);

        // khai báo một mảng ArrayList languages
        ArrayList<Integer> numbers = new ArrayList<>();
        // thêm phần tử vào mảng numbers
        numbers.add(1);
        numbers.add(3);
        System.out.println("Các phần tử trong mảng numbers: " + numbers);
        // kiểm tra xem mảng numbers có trống hay không
        result = numbers.isEmpty();  // false
        System.out.println("Mảng trống đúng hay sai? ->>>> " + result);

        System.out.println("---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }

}
