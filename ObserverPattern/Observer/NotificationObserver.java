package ObserverPattern.Observer;

import ObserverPattern.Observable.Observable;

public class NotificationObserver implements ChangeObserver {

    private Observable observable;
    private String userName;

    public NotificationObserver(Observable dataObservable, String userName) {
        this.observable = dataObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendNotification("Data value crossed zero", observable.getData());
    }

    private void sendNotification(String msg, int data) {
        System.out.println(msg+ " with value " + data +" notif for "+ userName);
    }
}
