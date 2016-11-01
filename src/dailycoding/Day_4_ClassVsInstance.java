package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_4_ClassVsInstance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }

    }


    public static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            age = initialAge < 0 ? warnNegativeAge() : initialAge;

        }

        private int warnNegativeAge() {
            System.out.println("Age is not valid, setting age to 0.");
            return 0;
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println(age < 13 ? "You are young." : age >= 18 ? "You are old." : "You are a teenager.");
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }
}
