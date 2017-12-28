package innerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest{
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000,true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quite Program?");
		System.exit(0);
	}
}

class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int i, boolean b){
		this.interval = i;
		this.beep = b;
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tone time is "+ new Date());
			if(beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}