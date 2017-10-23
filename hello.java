// a simple program to practice common Github commands 

public class hello {

    public static void main(String [] args) {

		
		
		String myName = "Ben";
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String userName = reader.nextString();
		reader.close();
        System.out.println("Hello, " + userName + ", my name is " + myName + "!";);



    }
}

