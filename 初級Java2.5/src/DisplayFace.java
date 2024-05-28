
public class DisplayFace extends MyFrame{
	public void run() {
		int x = 30, y = 40;
		fillOval(x,y,50,100);
		fillOval(x + 100,y,50,100);
		fillRect(x,y+160,150,10);
		
		int x2 = 180, y2 = 120;
		fillOval(x2,y2,50,100);
		fillOval(x2 + 100,y2,50,100);
		fillRect(x2,y2+160,150,10);
	
	}
}
