package finalProject;

public class Player {
	private String firstName;
	    private String lastName;
	    private int jerseyNumber;
	    private String position;
	    private String starter;

	    public Player() {

	    }

	    public Player(String newFirstName, String newLastName, int newJerseyNumber, String newPosition, String newStarter) {
	        this.firstName = newFirstName;
	        this.lastName = newLastName;
	        this.jerseyNumber = newJerseyNumber;
	        this.position = newPosition;
	        this.starter = newStarter;
	    }

	    public String getFirstName() {
	        return firstName; 
	    }
	    
	    public String getLastName() {
	    	return lastName;
	    }

	    public int getJerseyNumber() {
	        return jerseyNumber;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public String getStarter() {
	        return starter;
	    }

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setJerseyNumber(int jerseyNumber) {
			this.jerseyNumber = jerseyNumber;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public void setStarter(String starter) {
			this.starter = starter;
		}

		@Override
		public String toString() {
			return "Player [firstName=" + firstName + ", lastName=" + lastName + ", jerseyNumber=" + jerseyNumber
					+ ", position=" + position + ", starter=" + starter + "]";
		}

		
}
