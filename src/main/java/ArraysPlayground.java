public class ArraysPlayground {

    public static void main(String[] args) {

//        String trainer1 = "Anna";
//        String trainer2 = "Colin";
//        String trainer3 = "Iain";
//we cannot deviate from what we said the array was going to be so if we said it is a string - it has to remain so
        // it is still a variable, called trainers
//        String[] trainers = {"Anna", "Colin", "Iain"};
//
//
// remember array start from index 0. if the number is outside the range you have and out of bound exception error
//        String firstTrainer = trainers[0];
// this prints out the location of the arrays
//        System.out.println(firstTrainer);
//        // ths syntax here is called a

        String[] emptyTrainers = new String[3]; // the output will actually look like [null(0), null(1) ,nul(2)], it is staying there are 3 people long,
//        String firstTrainer = emptyTrainers [0];
//        System.out.println(firstTrainer);

//        what we are saying  is that at this time - we are adding data to his index position
        emptyTrainers[0] = "Anna";
        emptyTrainers[1] = "Colin";
        emptyTrainers[2] = "Iain";

        emptyTrainers[2]= "Zsolt";
        //we have changed from iain to zsolt

        System.out.println(emptyTrainers[2]);
        //she said this is a method or not a method (look up)
        int trainerCount = emptyTrainers.length;
        System.out.println(trainerCount);


    }
}
