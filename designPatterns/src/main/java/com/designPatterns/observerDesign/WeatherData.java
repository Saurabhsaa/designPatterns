package com.designPatterns.observerDesign;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		this.observers.add(obs);

	}

	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);

	}

	@Override
	public void notifyObserver() {
		//call update method of all available observers
		for(Observer observer: observers) {
//			observer.update(temp, humidity, pressure);
			observer.update();
		}
	}
	
	public void mesurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		mesurementsChanged();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
