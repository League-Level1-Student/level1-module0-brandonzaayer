import ddf.minim.*;
PImage pictureOfRecord; 
int a=0;
Minim minim;
AudioPlayer song;
void setup(){
  size(768,743);
  pictureOfRecord= loadImage("Record.jpg");
  pictureOfRecord.resize(width,height);    
   minim = new Minim(this);
   song = minim.loadFile("awesomeTrack.mp3", 512);
   
}
void draw(){
  background(255,255,255);
  rotateImage(pictureOfRecord , a);
   if (mousePressed){
    rotateImage(pictureOfRecord , a);
    a+=23;
    song.play();
  }
  else {
   a+=0;
   song.pause();
  }
  
  image(pictureOfRecord, 0, 0);
  
  
}
 void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}