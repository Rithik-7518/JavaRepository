package day11;

class animal{}

class dog extends animal{}
class cat extends animal{}

//cat ct = (cat) an;
// a   b    c     d

public class TypeCastingObj2 {

	public static void main(String[] args) {

		
		// rule 1 --- coversion is valid or not --> d and c must have relationship 		
		/*animal an = new animal();
		animal ani = new dog();
		cat ct=(cat) an; // valid for rule1
		*/
		
		/*
		dog dg= new dog();
		cat ct1= (cat) dg;  // invalid for rule 1
		*/
		
		
		
		
		// rule 2 assignment is valid or not ---> c must be either same or chlid of a 
		/*animal an = new dog();
		cat ct =(cat) an;      // valid for rule 2
		*/
		
		/*animal an= new dog();
		cat ct = (dog) an;     // invalid for rule 2
		*/
		
		
		// rule 3 underlying odect type of d must be either same or child of c
		/*animal an = new dog();
		cat ct = (cat) an;		// invalid as per rule 3
		*/
		
		// rule 1,2,3
		animal an = new dog();
		dog dg =(dog) an;
		
		
		
		
	}

}
