public class Main{
    public static void main(String[] args){
        //Set up
        SubjectImpl Checkin = new SubjectImpl();
        ObserverImpl VisitationRecorder = new ObserverImpl();
        Checkin.attach(VisitationRecorder);

        //Run the check in method a few times to simulate multiple visits
        Checkin.checkIn();
        Checkin.checkIn();
        Checkin.checkIn();

        //Get those visits from the observer
        VisitationRecorder.getVisits();
    }
}