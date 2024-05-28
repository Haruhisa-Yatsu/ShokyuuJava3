
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1 = new Face();
		face1.x = 50;
		face1.y = 50;
		face1.draw(this);
		
		Face face2 = new Face();
		face2.x = 200;
		face2.y = 150;
		face2.draw(this);
	}
}
