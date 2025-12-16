import java.util.Scanner;

public class MadLib {

    public static String capitalize(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter all verbs in the past tense.\n");

        System.out.print("Enter an emotion: ");
        String emotion = input.nextLine();

        System.out.print("Enter a character name: ");
        String name = capitalize(input.nextLine());

        System.out.print("Enter a past-tense verb: ");
        String verb1 = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a noun (situation or event): ");
        String noun5 = input.nextLine();


        System.out.print("Enter a friend's name: ");
        String friend = capitalize(input.nextLine());

        System.out.print("Enter another past-tense verb: ");
        String verb3 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a place: ");
        String place = capitalize(input.nextLine());

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.println();
        System.out.println(name + " woke up feeling " + emotion + " and immediately " + verb1 + ".\n" + 
                           "It was a " + adjective + " day, so everything felt slightly off.\n" +
                           "Without thinking, the " + noun5 + " spiraled out of control.\n" + 
                           friend + " suddenly appeared and " + verb3 + " a mysterious " + noun + ".\n" + 
                           "Moments later, they ended up at " + place + ", where everything finally made sense.\n" +
                           "From that point on, life moved " + adverb + ".");
    }
}
