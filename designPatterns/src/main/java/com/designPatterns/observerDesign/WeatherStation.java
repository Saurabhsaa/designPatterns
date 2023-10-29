package com.designPatterns.observerDesign;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData wd1 = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd1);
		wd1.setMeasurements(25.21f, 97.77f, 99.77f);
	}
}
