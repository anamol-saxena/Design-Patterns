package ObserverPattern.Observer;

import ObserverPattern.Observable.Observable;

public class EmailObserver implements ChangeObserver {

    private Observable observable;
    private String emailId;

    public EmailObserver (Observable dataObservable, String emailId) {
        this.observable = dataObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendNotification("Data value crossed zero", observable.getData());
    }

    private void sendNotification(String msg, int data) {
        System.out.println(msg+ " with value " + data +" email for "+ emailId);
    }
}
