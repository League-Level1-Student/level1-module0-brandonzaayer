package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;


public class SoundEffects implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public static void main(String[] args) {
		SoundEffects sE=new SoundEffects();
		sE.buttonsNPanels();
	
	}


public void buttonsNPanels() {
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);

button1.setText("Sound 1");
button2.setText("Sound 2");
button3.setText("Sound 3");
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
frame.pack();
}

private void playSound(String fileName) {
	// TODO Auto-generated method stub
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Mouse clicked!");
	if(e.getSource()==button1) {
		playSound("song1.wav");
	}
	if(e.getSource()==button2) {
		playSound("song2.wav");
	}
	if(e.getSource()==button3) {
		playSound("song3.wav");
	}
	
}
}
