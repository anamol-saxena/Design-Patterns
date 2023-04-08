package ObserverPattern.Observable;

import ObserverPattern.Observer.ChangeObserver;

import java.util.ArrayList;
import java.util.List;

public class DataObservableImpl implements Observable {

    List<ChangeObserver> list = new ArrayList<>();
    private int data = 0;

    @Override
    public void add(ChangeObserver changeObserver) {
        list.add(changeObserver);
    }

    @Override
    public void remove(ChangeObserver changeObserver) {
        list.remove(changeObserver);
    }

    @Override
    public void notifySubscribers() {
        for (ChangeObserver changeObserver : list) {
            changeObserver.update();
        }
    }

    @Override
    public void setData(int newData) {
        this.data = newData;
        if (this.data > 0) {
            notifySubscribers();
        }
    }

    @Override
    public int getData() {
        return data;
    }
}
