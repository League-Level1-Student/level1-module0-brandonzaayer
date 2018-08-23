import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot("vic");

public static void main(String[] args) {
	Robot.setWindowSize(800, 600);
	rob.setSpeed(500);
	rob.moveTo(20,590);
	rob.penDown();
	for(int i = 0; i<8; i++) {
	grass();
	flatHouse();
	grass();
	pointedHouse();
	}
	grass();
	
	
	rob.hide();
}
public static void flatHouse() {
	
	rob.setPenColor(255,0,0);
	rob.setAngle(0);
	
	rob.move(100);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(100);
}
public static void pointedHouse() {
	
	rob.setPenColor(0,0,255);
	rob.setAngle(0);
	
	rob.move(150);
	rob.turn(45);
	rob.move(20);
	rob.turn(90);
	rob.move(20);
	rob.setAngle(180);
	rob.move(150);
}
public static void grass() {
	rob.setPenColor(0,255,0);
	rob.setAngle(90);
	rob.move(20);
}

}
