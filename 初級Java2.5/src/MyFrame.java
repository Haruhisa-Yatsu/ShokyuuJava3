
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * グラフィックスを簡単に表示するウィンドウクラス
 * @author Cho Shinya
 *
 */
public class MyFrame extends Frame implements Runnable {
	BufferedImage im;
	/**
	 * fillRect 等で用いる描画色
	 */
	Color col=Color.BLACK;
	/**
	 * アニメーション用のスレッド
	 */
	Thread t;
	public Color bgColor=new Color(255,255,255);
	/**
	 * ウィンドウを作成し、表示する。
	 */
	public MyFrame() {
		super();
		setSize(400,400	);
		im=new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(1);
			}
		});
		//autoSave();
	}
	public synchronized void saveImage(File dst) throws IOException {
		ImageIO.write(im, "png", dst);
	}
	/*public void autoSave() {
		final Object t=this;
		Runnable r = new Runnable() {
			public void run() {
				try {
					for (int i=1 ; i<=5; i++) {
						Thread.sleep(1000);
						String pathname = "screenshots"+File.separator+t.getClass().getSimpleName()+"_"+new TDate().toString("yyMMdd_hhmmss")+"_"+i+".png";
						saveImage(new File(pathname));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(r).run();
	}*/
	/**
	 * 最初にpaintが呼ばれたときに、スレッドを動かしてアニメーションを制御する
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(im, 0 ,0 , null);
		if (t==null) {
			t=new Thread(this);
			t.start();
		}
	}
	/**
	 * 四角形を描画する。色はsetColor で指定。
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */
        public synchronized void fillRect(double x, double y, double w, double h) {
               fillRect((int) x, (int) y, (int) w, (int) h);
        }
	public synchronized void fillRect(int x,int y,int w, int h) {
		Graphics g=getImageGraphics();
		if (g!=null) {
			g.setColor(col);
			g.fillRect(x, y, w, h);
		}
		g=getGraphics();
		if (g!=null) {
			g.setColor(col);
			g.fillRect(x, y, w, h);
		}
	}
	public synchronized void clear() {
		Color s=col;
		col=bgColor;
		fillRect(0,0,getWidth(),getHeight());
		col=s;
	}
	public synchronized void fillOval(int x,int y,int w, int h) {
		Graphics g=getImageGraphics();
		if (g!=null) {
			g.setColor(col);
			g.fillOval(x, y, w, h);
		}
		g=getGraphics();
		if (g!=null) {
			g.setColor(col);
			g.fillOval(x, y, w, h);
		}
	}
	private Graphics getImageGraphics() {
		return im.getGraphics();
	}
	/**
	 * 描画色を指定する。
	 * @param red
	 * @param green
	 * @param blue
	 */
	public void setColor(int red, int green, int blue) {
		if (red<=0) red=0;
		if (red>255) red=255;
		if (green<=0) green=0;
		if (green>255) green=255;
		if (blue<=0) blue=0;
		if (blue>255) blue=255;
		col=new Color(red,green,blue);
	}
	/**
	 * 一定時間待つ
	 * @param time
	 */
	public void sleep(double time) {
		try {
			fillRect(0,0,0,0);// ダミー：これがないとXPで最後の四角形がちらつく
			Thread.sleep((int)(time*1000));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * アニメーションを行う時は、学習者がrunメソッドをオーバライドする
	 */
	public void run() {
	}
	public synchronized void fillOval(double x, double y, double w, double h) {
		fillOval((int)x,(int)y,(int)w,(int)h);

	}
	public synchronized void drawString(String str, int x,int y, int size) {
		Graphics g=getImageGraphics();
		if (g!=null) {
			g.setColor(col);
			g.setFont(new Font("Monospaced",0,size));
			g.drawString(str, x, y);
		}
		//if (locked) return;
		g=getGraphics();
		if (g!=null) {
			g.setColor(col);
			g.setFont(new Font("Monospaced",0,size));
			g.drawString(str, x, y);
		}
	}

}
