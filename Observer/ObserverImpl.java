import java.util.ArrayList;
import java.time.LocalDateTime;

class ObserverImpl implements Observer{
    //Represents a Visitation Recorder as explained in the Readme
    ArrayList<LocalDateTime> visits = new ArrayList<LocalDateTime>(); //Represents record of visits

    public void update(String input){
        if(input == "here"){
            LocalDateTime date = LocalDateTime.now();
            visits.add(date);
        }
    }

    public void getVisits(){
        System.out.println(visits);
    }
}