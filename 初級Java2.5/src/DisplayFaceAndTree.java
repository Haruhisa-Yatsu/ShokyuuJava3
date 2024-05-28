
public class DisplayFaceAndTree extends MyFrame {
	public void run() {

		Face face1 = new Face(50, 50, 10, 5);

		Tree tree1 = new Tree(200, 100, -10, -5);

		for (int i = 0; i < 30; i++) {

			clear();
			face1.draw(this);
			tree1.draw(this);

			face1.move();
			tree1.move();

			sleep(0.1);
		}
	}
}
