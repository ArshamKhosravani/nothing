package question1;
import java.io.*;

public class TeacherNotFoundException extends FileNotFoundException {

    @Override
    public String toString() {
        return "TeacherNotFound!";
    }
}
