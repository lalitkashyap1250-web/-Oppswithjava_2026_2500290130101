import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m) {
        this.name = n;
        this.rollno = r;
        this.marks = m;
    }

    // Default sorting: Roll Number
    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + marks;
    }
}

// Custom sorting: Marks descending, then Roll No ascending
class CustomComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o1.marks != o2.marks)
            return o2.marks - o1.marks;

        return o1.rollno - o2.rollno;
    }
}

// Custom sorting: Name ascending
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> i = new ArrayList<>();

        i.add(23);
        i.add(12);
        i.add(14);
        i.add(15);
        i.add(16);

        // Ascending
        i.sort(null);
        System.out.println(i);

        // Descending
        i.sort(Collections.reverseOrder());
        System.out.println(i);


        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("rahul", 1, 100));
        st.add(new Student("Nitesh", 210, 20));
        st.add(new Student("Neetesh", 7, 80));
        st.add(new Student("Nilesh", 9, 70));
        st.add(new Student("Mitesh", 20, 80));

        // Comparable -> Roll No ascending
        st.sort(null);
        System.out.println(st);

        // Comparator -> Marks descending, Roll No ascending
        st.sort(new CustomComparator());
        System.out.println(st);

        // Comparator -> Name ascending
        st.sort(new NameComparator());
        System.out.println(st);
    }
}