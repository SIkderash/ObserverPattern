public class EventListener implements Listener {
    private Event event;

    @Override
    public void update(Event event) {
        this.event = event;
    } 
    public String getEventContent(){
        return this.event.getEventContent();
    }
}