import java.util.*;
public class HashSetDemo{
	public static void main(String...args){		
		try (Scanner input = new Scanner(System.in)) {
			boolean exit = false;
			int choice = -1;
			HashSet<String> names = new HashSet<String>();		
			System.out.println("Default size of HashSet : " + names.size());	
			while(!exit){			
				System.out.println("1.Add a name\n" +
				                   "2.Remove a name\n" +
								   "3.Search for a name\n" +
								   "4.Remove all names\n" +
								   "5.Is the set empty?\n" +
								   "6.Exit");
				System.out.print("Enter your choice : ");
				choice = input.nextInt();			
				switch(choice){
					case 1:
						System.out.print("Enter a name : ");
						names.add(input.next());
						System.out.println(names);
						break;
					case 2:
						System.out.print("Enter a name : ");
						names.remove(input.next());
						System.out.println(names);
						break;
					case 3:
						System.out.print("Enter an name : ");
						System.out.println(names.contains(input.next()));
						System.out.println(names);
						break;
					case 4:
						names.clear();
						System.out.println(names);
						break;
					case 5:
						System.out.println(names.isEmpty());
						System.out.println(names);
						break;     
					case 6:
						exit=true;
						break;			
					default:
						System.out.println("Enter correct input");	
				}
			}
		}		
	}		
}
