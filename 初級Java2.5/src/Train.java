
public class Train {
	int x,y,vx,vy;
	public Train(int x,int y, int vx,int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		
	}
	
	public void draw(MyFrame frame) {
		frame.fillRect(x,y,100,30);

		frame.fillOval(x+5,y+30,10,10);
		frame.fillOval(x+15,y+30,10,10);
		frame.fillOval(x+75,y+30,10,10);
		frame.fillOval(x+85,y+30,10,10);
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
}
