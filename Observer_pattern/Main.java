public class Main {
    
    public static void main(String[] args){
    
        EventPublisher observable = new EventPublisher();
        EventListener observer_1 = new EventListener();
        EventListener observer_2 = new EventListener();

        observable.addObserver(observer_1);
        observable.addObserver(observer_2);   
        observable.setEvent(new Event("Attention!! New Event Occured!!"));

        System.out.println(observer_1.getEventContent()=="Attention!! New Event Occured!!");
        System.out.println(observer_2.getEventContent()=="Attention!! New Event Occured!!");
        
    }
}
