
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
		int color = 0;

		
		int i;
		for(i=0; i<10;i++) {

			setColor(color,color,color);
			fillRect(x,50,10,100);
		
			x+=20;
			color+=20;
		}
	}
}
