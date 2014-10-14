package com.canby.observer;

/**
 * Created by acanby on 10/10/2014.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setChanged();
}
