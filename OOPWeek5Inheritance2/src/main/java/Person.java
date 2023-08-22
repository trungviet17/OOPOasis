public class Person {
    private String name;
    private String address;

    /**
     * Khai báo mặc định.
     */
    public Person() {

    }

    /**
     * Khai báo đầy đủ.
     * @param name là tên
     * @param address là địa chỉ
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Lấy tên.
     * @return tên
     */
    public String getName() {
        return name;
    }

    /**
     * Đặt tên.
     * @param name là tên
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lấy địa chỉ.
     * @return địa chỉ
     */
    public String getAddress() {
        return address;
    }

    /**
     * Đặt địa chỉ.
     * @param address là địa chỉ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * In ra màn hình.
     * @return chuỗi in
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
