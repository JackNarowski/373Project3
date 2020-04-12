import java.util.ArrayList;
import java.util.List;

class SubjectImpl implements Subject {
    //Represents a checkin system as explained in the Readme
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notify(String input){
        observers.forEach(observer -> observer.update(input));
    }

    public void checkIn(){
        System.out.println("Checked in");
        notify("here");
    }



}