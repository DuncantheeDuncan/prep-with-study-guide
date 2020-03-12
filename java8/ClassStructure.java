package java8;
// Package bookpdf;
import bookpdf.ClassTo_Import;

class ClassStructure{


public static void main(String[] args) {
	StringBuilder msg = new StringBuilder();
ClassTo_Import cti = new ClassTo_Import();
// System.out.println(cti.);
cti.show();
	msg.append("//Package statement\n");
	msg.append("//Import statement\n");
	msg.append("//Comments\n");
	msg.append("//Class declearation\n");
	msg.append("//Variables\n");
	msg.append("//Comments\n");
	msg.append("//Constructors\n");
	msg.append("//Methods\n");


	System.out.println(msg);
}

}