package extra;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;


public class SoundEffects {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
public void mouseClicked(MouseEvent e) {
  	 buttonsNPanels();
System.out.println("Mouse clicked!");
if(e.getSource()==button1) {
	playSound("121027_thirsk_130-clarinet-loop.wav");
}
  	 
	
}

public void buttonsNPanels() {
	
	frame.setVisible(true);
	
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
button1.setText("Sound 1");
button2.setText("Sound 2");
button3.setText("Sound 3");
button4.setText("Sound 4");
}

private void playSound(String string) {
	// TODO Auto-generated method stub
	
}
}
