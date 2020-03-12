import java.util.*;
public class Arraylist{




	public static void main(String[] args) {
		System.out.println("connected..");


		ArrayList<String> groupNames =  new ArrayList<>();
		// case sensetive

		groupNames.add("Phumlani Mthembu");
		groupNames.add("Bavumile Mthembu");
		groupNames.add("Sandile Mthembu");
		groupNames.add("Sifiso Mthembu");
		if(groupNames.contains("Phumlani Mthembu"))
			groupNames.add("Mzekezeke");// remove ;
		if(groupNames.contains("Mzekezeke"))
			groupNames.add("Maphulo mandla");

		System.out.println(groupNames.size());
		System.out.println(groupNames.toString());
	}
}