
public class Animation extends MyFrame {

	int y = 200;
	int x = 30;

	private void MoveRect(int _x, int _y) {
		//(1)画面を消す
		clear();

		//(2)四角形を表示する
		setColor(0, 128, 0);
		fillRect(x, y, 10, 100);

		x += _x;
		y += _y;

		sleep(0.1);
	}

	public void run() {

		while (y >= 100) {

			MoveRect(0, -5);
		}

		while (x <= 300) {

			MoveRect(5, 0);
		}

	}
}
