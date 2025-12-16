import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter an emotion");
            String adj1 = input.nextLine();

            System.out.println("Enter a name for your character");
            String noun1 = input.nextLine();

            System.out.println("Enter a feeling for an action");
            String adj2 = input.nextLine();
            
            System.out.println("Enter a verb");
            String verb1 = input.nextLine();
             
            System.out.println("Enter a verb");
            String verb2 = input.nextLine();

            System.out.println("Enter a name for the character's friend");
            String name2 = input.nextLine();

            System.out.println("Enter a verb");
            String verb3 = input.nextLine();

            System.out.println("Enter a verb");
            String verb4 = input.nextLine();

            System.out.println("Enter a place");
            String noun3 = input.nextLine();

    }
}

System.out.println("There was a " + adj1 + noun1 + "who " + verb1 + "."/n
                    "Their name was " + noun1 + "and they really " + adj2 + verb2 + "every day."/n
                    "One day their friend " + name2 + verb3 + "ed and then started crying intensely."/n
                    "To comfort " + name2 + "they " + verb4 + "together until they were done."/n
                    "After a while " + name1 + "and " + name2 + "went to " + noun3 + ", and never came back.")

