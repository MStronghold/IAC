import java.util.ArrayList;

/**
 * Created by lucas on 7-2-2017.
 */
public class Customer {

    private String name;
    private String dateOfBirth;

    private Address address;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
