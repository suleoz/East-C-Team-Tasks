package Task1September;

public abstract class Marks {
    //We  have  to  calculate  the  average  of  marks obtained in three subjects
    // by student A and by student B. Create class 'Marks' with an abstract method
    // 'getPercentage'  that  will  be  returning the  average  percentage  of  marks.
    // Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks  in  three  subjects  as
    // its  parameters  and the marks in four subjects as its parameters for student B.
    // Test your code

    double math;
    double history;
    double science;
    double PA;


    public abstract double getPercentage(int ... subjects);


}class A extends Marks {

    @Override
    public double getPercentage(int... subjects) {
        int a=0;
        for(int i:subjects){
            a=a+i;
        }
        return a/3;
    }
}
class B extends Marks {

    @Override
    public double getPercentage(int... subjects) {
        int a=0;
        for(int i:subjects){
            a=a+i;
        }

        return a/4;
    }
}


class MarkTester{
    public static void main(String[] args) {
        Marks marks= new A();
        System.out.println(      marks.getPercentage(10,20,30));

        B b=new B();
        b.getPercentage(60,70,80,90);
        System.out.println( b.getPercentage(60,70,80,90));
    }
}
