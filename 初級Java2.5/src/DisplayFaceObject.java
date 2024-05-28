
public class DisplayFaceObject extends MyFrame {
	public void run() {
		
		Face face1 = new Face(50, 50);

		Face face2 = new Face(200, 100);

		for (int i = 0; i < 30; i++) {
			
			clear();
			face1.draw(this);
			face2.draw(this);

			face1.x += 10;
			face1.y += 5;
			face2.x -= 10;
			face2.y -= 5;
			
			sleep(0.1);
		}
	}
}
