
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1 = new Face(25,50);
		face1.draw(this);
		
		Face face2 = new Face(125,150);
		face2.draw(this);		
		
		Face face3 = new Face(225,50);
		face3.draw(this);
	}
}
