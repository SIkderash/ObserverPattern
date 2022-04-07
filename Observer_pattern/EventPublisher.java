import java.util.ArrayList;
import java.util.List;

public class EventPublisher implements Publisher {
    private Event event;
    private List<EventListener> listeners;

    public EventPublisher(){
        listeners = new ArrayList<>();
    }
    public void addObserver(EventListener listener) {
        this.listeners.add(listener);
    }

    public void removeObserver(EventListener listener) {
        this.listeners.remove(listener);
    }

    public void setEvent(Event event) {
        this.event = event;
        for (EventListener listener : this.listeners) {
            listener.update(this.event);
        }
    }
}