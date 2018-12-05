//Program by Karthik Sankar
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.*;

public class Macro{
	Robot robot = new Robot();
	public static void main(String[] args) throws AWTException{
		new Macro();
	}
	public Macro() throws AWTException{/*
		int xOrigLocOfMos = mosX();
		int yOrigLocOfMos = mosY();
		hover(6, Integer.MAX_VALUE);
		final int bottomOfScreen = mosY();
		hover(Integer.MAX_VALUE, 6);
		final int rightOfScreen = mosX();
		//hover(xOrigLocOfMos,yOrigLocOfMos); //Returns mouse to original location*/

		//Replace with code!
	}


	private void type(int i){
		robot.keyPress(i);
		robot.keyRelease(i);
	}
	private void type(char c){
		type(KeyEvent.getExtendedKeyCodeForChar(c));
	}
	private void type(String s){
		for(int i =0;i!=s.length();i++){
			type(KeyEvent.getExtendedKeyCodeForChar(s.charAt(i)));
		}
	}
	public void wait(int milliseconds){
		for(int i = 0; i !=milliseconds/60000;i++)
		    robot.delay(60000);
		robot.delay(milliseconds);
	}
	public void click(int x,int y){
		hover(x, y);
		leftMouseDown(true);
		leftMouseDown(false);
	}
	public void rightClick(int x,int y){
		hover(x, y);
		rightMouseDown(true);
		rightMouseDown(false);
	}
	public void leftMouseDown(boolean tf){
		if(tf)
			robot.mousePress(InputEvent.BUTTON1_MASK);
		else
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	public void centerMouseDown(boolean tf){
		if(tf)
			robot.mousePress(InputEvent.BUTTON2_MASK);
		else
			robot.mouseRelease(InputEvent.BUTTON2_MASK);
	}
	public void rightMouseDown(boolean tf){
		if(tf)
			robot.mousePress(InputEvent.BUTTON3_MASK);
		else
			robot.mouseRelease(InputEvent.BUTTON3_MASK);
	}
	public void hover(int x,int y){
		robot.mouseMove(x, y);
	}
	public int mosX(){
		return MouseInfo.getPointerInfo().getLocation().x;
	}
	public int mosY(){
		return MouseInfo.getPointerInfo().getLocation().y;
	}
	public void shift(String text){
		shift(true);
		type(text);
		shift(false);
	}
	public void shift(boolean tf){
		if(tf)
			type(16);
		else
		    type(16);
	}

	public void control(String text){
		control(true);
		type(text);
		control(false);
	}
	public void control(boolean tf){
		if(tf)
			robot.keyPress(KeyEvent.VK_CONTROL);
		else
		    robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void command(String text){
		command(true);
		type(text);
		command(false);
	}
	public void command(boolean tf){
		if(tf)
			robot.keyPress(KeyEvent.VK_META);
		else
            robot.keyRelease(KeyEvent.VK_META);
	}
	public void windows(boolean tf){
		if(tf)
			robot.keyPress(KeyEvent.VK_WINDOWS);
		else
            robot.keyRelease(KeyEvent.VK_WINDOWS);
	}
	public void windows(){
		windows(true);
		windows(false);
	}
	public void openProgram(String programName){
		windows();
		wait(200);
		type(programName);
		enter();
		wait(600);
	}
	public void enter(){
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
//Program by Karthik Sankar