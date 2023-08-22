public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * va.
     *
     * @param brand              bagfh
     * @param model              hjhf
     * @param registrationNumber hd
     * @param owner              hdh
     * @param numberOfDoors      hfajdh
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * jsdhfj.
     *
     * @return fshd
     */
    @Override
    public String getInfo() {
        String sb = "Car:\n" + "\tBrand: " + brand + "\n"
                 + "\tModel: " + model + "\n"
                 + "\tRegistration Number: " + registrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                 + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return sb;
    }

    /**
     * jshdhfjs.
     *
     * @return hfjsdh
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * jhfjs.
     *
     * @param numberOfDoors hsjhdf
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
