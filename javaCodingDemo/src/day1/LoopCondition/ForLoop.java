package day1.LoopCondition;

public class ForLoop {

	public static void main(String[] args) {
		/*int i;
		
		for(i=0;i<10;i++) {
			System.out.println(i+".hello");
		}
		int j;
		for(j=10;j>0;j--) {
			System.out.println(j+".hi");
		}*/
		
		int i, j, x, y;
        String z;

        for (i = 1; i < 6; i++) {  
            System.out.println("Day " + i);
            
            for (j = 1; j <=9; j++) {  
                x = j + 8;  
                y = j + 9;  
                z = switch (j) {
                    case 1 -> "Login";
                    case 2,5,6 -> "Daily work";
                    case 3,7,8 -> "Meeting";
                    case 4 -> "Lunch";
                    case 9 -> "Logout";
                    default -> "Unknown";
                };

                                System.out.println(" " + x + "-" + y + " -> " +z);
            }
             
        }
	
	}

}
