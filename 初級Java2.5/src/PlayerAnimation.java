
public class PlayerAnimation extends MyFrame{
	public void run() {
		Car player =new Car(100,100,0,0); 
		
		while(true) {
			clear();
			player.draw(this);
			player.move();
			sleep(0.1);
		}
	}
}
