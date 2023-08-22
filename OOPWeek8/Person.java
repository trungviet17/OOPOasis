import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * la.
     *
     * @param name    name
     * @param address add
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * name.
     *
     * @param vehicle ve
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * name.
     *
     * @param registrationNumber ve
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleList.get(i));
            }
        }
    }

    /**
     * name.
     *
     * @param address add
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * va.
     *
     * @return name
     */
    public String getAddress() {
        return address;
    }

    /**
     * va.
     *
     * @param name nm
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * va.
     *
     * @return name
     */
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    /**
     * va.
     *
     * @return najkf
     */
    public String getName() {
        return name;
    }

    /**
     * va.
     *
     * @param vehicleList fjhjsd
     */
    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    /**
     * hfjdshf.
     *
     * @return fhd
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            StringBuilder res = new StringBuilder();
            res.append(name).append(" has:").append("\n");
            res.append("\n");
            for (int i = 0; i < vehicleList.size(); i++) {
                res.append(vehicleList.get(i).getInfo()).append("\n");
            }
            return res.toString();
        }
    }
}
