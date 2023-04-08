package ObserverPattern.Observable;

import ObserverPattern.Observer.ChangeObserver;

public interface Observable {

    void add (ChangeObserver changeObserver);

    void remove (ChangeObserver changeObserver);

    void notifySubscribers ();

    void setData (int data);

    int getData ();
}
