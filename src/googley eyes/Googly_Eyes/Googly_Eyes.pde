
    void setup(){
        size(600,600);
         PImage face = loadImage("Work Face.jpeg");
    face.resize(width, height);
         background(face);
         
    }
    void draw(){
      ellipse(387,265,30,30);
            fill(255,255,255);
            
      ellipse(419,276,25,25);
            fill(0,0,0);
      if(mousePressed){
           println(mouseX+" "+mouseY);
         }
           if(mouseX>396){
        mouseX=396;
      }
        if(mouseY<256){
        mouseY=256;
      }
      
      ellipse(mouseX,mouseY,15,15);
      fill(255,255,255);
      

      //380 256 top left
      //396 257 top right
      //397 272 bottom right
      //376 272 bottom left
    }
