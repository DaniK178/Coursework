import java.util.ArrayList;

public class ArrayListPlayground {

    public static void main(String[] args) {

        // we put 'string' to specify what goes inside the array list. So an array list that contains strings called trainers
        ArrayList<String> trainers = new ArrayList<>();
// you have to add you said the array list is - so if you said string you have ot add a string
        trainers.add("Colin");
        trainers.add("Anna");
        trainers.add("Iain");

        System.out.println(trainers);

        String firstTrainer = trainers.get(0);
//so a string named first trainers - from the trainers array get the index position 0,and it will return a string

        System.out.println(firstTrainer);

//      String mysteryTrainer = trainers.get(10);

//      in arrays, we used length, but here we size. In is not a property, it a method, we can see this due to the brackets. it will return an integer
        System.out.println(trainers.size());

        trainers.remove(0);

        System.out.println(trainers);

        trainers.add("grgrgew");
        trainers.add("grggerew");

        System.out.println(trainers);

    }




}
