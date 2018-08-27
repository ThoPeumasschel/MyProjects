
/*created by prashant shukla */
alert("if you have an idea to make my code better than comment on my code...")
var paddle2 =10,paddle1=10;

var paddle1X = 10,paddle1Height = 60;
var paddle2Y = 330,paddle2Height = 60;

var score1 = 0, score2 =0;
var paddle1Y;

var  playerscore =0;

var pcscore =0;
//ball x and y and speedx speed y and radius
var ball = {
    x:350/2,
    y:480/2,
    r:20,
    dx:3,
    dy:3
}


function setup(){
    createCanvas(350,470)
    background(0)

}


function draw(){
var w = createA("https://code.sololearn.com/WnApKsnAtD4N/?ref=app","Ping Pong Game Multiplayer See it").id("a");
 background(0); 
   
   //funtion paddleInCanvas call 
   paddleInCanvas();
 
   //graph
   for(i=0;i<height;i+=20){
       noFill()
       stroke(250,0,0);
       strokeWeight(0.5);
       rect(i,0,20,height)
       rect(0,i,width,20)
   }
   
  
   //left paddle
   fill(250,0,0);
    stroke(0,0,250);
    strokeWeight(0.5);
   paddle1Y = mouseY; rect(paddle1X,paddle1Y,paddle1,paddle1Height,100);
   
   
    //pc computer paddle
    fill(50,0,350);
    stroke(250,0,0);
   var paddle2y =ball.y-paddle2Height/2;  rect(paddle2Y,paddle2y,paddle2,paddle2Height,100);
    
    //function midline call
    midline();
    
    //funtion drawScore call 
   drawScore();
   
   //function models call  
   models();
   
   //function move call which in very important
    move();
}



//function reset when ball does notcame in the contact of padde
function reset(){
   ball.x = width/2+100,
   ball.y = height/2+100;
   ball.dx=3;
   ball.dy =3;
   
}


//function midline draw a line in center
function midline(){
    for(i=0;i<480;i+=10) {
    var y = 0;
    fill(250,0,250);
    stroke(0);
    strokeWeight(3)
    rect(width/2,y+i,10,480);
    }
}


//function drawScore show scores
function drawScore(){
    textAlign(CENTER);
    textSize(20);
    fill(100,0,250);
    stroke(250,0,0)
    text("Player:",100,50)
    text(playerscore,140,50);
    text("Computer:",255,50)
    text(pcscore,310,50)
}


//very important function of this game
function move(){
   fill(50,350,0);
   stroke(255,0,0);
   strokeWeight(0.5);
   ellipse(ball.x,ball.y,ball.r,20)
   ball.x = ball.x + ball.dx;
   ball.y = ball.y + ball.dy;
   if(ball.x+ball.r>width-ball.r/2){
       ball.dx=-ball.dx-0.5;       
   }
  if (ball.x-2.5*ball.r/2< 0){
  if (ball.y >= paddle1Y&& ball.y <= paddle1Y + paddle1Height) {
    ball.dx = -ball.dx+0.5; 
  }
  else{
    pcscore++;
    reset();
    navigator.vibrate(100);
  }
}
if(pcscore ==4){
    fill(0,250,0);
    stroke(0)
    rect(0,0,width,height-1);
    fill(250,0,250);
    stroke(250,0,0);
    textSize(20)
    text("Game Over!☹☹",width/2,height/2);
    text("Reload The Page!",width/2,height/2+30)
    noLoop();
    pcscore = 0;
}
   if(ball.y+ball.r > height || ball.y-ball.r <0){
       ball.dy =- ball.dy;
   }   
}


//width height of canvas speed of ball 
function models(){
    textSize(15);
    fill(255);
    noStroke();
    text("Width:"+width,135,15);
    text("Speed:"+abs(ball.dx),50,15);
    text("Height:"+height,235,15)
}


//this function help to not go te paddle out of canvas
function paddleInCanvas(){
  if(mouseY+paddle1Height > height){
    mouseY=height-paddle1Height;
  }
  if(mouseY < 0){
    mouseY =0;
  }
  
}
