Boolean light = false;
int rectX = 100;
int rectY = 80;

void setup() {
  size(480, 200);
  rectMode(CENTER);
}

void draw() {
  if (light==true) {
    background(#FFFFFF);
    fill(#7C6363);
    rect(rectX, rectY, 80, 80);
  } else {
    background(#000000);
    fill(#7C6363);
    rect(rectX, rectY, 80, 80);
  }
  
  
}

void mousePressed() {
  if(mouseX>rectX-rectX/2 && mouseX<rectX+rectX/2 && mouseY>rectY-rectY/2 && mouseY<rectY+rectY/2){
    light=true;
  }else if(light = true && mouseX>rectX-rectX/2 && mouseX<rectX+rectX/2 && mouseY>rectY-rectY/2 && mouseY<rectY+rectY/2){
   light=false; 
  }
  
}