package system;

public class Admin extends User {

   private String addFlight;
	
	 private String deleteFlight;
	
	Admin(){
		
		addFlight=null;
		
		deleteFlight = null;
		
	}
	
	Admin(String NewAddFlight, String NewDeleteFlight) {
		
		addFlight = NewAddFlight;
		
		deleteFlight= NewDeleteFlight;
	}
	
	void setAddFlight(String NewAddFlight) {
		
		addFlight = NewAddFlight;
		
		
	}
	
	void setDeleteFlight(String NewDeleteFlight) {
		
		deleteFlight = NewDeleteFlight;
		
		
	}
}
