package question1;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)  {

        Scanner in= new Scanner(System.in);
            try{
                File file1=new File("Students.txt");
                Scanner input= new Scanner(file1);

                while(input.hasNextLine()){
                    String data=input.nextLine();
                    System.out.println(data);
                }

            }catch(FileNotFoundException e){
                System.out.println(e.toString());
                e.printStackTrace();
            }

        try{
            File file=new File("Teachers.txt");
            Scanner input= new Scanner(file);

            while(input.hasNextLine()){
                String data=input.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

        try{
            File file=new File("Classroom.txt");
            Scanner input= new Scanner(file);

            while(input.hasNextLine()){
                String data=input.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

        

    }
    }
