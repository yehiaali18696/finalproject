
import java.io.Serializable;

public class DoubleRoom extends SingleRoom implements Serializable, roomMaintance{ //2.  inheritance check
	String name2;
	String contact2;
	String gender2;

	DoubleRoom() {
		this.name = "";
		this.name2 = "";
	}

	DoubleRoom(String name, String contact, String gender, String name2, String contact2, String gender2) { // 3. Overriding checked 
		super(name, contact, gender);
		this.name2 = name2;
		this.contact2 = contact2;
		this.gender2 = gender2;
	}
	
	public void ChangeFirstName(String newName){
		this.name = newName ;
	}
	
	public void ChangeFirstGender(String newGender){
		this.gender = newGender ;
	}
}