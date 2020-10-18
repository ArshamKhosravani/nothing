package question1;
import java.util.*;
import java.io.*;

public class Classroom {

    List<Teacher> teachers=new ArrayList<>();
    List<Student> students=new ArrayList<>();
    Map<Student,Teacher> map= new HashMap<>();

    public Student Students(String name) throws StudentNotFoundException
    {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        throw new StudentNotFoundException();

    }

    public Teacher Teachers(String name) throws TeacherNotFoundException
    {
        for (Teacher t : teachers) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        throw new TeacherNotFoundException();
    }

    public void PutClass(Student student, Teacher teacher)
    {
        map.put(student,teacher);
    }

    public boolean IsStudentInClass(Student student){
        if(map.containsValue(student))
            return true;
        return false;
    }

    public boolean IsTeacherInClass(Teacher teacher){
        if(map.containsKey(teacher))
            return true;
        return false;
    }

    public Student SearchTeacher(Teacher teacher){
        for(Student s:students)
        {
            if(IsTeacherInClass(teacher))
                return s;
        }
        return null;
    }

    public Teacher SearchTeacher(Student student){

            if(IsStudentInClass(student))
                return map.get(student);
            return null;
    }
}
