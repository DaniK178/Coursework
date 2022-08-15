import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("silver");
        colours.add("pink");

        System.out.println(colours);

        System.out.println("--using enhanced for loop--");
//        we put string as we have previously said our array list is string. And we need a temporary variable name
//        and then we refer to the array list colour
        for (String colour : colours) {
            System.out.println(colour);
        }

        System.out.println("--using classic for loop--");
        for (int i = 0; i < colours.size(); i++){
            String colour = colours.get(i);
            //this line 'gets' whatever the I is at the time. So depending on the i, it chooses that colour from the colours array list.
            System.out.println(colour);
        }

    }

}
