import java.util.ArrayList;
import java.util.Objects;

public class StudentManagement {
    public Student[] students = new Student[100];
    public ArrayList<Student> students1 = new ArrayList<>();

    /**
     Kiểm tra xem hai sinh viên có cùng lớp hay không.
     @param s1 sinh viên thứ nhất
     @param s2 sinh viên thứ hai
     @return true nếu hai sinh viên cùng lớp, ngược lại trả về false
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return Objects.equals(s1.getGroup(), s2.getGroup());
    }

    /**
     Thêm một đối tượng Student mới vào danh sách students.
     @param newStudent đối tượng Student mới cần được thêm vào danh sách.
     */
    public void addStudent(Student newStudent) {
        if (students1.size() < 100) {
            students1.add(newStudent);
        }
        students = students1.toArray(new Student[100]);
    }


    /**
     Returns a string containing information about all students
     The information for each group is displayed in the following format:
     GroupName1
     StudentInfo1
     StudentInfo2
     ...
     GroupName2
     StudentInfo3
     StudentInfo4
     ...
     and so on for each group.
     @return a string containing information about all students, sorted by group
     */
    public String studentsByGroup() {
        ArrayList<Student> temp = new ArrayList<>(students1);
        StringBuilder stu = new StringBuilder();
        StringBuilder check = new StringBuilder();
        while (!temp.isEmpty()) {
            Student stu1 = temp.get(0);
            check.append(stu1.getGroup()).append("\n");
            for (int i = 0; i < temp.size(); i++) {
                if (sameGroup(temp.get(i), stu1)) {
                    check.append(temp.get(i).getInfo()).append("\n");
                    temp.remove(i);
                    i--;
                }
                stu.append(check);
                check = new StringBuilder();
            }
        }
        return stu.toString();
    }


    /**
     * Xóa sinh viên với mã số tương ứng khỏi danh sách sinh viên.
     * @param id Mã số của sinh viên cần xóa.
     * @throws IllegalArgumentException Nếu id truyền vào là rỗng hoặc null.
     */
    public void removeStudent(String id) {
        students1.removeIf(x -> Objects.equals(x.getId(), id));
        students = students1.toArray(new Student[100]);
    }
}
