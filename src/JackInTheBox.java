import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	int pressed=0;
	public static void main(String[] args) {
JackInTheBox jack= new JackInTheBox();
	jack.showButton();
	}
	public void showButton (){
		JFrame frame = new JFrame();
		JButton surprise = new JButton();
		frame.add(surprise);
		frame.setVisible(true);
		surprise.addActionListener(this);
		surprise.setText("Surprise!");
	}
	private void showPicture(String fileName) {
	    try {
	         JLabel imageLabel = createLabelImage(fileName);
	         JFrame frame = new JFrame();
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.add(imageLabel);
	         frame.setVisible(true);
	         frame.pack();
	    } catch (Exception e) {
	         e.printStackTrace();
	    }
	}
	
	private JLabel createLabelImage(String fileName) {
	    try {
	         java.net.URL imageURL = getClass().getResource(fileName);
	         if (imageURL == null) {
	              System.err.println("Could not find image " + fileName);
	              return new JLabel();
	         } else {
	              Icon icon = new ImageIcon(imageURL);
	              JLabel imageLabel = new JLabel(icon);
	              return imageLabel;
	         }
	    } catch (Exception e) {
	         System.err.println("Could not find image " + fileName);
	         return new JLabel();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		pressed++;
			System.out.println("Button Pressed " + pressed + " times!");
		
	}
}