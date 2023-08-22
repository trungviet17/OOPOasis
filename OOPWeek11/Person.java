public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    /**
     * dhfjsh.
     * @param name shdfj
     * @param age jfhsj
     * @param address hsf
     */
    public Person(String name, int age, String address) {
        this.address = address;
        this.age = age;
        this.name = name;
    }

    /**
     * sdfsh.
     * @return hfjs
     */
    public String getName() {
        return name;
    }

    /**
     * shfjshf.
     * @param name jshdf
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sjfhjs.
     * @return hsfh
     */
    public String getAddress() {
        return address;
    }

    /**
     * sjhfjs.
     * @param address hshfhh
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * shfjs.
     * @return sgfhs
     */
    public int getAge() {
        return age;
    }

    /**
     * shfjs.
     * @param age shfh
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * shfjsh.
     * @param o the object to be compared.
     * @return jshfjs
     */
    @Override
    public int compareTo(Person o) {
        int nameComp = this.name.compareTo(o.getName());
        if (nameComp != 0) {
            return nameComp;
        }
        return Integer.compare(this.age, o.getAge());
    }
}
