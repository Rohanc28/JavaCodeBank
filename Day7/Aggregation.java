class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Aggregation {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student("John", 20));
        university.addStudent(new Student("Jane", 21));

        System.out.println("The university has " + university.getStudents().size() + " students");
    }
}
