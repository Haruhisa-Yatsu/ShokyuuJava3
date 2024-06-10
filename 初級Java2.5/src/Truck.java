
public class Truck extends Vehicle {

	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x, y + 15, 100, 15);
		frame.fillRect(x + 75, y, 25, 15);

		frame.fillOval(x + 5, y + 30, 10, 10);
		frame.fillOval(x + 15, y + 30, 10, 10);
		frame.fillOval(x + 85, y + 30, 10, 10);

	}
}
