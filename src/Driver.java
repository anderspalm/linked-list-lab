import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ander on 8/25/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {

    private static String[] firstNames = {"Josh", "John", "Jason", "Dave", "Mike", "Dan", "Gary", "Frank", "Joe",
            "Eric", "Bob", "Kyle", "Bill", "Shane", "Andrew", "Jim", "Doug", "Chris", "Katie",
            "Kayla", "Sarah", "Elizabeth", "Stef", "Mary", "Jane", "Kelly", "Jessica", "Beth",
            "Carla", "Becky", "Linda", "Ruth", "Sandra", "Amy", "Claire", "Donna"};

    private static String[] lastNames = {"Smith", "Davis", "Jones", "Taylor", "Manning", "Jennings", "Williams",
            "Parker", "Elliot", "Patrick", "Johnson", "Davidson", "O'Connor", "Fritz", "Green",
            "Gold", "Foley", "Freeman", "Willis", "Grant"};

    public static void main(String[] args) {
        List<Student> studentArrayList = new ArrayList<>();
        MyLinkedList<Student> studentLinkedList = new MyLinkedList<Student>(lastNames, lastNames.length);

        if (studentArrayList.isEmpty()) {
            for (int i = 0; i <studentArrayList.size() -1; i ++){
                studentArrayList.remove(i);
                studentLinkedList.remove(i);
            }
            generateStudents(20, studentArrayList);
            generateStudents(20, studentLinkedList);
        }
        //Determine which data structure is fastest for each
        //operation. Complete the action

        //Delete the first, if any, Student with tzzhe last name of "Smith"
        studentLinkedList.remove(10);
        studentArrayList.remove(10);
//        for (int i = 0; i < studentLinkedList.getSize() - 1; i++) {
//            System.out.println(studentArrayList.size());
        System.out.println(".get(3): \t\t\t\t" + studentLinkedList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t" + studentLinkedList.remove(2) + " (element removed)");
        System.out.println(".getCounter: \t\t\t" + studentLinkedList.getCounter() + " (elements left in the array)");
        for (int i = 0; i < studentLinkedList.getCounter() - 2; i++) {
            System.out.println(studentArrayList.get(i));

        }
        //Change the name of the 3rd entry to "Joe Montana"

        //Remove the 10th element
    }

    //To generate the ArrayList
    private static void generateStudents(int numberOfStudents, List<Student> outList) {
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            int firstNameIndex = random.nextInt(firstNames.length - 1);
            int lastNameIndex = random.nextInt(lastNames.length - 1);
            double gpa = 3.5 * random.nextDouble() + 0.5;
            outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));
        }
    }

    //To fill the custom LinkedList
    private static void generateStudents(int numberOfStudents, MyLinkedList<Student> outList) {
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            int firstNameIndex = random.nextInt(firstNames.length - 1);
            int lastNameIndex = random.nextInt(lastNames.length - 1);
            double gpa = 3.5 * random.nextDouble() + 0.5;
            outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));
        }
    }
}
