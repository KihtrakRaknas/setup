import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;



import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class MousePos
{
	Robot robot = new Robot();
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws AWTException{
		new MousePos();
	}


	public MousePos() throws AWTException{
		while(true){
			int xpos = MouseInfo.getPointerInfo().getLocation().x;
			int ypos = MouseInfo.getPointerInfo().getLocation().y;
			System.out.println(xpos+", "+ypos);
		}
			}
}