package pull;

public abstract class Subscriber {
	protected Publisher publisher;
	
	public Subscriber() {
	}
	
	public Subscriber(Publisher publisher) {
	}
	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public abstract void update();
}
