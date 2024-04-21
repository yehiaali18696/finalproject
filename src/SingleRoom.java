
import java.io.Serializable;
import java.util.ArrayList;

public class SingleRoom implements Serializable,roomMaintance {
	String name;
	String contact;
	String gender;
	ArrayList<Food> food = new ArrayList<>(); // 6. collection check

	SingleRoom() {
		this.name = "";
	}

	SingleRoom(String name, String contact, String gender) {
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}
	
	public void ChangeFirstName(String newName){
	this.name = newName ;
	}
	
	public void ChangeFirstGender(String newGender){
		this.gender = newGender ;
  	}
}
