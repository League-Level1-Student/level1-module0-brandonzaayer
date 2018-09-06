/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String PMB= "https://ih1.redbubble.net/image.281447894.3863/flat,550x550,075,f.u1.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component jail;
		// 3. use the "createImage()" method below to initialize your Component
jail=createImage(PMB);
		// 4. add the image to the quiz window
quizWindow.add(jail);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
int YesNo = JOptionPane.showOptionDialog(null,
		"At a party would you get on the dance floor and party with the Puppy Monkey Baby", "Dance Party?", 0,
		JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "NO WAY! I am not getting close to that thing!", "Start to dance and have a good time!" }, null);
		// 7. print "CORRECT" if the user gave the right answer
if(YesNo==0) {
	System.out.println("Buzz Kill!");
	System.out.println("INCORRECT");
}
else {
	System.out.println("Way to get down and cut some rug!");
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(jail);
		// 10. find another image and create it (might take more than one line of code)
String Narwhal="http://preview.turbosquid.com/Preview/2014/07/07__23_22_22/Narwhal3.jpgde5cc6d8-5985-4214-b9dd-36d7af50965aOriginal.jpg";
		// 11. add the second image to the quiz window
jail=createImage(Narwhal);
quizWindow.add(jail);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
int yes = JOptionPane.showOptionDialog(null,
"Are Narwhals real?", "Fact or Fiction?", 0,
JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Nope, just fancy PhotoShop skills!", "They are the unicorns of the sea, except they are real." }, null);
		// 14+ check answer, say if correct or incorrect, etc.
if(yes==0) {
	System.out.println("Take off your tinfoil hat and try again!");
	System.out.println("INCORRECT");
}
else {
	System.out.println("They are the unicorns of the sea!");
	System.out.println("CORRECT");
}
quizWindow.dispose();
System.out.println("Score: " +( YesNo+yes));
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





