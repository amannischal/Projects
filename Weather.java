
public class Weather {
	private double temp; 
	private double humidity; 
	private double dewPoint; 
	private double speed;
	private double precipitation;  
	
	public Weather( double currTemp, double currHumidity, double currDewPoint,
			double currSpeed, double currPrecipitation) {
		temp = currTemp;
		humidity = currHumidity; 
		dewPoint = currDewPoint; 
		speed = currSpeed; 
		precipitation = currPrecipitation; 
	}

	public double getTemp() {
		return temp;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getDewPoint() {
		return dewPoint;
	}

	public double getSpeed() {
		return speed;
	}

	public double getPrecipitation() {
		return precipitation;
	}
	
	

}
