package AddressBookManagement;
public class UC1
{

	    private String firstName;
	    private String lastName;
	    private String city;
	    private String state;
	    private int zip;
	    private long phoneNumber;
	    private String email;

	    public UC1() {
	        this.firstName=null;
	        this.lastName=null;
	        this.city=null;
	        this.state=null;;
	        this.zip=0;
	        this.phoneNumber=0;
	        this.email=null;

	    }

	    public String getFirstName() {
	        return firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public String getCity() {
	        return city;
	    }
	    public String getState() {
	        return state;
	    }
	    public int getZip() {
	        return zip;
	    }
	    public long getPhoneNumber() {
	        return phoneNumber;
	    }
	    public String getEmail() {
	        return email;
	    }


	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    public void setPhoneNumber(long phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String toString() {
	        return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
	                + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	    }
	}
