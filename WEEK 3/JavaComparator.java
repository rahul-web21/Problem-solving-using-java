import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.cgpa != b.cgpa)
            return Double.compare(b.cgpa, a.cgpa);
        else if (!a.name.equals(b.name))
            return a.name.compareTo(b.name);
        else
            return a.id - b.id;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
        }

        Collections.sort(list, new StudentComparator());

        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}