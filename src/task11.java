import java.util.ArrayList;
import java.util.List;


public class task11 {
    static List<String> places = new ArrayList<>();

    public static List getfriends() {


        // Create an ArrayList to store full names
        List<String> friends = new ArrayList<>();

        // Add 5 friends' full names (first + last name)
        friends.add("vishal  nivangune");
        friends.add("vishal  jadhav");
        friends.add("vishwjeet nikumbh");
        friends.add(" harshal  thakur");
        friends.add("aditya kasbe");
        friends.add("pranav patil");

        return friends;
    }

      public  static void main ( String[]args){
            List<String> myPlaces = getfriends();
            System.out.println("Names starting from v");

            // Filter places from Nepal
            myPlaces.stream()
                    .filter((p) -> p.startsWith("vishal"))
                    .map((p) -> p.toUpperCase())
                    .sorted()
                    .forEach((p) -> System.out.println(p));


        }

    }
