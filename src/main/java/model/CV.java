package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CV {

	
	public String name;
	public int age;
	public String address;
	public String email;
	public String phone;
	public String profession;
	
	
	@Override
    public String toString() {
        return "\n=============================\n" +
               "         MY CV DETAILS       \n" +
               "=============================\n" +
               "Name        : " + name + "\n" +
               "Age         : " + age + "\n" +
               "Address     : " + address + "\n" +
               "Email       : " + email + "\n" +
               "Phone       : " + phone + "\n" +
               "Profession  : " + profession + "\n" +
               "=============================\n";
    }
	
}
