import java.util.*;
import java.io.*; 

public class WeatherDataReader {
	private HashMap<Integer, Weather> weatherData; 
	
	public WeatherDataReader(String filename) {
		File file = new File(filename); 
		weatherData = new HashMap<Integer, Weather>(); 
		try {
			Scanner s = new Scanner(file);
			s.nextLine(); 
			while (s.hasNextLine()) {
				String weatherRow = s.nextLine(); 
				String[] colData = weatherRow.split(","); 
				System.out.println("TEST");
				
				double temp = Double.parseDouble(colData[2]); 
				double dp = Double.parseDouble(colData[5]);
				double humidity = Double.parseDouble(colData[8]);
				double speed = Double.parseDouble(colData[11]);
				double precip = Double.parseDouble(colData[16]);
				
				Weather w = new Weather(temp,dp,humidity,speed,precip);
				
				weatherData.put(Integer.parseInt(colData[0]), w);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public boolean didItRain(int day) {
		Weather w = weatherData.get(day); 
		if (w.getPrecipitation()> 0) {return true;}
		else {return false;}
	}
	
	public int rainestDay(){
		int rainday = 0;
		double rainAmount = 0.0;
		
		for (int key: weatherData.keySet()) {
			Weather w = weatherData.get(key); 
			double rain = w.getPrecipitation(); 
			if (rain> rainAmount) {
				rainAmount = rain; 
				rainday = key; 
			}
			
		}
		System.out.println(rainAmount);
		return rainday; 
	}
	
	public static void main(String[] args) {
		WeatherDataReader wdr = new WeatherDataReader("DurhamWeather.csv"); 
		
		System.out.println(wdr.didItRain(18)); 
		System.out.println(wdr.rainestDay());
	}

}
