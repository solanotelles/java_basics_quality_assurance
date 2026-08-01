package month2.week1.student;

public class StudentPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Luiz Solano", 5, 7, 9);
        Student student2 = new Student("Wanessa Abdala", 10, 5, 5);
        Student student3 = new Student("Gabriel Telles", 6.9, 7.0, 7.1);

        student1.showResult();
        student2.showResult();
        student3.showResult();
    }
}
