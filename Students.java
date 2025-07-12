import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the numbers of students");
        int numbers= input.nextInt();
        input.nextLine();

        for( int i=1;i<=numbers;i++){
            System.out.print("Enter the name of each student");
            String name= input.next();
        }
        double[] scores= new double[3];
        for( int i=0;i<3;i++ ) {
            System.out.print("Enter three exam scores"+(i+1));
             scores[i] = input.nextDouble();
        }
        double sum=0;
        for(int i=0; i<3;i++){
            sum+=scores[i];
        }
        double avg=sum/3;
        System.out.println("The avg is:" + avg);

        System.out.print("Enter the grade");
        double grade=input.nextDouble();
        if(grade>=85){
            System.out.println("A");
        }
        else if(grade>=70){
            System.out.println("B");
        }
        else if(grade>=50){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }










          input.close();
    }
}
