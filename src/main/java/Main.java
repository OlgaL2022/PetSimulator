
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to pet simulator, Please Enter pet Name");
        String name = scanner.nextLine();

        System.out.println("What kind of pet is " + name +  "?");
        String type = scanner.nextLine();

        System.out.println("How much do i weight?");
        float weight = Float.parseFloat(scanner.nextLine());

        Pet pet = new Pet(name, type, weight);

        System.out.println("Hello there!, now you can interact with me. Please Choose an option below");
        String option = "";

        while(!option.equals("5")){
            System.out.println(
                    "1 Who Am I \n" +
                            "2 Say Hello \n" +
                            "3 Feed Me \n" +
                            "4 Check My Weight \n" +
                            "5 Say Good bye "
            );
            option = scanner.nextLine();

            switch (option){
                case "1":
                    System.out.println(pet.introduce());
                    break;
                case "2":
                    System.out.println(pet.sayHello());
                    break;
                case "3":
                    System.out.println(pet.feed());
                    break;
                case "4":
                    System.out.println(pet.getWeight());  // + pet.calculateWeightForFeed() for total weight (needs to be public method)
                    break;
                case "5":
                    System.exit(1); // stops and exits the program. 1 shows message - can be any you put in
                    break;
                default:
                    System.out.println("I don't understand you, try again!");
            }
        }

    }
}
