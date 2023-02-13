package practiceStuden;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(new Student(1,"Trần Minh Ngọc","Nữ"));
        list.add(new Student(1,"Trần Ngọc Anh","Nữ"));
        list.add(new Student(1,"Trần Thu Trang","Nữ"));
        writeToFile("src/practiceStuden/student.dac",list);
        List<Student> studenDataFromFile = readDataFromFile("src/practiceStuden/student.dac");
        for (Student students: studenDataFromFile
             ) {
            System.out.println(students);
        }

    }
    public static void writeToFile(String path, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
return students;
    }
}
