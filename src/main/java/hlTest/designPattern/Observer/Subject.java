package hlTest.designPattern.Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

abstract class Subject {
//    定义一个观察者集合用于所有观察者对象
    protected final ArrayList<Observer> observerList = new ArrayList<Observer>();
//    被观察者状态
    private int subjectState;

//    注册方法，用于将一个观察者加入观察者集合
    public synchronized void attach(Observer observer){
        this.observerList.add(observer);
    }

//    注销方法，用于在观察者集合中删除一个观察者
    public synchronized void detach(Observer observer){
        this.observerList.remove(observer);
    }

//    public int getSubjectState() {
//        return subjectState;
//    }

    public synchronized void setSubjectState(int subjectState) {
        this.subjectState = subjectState;
    }

//    抽象通知方法，用于通知观察者
    public void notifyObserver(Object args){
        ArrayList<Observer> curObserveList = new ArrayList<Observer>();
        synchronized(this){
            Collections.copy(curObserveList, observerList);
        }
        for(Observer observer : curObserveList){
            observer.update(this, args);
        }
    }
}
