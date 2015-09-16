//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 0,78,242 );                // sky
  fill( 247,124,0 );
  ellipse( width*3/4, height/10, 100,100 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  // HOUSE
  fill(255,0,47);
  rect(150, 65, 55, 55);
  fill(0,255,236);
  triangle(150, 65, 178, 10, 206, 65);
  fill(0);
  rect(187, 90, 15, 30);
  
  
   
  fill( 103,44,9 );
  rect(38, 60, 25, 60);              // tree fixed
  fill( 100,200,100 );
  triangle(30, 75, 58, 20, 86, 75);
  triangle(20, 65, 48, 10, 76, 65); 
  triangle(40, 85, 68, 30, 96, 85);
  triangle(5, 85, 38, 30, 66, 85);
  
  
  //text( "This is NOT a good tree; please fix it!", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Dairo Paulino", 60,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(68,141,131); rect( x-25 ,y+25, 40,50 );
 ellipse( x - 50, y - 50, 20, 20);
 ellipse( x + 50, y - 50, 20, 20); /* REPLACE THIS WITH YOUR OWN CODE! */
  fill(0);
  text( "TARZAN !", x,y );
  fill(68,141,131);
  rect(x+70,y+100,-150,10);

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

