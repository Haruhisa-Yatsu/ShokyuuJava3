
import java.util.Vector;

public class DisplayCarsTrains extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10, 30, 3, 0));
		vehicles.add(new Car(10, 100, 5, 0));
		vehicles.add(new Train(10, 150, 7, 0));

		for (int i = 0; i < 30; i++) {
			clear();
			for (int j = 0; j < vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}
}
