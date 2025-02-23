import java.util.*;

class Student {
    String name;
    String rollNo;
    Map<Course, List<Integer>> marks = new HashMap<>();

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void addMarks(Course course, List<Integer> marks) {
        this.marks.put(course, marks);
    }

    public Map<Course, List<Integer>> getMarks() {
        return marks;
    }
}

class Course {
    String courseCode;
    String courseName;
    int credits;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return courseCode + ": " + courseName;
    }
}

class Department {
    String departmentName;
    List<Course> courses = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

class ResultManagementSystem {
    List<Student> students = new ArrayList<>();
    List<Department> departments = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void printResults() {
        for (Student student : students) {
            System.out.println("Results for " + student.name + " (" + student.rollNo + "):");
            for (Map.Entry<Course, List<Integer>> entry : student.getMarks().entrySet()) {
                System.out.println(entry.getKey() + " - Marks: " + entry.getValue());
            }
            System.out.println();
        }
    }
}

public class main1 {
    public static void main(String[] args) {
        // Create departments
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        // Create courses
        Course java = new Course("CS101", "Introduction to Java", 4);
        Course algorithms = new Course("CS201", "Data Structures and Algorithms", 4);
        Course circuits = new Course("EE101", "Basic Circuits", 3);

        // Add courses to departments
        cs.addCourse(java);
        cs.addCourse(algorithms);
        ee.addCourse(circuits);

        // Create students
        Student student1 = new Student("Alice", "CS2021001");
        Student student2 = new Student("Bob", "EE2021002");

        // Add marks to students
        student1.addMarks(java, Arrays.asList(85, 90, 80));
        student1.addMarks(algorithms, Arrays.asList(78, 88, 82));
        student2.addMarks(circuits, Arrays.asList(75, 80, 78));

        // Create result management system
        ResultManagementSystem rms = new ResultManagementSystem();

        // Add departments and students to the system
        rms.addDepartment(cs);
        rms.addDepartment(ee);
        rms.addStudent(student1);
        rms.addStudent(student2);

        // Print the results
        rms.printResults();
    }
}