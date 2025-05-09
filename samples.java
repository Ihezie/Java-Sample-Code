public class JavaExamples {
    // 1. HelloWorld
    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }

    // 2. EqualityExample
    public static class EqualityExample {
        public static void main(String[] args) {
            String a = new String("test");
            String b = new String("test");
            System.out.println(a == b);         // false
            System.out.println(a.equals(b));    // true
        }
    }

    // 4. AddNumbers
    public static class AddNumbers {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            scanner.close();
        }
    }

    // 6. EvenOdd
    public static class EvenOdd {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
            scanner.close();
        }
    }

    // 7. LargestNumber
    public static class LargestNumber {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter third number: ");
            int c = scanner.nextInt();
            int largest;
            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }
            System.out.println("The largest number is: " + largest);
            scanner.close();
        }
    }

    // 9. MultiplicationTable
    public static class MultiplicationTable {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a number to print its multiplication table: ");
            int num = scanner.nextInt();
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            scanner.close();
        }
    }

    // 11. Student
    public static class Student {
        String name;
        String matricNo;
        double score;
        public Student(String name, String matricNo, double score) {
            this.name = name;
            this.matricNo = matricNo;
            this.score = score;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Matric No: " + matricNo);
            System.out.println("Score: " + score);
        }
    }

    public static class StudentMain {
        public static void main(String[] args) {
            Student student1 = new Student("Aisha", "MAT123", 87.5);
            student1.displayInfo();
        }
    }

    // 12. Calculator
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a + b + c;
        }
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.add(2, 3));         // 5
            System.out.println(calc.add(2.5, 3.7));     // 6.2
            System.out.println(calc.add(1, 2, 3));      // 6
        }
    }

    // 13. InheritanceExample
    public static class Person {
        String name;
        int age;
        public void introduce() {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }

    public static class Teacher extends Person {
        String subject;
        public void teach() {
            System.out.println("I teach " + subject);
        }
    }

    public static class InheritanceExample {
        public static void main(String[] args) {
            Teacher teacher = new Teacher();
            teacher.name = "Mr. John";
            teacher.age = 40;
            teacher.subject = "Mathematics";
            teacher.introduce();
            teacher.teach();
        }
    }

    // 16. StudentProfile
    public static class StudentProfile {
        String studentName;
        int studentScore;
        public void displayStudentInfo() {
            System.out.println("Name: " + studentName);
            System.out.println("Score: " + studentScore);
        }
        public static void main(String[] args) {
            StudentProfile student = new StudentProfile();
            student.studentName = "Nampos";
            student.studentScore = 85;
            student.displayStudentInfo();
        }
    }

    // 18. Greeter
    public static class Greeter {
        public static void greet(String name) {
            System.out.println("Hello, " + name);
        }
        public static void main(String[] args) {
            greet("Alice");
            greet("Bob");
            greet("Carol");
        }
    }

    // 22. Tester
    public static class Tester {
        public static double calculateAverage(int a, int b, int c, int d, int e) {
            return (a + b + c + d + e) / 5.0;
        }
        public static void main(String[] args) {
            double result = calculateAverage(10, 20, 30, 40, 50);
            System.out.println("Average: " + result);
        }
    }

    // 25. MathUtils
    public static class MathUtils {
        /**
         * Adds two integers and returns the result.
         *
         * @param a First number
         * @param b Second number
         * @return Sum of a and b
         */
        public int add(int a, int b) {
            return a + b;
        }
        public static void main(String[] args) {
            MathUtils utils = new MathUtils();
            System.out.println("Sum: " + utils.add(5, 7));
        }
    }

    // 27. RefactoringExample
    public static class RefactoringExample {
        public void printName(String name) {
            System.out.println("Name: " + name);
        }
        public void printAge(int age) {
            System.out.println("Age: " + age);
        }
    }

    // 31. StudentRecords
    public static class StudentRecords {
        public static void main(String[] args) {
            java.util.HashMap<String, Integer> records = new java.util.HashMap<>();
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice;
            while (true) {
                System.out.println("\nGrade Tracker Menu:");
                System.out.println("1. Add student");
                System.out.println("2. Update grade");
                System.out.println("3. View all records");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    if (records.containsKey(name)) {
                        System.out.println("Student already exists.");
                    } else {
                        System.out.print("Enter grade: ");
                        int grade = scanner.nextInt();
                        records.put(name, grade);
                        System.out.println("Student added.");
                    }
                } else if (choice == 2) {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    if (records.containsKey(name)) {
                        System.out.print("Enter new grade: ");
                        int grade = scanner.nextInt();
                        records.put(name, grade);
                        System.out.println("Grade updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                } else if (choice == 3) {
                    if (records.isEmpty()) {
                        System.out.println("No records to show.");
                    } else {
                        System.out.println("Student Records:");
                        for (String name : records.keySet()) {
                            System.out.println(name + ": " + records.get(name));
                        }
                    }
                } else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            }
            scanner.close();
        }
    }

    // 32. ATMSystem
    public static class ATMSystem {
        private static double balance = 1000.0; // Initial balance
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice;
            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Current Balance: $" + balance);
                } else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Deposit successful. New Balance: $" + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                } else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal successful. New Balance: $" + balance);
                    } else {
                        System.out.println("Invalid amount or insufficient funds.");
                    }
                } else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            }
            scanner.close();
        }
    }
}
