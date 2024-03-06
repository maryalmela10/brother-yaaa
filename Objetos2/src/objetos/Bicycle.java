package objetos;

public class Bicycle {

	// the Bicycle class has
    // three fields
    private int cadence;
    private int gear;
    private int speed;
        
    // the Bicycle class has
    // one constructor
        public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four method
   
            
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void speedUp(int increment) {
        speed += increment;
    }
    
}