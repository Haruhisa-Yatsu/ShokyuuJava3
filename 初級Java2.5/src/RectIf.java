
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
		int y = 50;
		setColor(0,128,0);
		
		int i;
		for(i=0; i<9;i++) {

			fillRect(x,y,10,100);
		
			x+=20;
			y+=20;
		}
	}
}
