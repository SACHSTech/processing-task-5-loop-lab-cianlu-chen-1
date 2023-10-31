import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 300;
    int intY = 0;
    int intColourShift = 255;

    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 0; intRow < 300; intRow += 10){
        intX = 300 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(0 + intColourShift, 0 + intColourShift, 0 + intColourShift);
        intColourShift = intColourShift * -1;
        noStroke();
        rect(intX, intY, 5, 5);
      }    
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 600;
    int intY = 0;
    int intColourShift = 255;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 600 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        rect(intX, intY, 5, 5);
        fill(0 + intColourShift, 0 + intColourShift, 0 + intColourShift);
        intColourShift = intColourShift * -1;
        noStroke();
      }    
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 900;
    int intY = 0;
    int intColourShift = 255; 
  
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 0; intRow < 300; intRow += 10){
        intX = 900 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(0 + intColourShift, 0 + intColourShift, 0 + intColourShift);
        intColourShift = intColourShift * -1;
        noStroke();
        rect(intX, intY, 5, 5);

        if(intRow % 2 == 0 && intColumn % 2 ){
          fill(0, 0, 0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }    
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

  }

  public void draw_section6(){

  }

  public void draw_section7(){

  }
  
  public void draw_section8(){

  }






}
