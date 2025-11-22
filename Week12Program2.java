package week12;

import java.util.Scanner;

public class Week12Program2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect initial person info
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        input.nextLine();  // clear leftover newline

        System.out.print("Enter ethnic group: ");
        String ethnicGroup = input.nextLine();

        System.out.print("Enter religion: ");
        String religion = input.nextLine();

        // Create Person object
        Persons p = new Persons(firstName, lastName, gender, age, weight, height, ethnicGroup, religion);

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n===== Person Menu =====");
            System.out.println("1 - Say a greeting");
            System.out.println("2 - Say a prayer");
            System.out.println("3 - Take a nap");
            System.out.println("4 - Eat something");
            System.out.println("5 - Print person's name");
            System.out.println("6 - Change religion");
            System.out.println("7 - Print all info");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();  // clear newline

            switch (choice) {
                case 1:
                    p.greet();
                    break;
                case 2:
                    p.pray();
                    break;
                case 3:
                    p.nap();
                    break;
                case 4:
                    System.out.print("What is the person eating? ");
                    String food = input.nextLine();
                    p.eat(food);
                    break;
                case 5:
                    System.out.println("Name: " + p.getName());
                    break;
                case 6:
                    System.out.print("Enter new religion: ");
                    String newRel = input.nextLine();
                    p.setReligion(newRel);
                    System.out.println("Religion updated.");
                    break;
                case 7:
                    p.printInfo();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}

