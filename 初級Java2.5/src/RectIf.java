
public class RectIf extends MyFrame{
	public void run() {
		
		int x = 0;
		int h = 20;
		setColor(0,128,0);
		
		int i;
		for(i=0; i<10;i++) {

			fillRect(x,x,h,h);
		
			x+=h;
			h+=10;
		}
	}
}
