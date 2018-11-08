  

void setup(){
  size(495,495);
  background(0,0,0);
  
}
void draw(){

  
makeMagical();
  for(int i=0; i<300; i++){
 stroke(random(0, 255), random(0, 255), random(0, 255));
fill(random(0, 255), random(0, 255), random(0, 255));
    ellipse(getWormX(30),getWormY(30), 20,20);
    
  }
  
  
}
float frequency = .01;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, 500, 500);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
