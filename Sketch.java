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
  
  public void draw_section1(){/**
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
    }*/
  }

  public void draw_section2(){/**
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
    }*/
  }

  public void draw_section3(){/**
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
    }*/
  }

  public void draw_section4(){ /**
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
      }    
    }

    for(int intColumn = 0; intColumn < 300; intColumn += 20){
      for(int intRow = 0; intRow < 300; intRow += 10){
        intX = 900 + 3 + intRow;
        intY = 300 + 3 + intColumn;
        fill(0, 0, 0);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }*/
  }

  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 300; intRow >= 0; intRow -= 10){
      for(int intColumn = 10; intColumn <= intRow; intColumn += 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){/**
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow <= 300; intRow += 10){
      for(int intColumn = 10; intColumn >= intRow; intColumn += 10){
        intX = 300 + 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }*/
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow <= 0; intRow += 10){
      for(int intColumn = 300; intColumn >= intRow; intColumn -= 10){
        intX = 600 + 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){/**
    int intX = 0;
    int intY = 0;

    for(int intRow = 300; intRow <= 300; intRow -= 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 900 + 3+ intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }*/
  }
}
