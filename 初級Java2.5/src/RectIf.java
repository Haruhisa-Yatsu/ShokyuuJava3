
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
		setColor(0,128,0);
		
		int i;
		for(i=0; i<9;i++) {
			if(i >= 4 && i <= 7) {
				fillRect(x,100,10,100);
			}
			else {
				fillRect(x,80,10,100);				
			}
			x+=20;
		}
	}
}
