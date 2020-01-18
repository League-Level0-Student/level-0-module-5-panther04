
    void setup(){
        size(600,600);
         PImage face = loadImage("Work Face.jpeg");
    face.resize(width,height);
         background(face);
         if(mousePressed){
           printtn(mouseX+" "+mouseY);
         }
    }

    void draw(){
      ellipse(90,90,100,100);
      ellipse(254,360,100,100);
      
      
      
    }
