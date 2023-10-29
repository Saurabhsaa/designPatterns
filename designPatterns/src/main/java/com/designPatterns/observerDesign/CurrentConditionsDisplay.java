package com.designPatterns.observerDesign;

public class CurrentConditionsDisplay implements Observer, Display {

	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;

	CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData; // this reference will be used when we want to remove observer form observer
										// list of subject
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		humidity = weatherData.getHumidity();
		temp = weatherData.getTemp();
		pressure = weatherData.getPressure();
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Temp : " + temp + " Humidity : " + humidity + " Pressure : " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
