package com.spring.event;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Observable;
import java.util.Observer;

/**
 * Observable/Observer实践
 *
 * @author leibingguang
 * @since 3/28/21 1:35 PM
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Observable observable = new EventObservable();
        observable.addObserver(new EventObserver());
        observable.notifyObservers("通知事件!");
    }

    static class EventObserver implements Observer, EventListener{
        @Override
        public void update(Observable o, Object event)
        {
            EventObject eventObject = (EventObject)event;
            System.out.println("触发事件：" + eventObject);
        }
    }

    static class EventObservable extends Observable
    {
        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }

        @Override
        public void notifyObservers(Object arg) {
            setChanged();
            super.notifyObservers(new EventObject(arg));
        }
    }
}
