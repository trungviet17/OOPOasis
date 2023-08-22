public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * jshdjfh.
     *
     * @param brand              fhsjd
     * @param model              fhsj
     * @param registrationNumber hjshd
     * @param owner              hsjhdf
     * @param hasSidecar         hshf
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * jhfjs.
     *
     * @return hfjs
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * jhfhs.
     *
     * @param hasSidecar hfsj
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * fsjdhf.
     *
     * @return fhsh
     */
    @Override
    public String getInfo() {
        String res = "Motor Bike:\n" + "\tBrand: " + brand + "\n"
               + "\tModel: " + model + "\n" + "\tRegistration Number: "
               + registrationNumber + "\n"
               + "\tHas Side Car: " + hasSidecar + "\n"
               + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return res;

    }
}
