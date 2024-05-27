
public class Animation extends MyFrame{

	public void run() {
		
		int x = 30;
		
		while(x < 170) {
			
			//(1)画面を消す
			clear();
			
			//(2)丸を表示する
			setColor(0,128,0);
			fillOval(x,80,100,100);
			
			x+=5;
			
			sleep(0.1);
		}
	}
}
