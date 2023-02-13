package example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Nguyen Van A", "Ho Chi Minh"));
        students.add(new Student("002", "Nguyen Van B", "Ha Noi"));
        students.add(new Student("003", "Nguyen Van C", "Hue"));
        students.add(new Student("004", "Nguyen Van D", "Da Nang"));
        writeToFile(students);
    try {
        InputStream inputStream = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        OutputStream os = new FileOutputStream("copy-of-student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        List<Student> studentCopy = (List<Student>) ois.readObject();
        oos.writeObject(studentCopy);
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
    private static void writeToFile(List<Student> students) {
        try {
            OutputStream os = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
