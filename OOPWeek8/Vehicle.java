public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * check.
     *
     * @param brand              brand
     * @param model              model
     * @param registrationNumber numer
     * @param owner              ow
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * abrad.
     * @return tre
     */
    public abstract  String getInfo();

    /**
     * tran.
     *
     * @param newOwner la
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * la.
     *
     * @return tran
     */
    public String getBrand() {
        return brand;
    }

    /**
     * la.
     *
     * @return ran
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * la.
     *
     * @return tra
     */
    public String getModel() {
        return model;
    }

    /**
     * la.
     *
     * @return tra
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * la.
     *
     * @param brand tra
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * la.
     *
     * @param model chang
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * la.
     *
     * @param owner chang
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * la.
     *
     * @param registrationNumber chang
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
