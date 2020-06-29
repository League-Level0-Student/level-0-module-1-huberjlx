void setup() {
    size(500, 500);
}
void draw() {
  fill(255,255,255);
    background(200, 200, 200);
    noStroke();
    fill(255,255,255);
    rect(500,500,250,250);
    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#00FF28);
    rect(176, 103, 12, 32);
    if (mousePressed) {
     
     noStroke();
     fill(255,255,255);
      ellipse(75,200,25,25);
    }
}
