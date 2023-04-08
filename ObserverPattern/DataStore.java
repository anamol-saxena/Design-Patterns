package ObserverPattern;

import ObserverPattern.Observable.DataObservableImpl;
import ObserverPattern.Observable.Observable;
import ObserverPattern.Observer.ChangeObserver;
import ObserverPattern.Observer.EmailObserver;
import ObserverPattern.Observer.NotificationObserver;

public class DataStore {

    public static void main(String[] args) {

        Observable dataObservableImpl = new DataObservableImpl();
        ChangeObserver observer1 = new NotificationObserver(dataObservableImpl, "user1");
        ChangeObserver observer2 = new NotificationObserver(dataObservableImpl, "user2");
        ChangeObserver observer3 = new EmailObserver(dataObservableImpl, "email1");
        ChangeObserver observer4 = new EmailObserver(dataObservableImpl, "email2");

        dataObservableImpl.add(observer1);
        dataObservableImpl.add(observer2);
        dataObservableImpl.add(observer3);
        dataObservableImpl.add(observer4);

        dataObservableImpl.setData(5);
        dataObservableImpl.remove(observer4);
        dataObservableImpl.setData(15);

    }
}
