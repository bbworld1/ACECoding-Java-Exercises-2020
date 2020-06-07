// Thanos Snap Simulator (tm), now in Java flavor!
// Basically, what we're doing is taking an array of people
// and randomly choosing people to snap until we're down to half the people.
import java.util.ArrayList;

public class Thanos {
    public static void main(String[] args) {
        // We'll use an ArrayList here for variable length
        // (because we want to remove the snapped people)
        // You can technically do this with a regular old Array
        // but like why
        ArrayList<String> people = new ArrayList<String>();
        people.add("Vincent");
        people.add("Eduardo");
        people.add("Java Man");
        people.add("YeetMaster");
        people.add("Jamal");

        // Store the target length now
        int targetLength = people.size() / 2;

        // Here's the magic:
        // (reminder: to get the length of Lists, use .size())
        // (regular arrays are .length)
        // (strings are .length())
        while (people.size() > targetLength) {
            // Here we're using random() (generates decimal between 0 and 0.999...)
            // and multiplying it by people.size() to get decimal from 0-people.size()-1.999...
            // then using (int) cast to chop off decimal, leaving us with an int
            // from 0-people.size()-1
            int randomPerson = (int) (Math.random() * people.size());

            // Print out the person who was snapped
            System.out.println(people.get(randomPerson) + " was snapped");

            // Remove the person
            people.remove(randomPerson);
        }
    }
}
