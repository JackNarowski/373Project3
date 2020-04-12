public class Main{
    public static void main(String[] args){
        //Set up
        CheckIn Checkin = new CheckIn();
        VisitationRecorder VisitationRecorder = new VisitationRecorder();
        Checkin.attach(VisitationRecorder);

        //Run the check in method a few times to simulate multiple visits
        Checkin.checkIn();
        Checkin.checkIn();
        Checkin.checkIn();

        //Get those visits from the observer
        VisitationRecorder.getVisits();
    }
}