


  int y=15;
    int randomNumber=10;
        int score=0; 
        
  void setup(){
    size(600,600);
   
    
  }
 void checkCatch(int x){

    if (x > mouseX && x <  mouseX+50){
     
      score++;
         
   println(score);
    }
    else if (score==0 && x<mouseX){ 
      score=0;
    }
    else if (score==0 && x>mouseX+50 ){
      score=0;
    }  
    else{
     score--; 
    }
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
   fill(146,146,146);
  stroke(146,146,146);
    rect( mouseX,  565,  50, 65); 
   fill(255, 255, 255);
textSize(16);
text("Score: " + score, 10, 15);


  }
  y+=3;

  if(y>585){
    checkCatch(randomNumber);

    y=15;
     randomNumber = (int) random(590-10)+10; 
   }
    

  }
  