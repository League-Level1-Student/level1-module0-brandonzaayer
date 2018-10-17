package extra;

public class Rain_Game {
	int y=15;
	  int randomNumber=10;
	void setup(){
	  size(600,600);
	 
	  
	}
	void draw(){
	  
	 
	  background (0, 33, 71);
	   fill(146,146,146);
	stroke(146,146,146);
	  rect( mouseX,  565,  50, 65); 
	  if(y<585){
	  fill(75, 156, 211);
	stroke(75, 156, 211);
	ellipse(randomNumber, y, 10, 30);

	}
	y+=3;

	if(y>585){
	  y=15;
	   randomNumber = (int) random(590-10)+10; 
	 }
	  

	}
}
