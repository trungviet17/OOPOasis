import java.security.PublicKey;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }


    /**
     Constructs a new instance of the Student class with default values.
     The default values are:
     name: "Student"
     id: "000"
     group: "K62CB"
     email: "uet@vnu.edu.vn"
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }


    /**
     Constructs a new instance of copying the values from another Student object.
     @param s the Student object to copy
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     Constructs a new instance of the Student class with the specified name, id, and email.
     The group is set to the default value of "K62CB".
     @param name the name of the student
     @param id the ID of the student
     @param email the email address of the student
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

}

