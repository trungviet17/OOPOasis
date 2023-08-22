import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentManagement {
    private Student[] students = new Student[100];
    private int numOfStudent = 0;
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup() == s2.getGroup()) return true;
        return false;
    }

    public void addStudent(Student newStudent){
        if(numOfStudent == students.length) return;
        students[numOfStudent] = newStudent;
        numOfStudent ++;
        return;
    }

    public String studentsByGroup() {
        // Tạo một danh sách các lớp học
        ArrayList<String> groups = new ArrayList<>();
        for (Student student : students) {
            String group = student.getGroup();
            if (!groups.contains(group)) {
                groups.add(group);
            }
        }
        Collections.sort(groups, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int index1 = -1;
                int index2 = -1;
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getGroup().equals(o1)) {
                        index1 = i;
                        if (index2 >= 0) {
                            break;
                        }
                    } else if (students[i].getGroup().equals(o2)) {
                        index2 = i;
                        if (index1 >= 0) {
                            break;
                        }
                    }
                }
                return index1 - index2;
            }
        });
        StringBuilder sub = new StringBuilder();
        for (String group : groups) {
            sub.append(group).append("\n");
            for (Student student : students) {
                if (student.getGroup().equals(group)) {
                    sub.append(student.getInfo()).append("\n");
                }
            }
        }

        return sub.toString();
    }







}
