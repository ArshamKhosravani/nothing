package question1;
import java.io.*;

public class StudentNotFoundException extends FileNotFoundException {

    @Override
    public String toString() {
        return "StudentNotFound!";
    }
}
