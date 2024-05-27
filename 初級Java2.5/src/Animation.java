
public class Animation extends MyFrame {

	public void run() {
		
		double y = 0;
		double x = 0;
	

		float count = 0;
		
		while (true) {
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillRect(200 + x * 100, 100 + y * 200, 30, 30);

			x = Math.sin(count);
			y = Math.cos(count);

			// 下方向に跳ねさせるため
			// yが負の値の場合は正の値にする
			if (y < 0) {
				y *= -1;
			}
			count += 10 * Math.PI / 180;
			sleep(0.05);

		}
	}
}
