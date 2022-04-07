public interface Publisher {
    public void addObserver(EventListener listener);
    public void removeObserver(EventListener listener);
    public void setEvent(Event event);
}
