
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Habiba", 20, 3.7);
        Student student2 = new Student("Omar", 22, 3.4);


        student1.displayInfo();
        student1.study();

        System.out.println();

        student2.displayInfo();
        student2.study();

        student2.setGpa(3.9);
        System.out.println("After updating GPA:");
        student2.displayInfo();
    }
}


