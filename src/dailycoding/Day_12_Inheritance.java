package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_12_Inheritance {
    public static class Student extends Person{
        private int[] testScores;
        Student(String firstName, String lastName, int identification, int[] scores) {
            super(firstName, lastName, identification);
            testScores = scores;
        }

        public char calculate() {
            int sum = 0;
            for (int i = 0; i < testScores.length; i++) sum += testScores[i];
            int avgSum = sum / testScores.length;

            return grade(avgSum);
        }

        private char grade(int avgSum) {
            if (avgSum < 40) return 'T';
            else if (avgSum < 55) return 'D';
            else if (avgSum < 70) return 'P';
            else if (avgSum < 80) return 'A';
            else if (avgSum < 90) return 'E';
            else return 'O';
        }
    }

    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
