package month2.week1.student;

public class Student {
    String name;
    double grade1, grade2, grade3;

    Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    void showResult(){
        System.out.println("Student name: " + name);
        System.out.printf("Average: %.2f%n", calculateAverage());

        if (calculateAverage() >= 7){
            System.out.println("Status: Approved\n");
        } else {
            System.out.println("Status: Not Approved\n");
        }
    }
}
