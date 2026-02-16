import java.util.Scanner;
public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        boolean isstudent;
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you a student");
         isstudent=scanner.nextBoolean(); 


        // Group 1 for name 
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! 😡");
        } else {
            System.out.println("Hello " + name + "! 😀");
        }

        // Group 2 for age 
        if(age < 0){
            System.out.println("You haven't been born yet");
        } else if(age == 0){
            System.out.println("You are a baby 👼");
        } else if(age >= 65){
            System.out.println("You are a senior 👵");
        } else if(age >= 18){
            System.out.println("You are an adult 👩");
        } else {
            System.out.println("You are a child 👶");
        }

        scanner.close();
    // group 3 are you student
    if (isstudent){
        System.out.println("Youe are a student!🏫");

    }
    else{
         System.out.println("Youe are not student!🏢");

    }
    }
}
