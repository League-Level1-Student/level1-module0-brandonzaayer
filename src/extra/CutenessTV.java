package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		
		public static void main(String[] args) {
			CutenessTV TV=new CutenessTV();
			TV.buttonsNPanels();
		
		}


	public void buttonsNPanels() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);

	button1.setText("Bachelor 1");
	button2.setText("Bachelor 2");
	button3.setText("Bachelor 3");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse clicked!");
		if(e.getSource()==button1) {
			showDucks();
		}
		if(e.getSource()==button2) {
			showFrog();
		}
		if(e.getSource()==button3) {
			showFluffyUnicorns();
		}
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}	
}

