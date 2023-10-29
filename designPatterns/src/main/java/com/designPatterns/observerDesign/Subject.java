package com.designPatterns.observerDesign;

public interface Subject {

	void registerObserver(Observer obs);

	void removeObserver(Observer obs);

	void notifyObserver();
}
