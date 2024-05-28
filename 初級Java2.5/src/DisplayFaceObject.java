
public class DisplayFaceObject extends MyFrame {
	public void run() {

		Face[] faces = new Face[3];

		faces[0] = new Face(50, 50, 10, 5);
		faces[1] = new Face(200, 100, -10, -5);
		faces[2] = new Face(0, 100, 5, 0);

		for (int i = 0; i < 30; i++) {

			clear();
			for (int j = 0; j < 3; j++) {
				faces[j].draw(this);
				faces[j].move();
			}

			sleep(0.1);
		}
	}
}
