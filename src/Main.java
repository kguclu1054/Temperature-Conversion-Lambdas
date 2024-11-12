
public class Main {

	public static void main(String[] args) {
		
		SicaklikDonusumleri celsiusToFahrenheit = (sicaklik) -> (sicaklik * 9/5) + 32;
		SicaklikDonusumleri fahrenheitToCelsius = (sicaklik) -> (sicaklik - 32) + 5/9;
		SicaklikDonusumleri celsiusToKelvin = (sicaklik) -> sicaklik + 273.15;
		SicaklikDonusumleri kelvinToCelsius = (sicaklik) -> sicaklik - 273.15;
		SicaklikDonusumleri fahrenheitToKelvin = (sicaklik) -> (sicaklik - 32) * 5/9 + 273.15;
		SicaklikDonusumleri kelvinToFahrenheit = (sicaklik) -> (sicaklik - 273.15) * 9/5 + 32;
		
		double tempCelsius = 25.0; 
		double tempFahrenheit = 77.0; 
		double tempKelvin = 298.15;
		
		System.out.println("25°C to Fahrenheit: " + celsiusToFahrenheit.sicaklik(tempCelsius) + "°F");
		System.out.println("77°F to Celsius: " + fahrenheitToCelsius.sicaklik(tempFahrenheit) + "°C"); 
		System.out.println("25°C to Kelvin: " + celsiusToKelvin.sicaklik(tempCelsius) + "K"); 
		System.out.println("298.15K to Celsius: " + kelvinToCelsius.sicaklik(tempKelvin) + "°C"); 
		System.out.println("77°F to Kelvin: " + fahrenheitToKelvin.sicaklik(tempFahrenheit) + "K"); 
		System.out.println("298.15K to Fahrenheit: " + kelvinToFahrenheit.sicaklik(tempKelvin) + "°F");
	}

}
