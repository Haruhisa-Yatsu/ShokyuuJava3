
public class DisplayFaceObject extends MyFrame {
	public void run() {

		Face face1 = new Face(50, 50, 10, 5);

		Face face2 = new Face(200, 100, -10, -5);

		for (int i = 0; i < 30; i++) {

			clear();
			face1.draw(this);
			face2.draw(this);

			face1.move();
			face2.move();

			sleep(0.1);
		}
	}
}
