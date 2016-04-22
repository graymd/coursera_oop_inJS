package guimodule;

import processing.core.PImage;

public class MyPApplet extends PApplet {
	PImage img;
	
	public void setup() {
		//Add setup code for MyPApplet
		size(400, 400);
		background(255);
		stroke(0);
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0,  0);;
	}
	

}
