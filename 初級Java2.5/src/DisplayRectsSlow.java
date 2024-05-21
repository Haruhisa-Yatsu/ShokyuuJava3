
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		
		setColor(0,128,0);
		
		int x = 30;
		
		while(x <= 170) {
			
			fillRect(x,80 + x,10,100);
			x += 20;
			// 処理を指定した秒数停止する
			sleep(1);
			
		}
	}

}
