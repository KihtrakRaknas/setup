/*
.vbs file:
Set oWMP = CreateObject("WMPlayer.OCX.7")
Set colCDROMs = oWMP.cdromCollection
do
if colCDROMs.Count >= 1 then
For i = 0 to colCDROMs.Count -1
colCDROMs.Item(i).Eject
Next
For i = 0 to colCDROMs.Count -1
colCDROMs.Item(i).Eject
Next
End If
wscript.sleep 5000
loop
*/

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.*;

public class CD{
	Robot robot = new Robot();
	public static void main(String[] args) throws AWTException{
		new CD();
	}
	public CD() throws AWTException{
	while(true){
		System.out.println("GO!");
		openProgram("");
		wait(100);
		click(1068, 552);
	}
	}


	private void type(int i){
		robot.keyPress(i);
		robot.keyRelease(i);
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
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
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
			robot.keyPress(KeyEvent.VK_SHIFT);
		else
		    robot.keyRelease(KeyEvent.VK_SHIFT);
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
		shift("e");
		shift(";");
		wait(300);
		enter();
		wait(1000);
	}
	public void enter(){
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}