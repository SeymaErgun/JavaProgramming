package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;
    static{
        name="Batch EU10";
    }


    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

     //   pi=3.15; it gives compile error, because it can not be resigned

        final String name;
        name="Java";

      //  name="Java!";

        System.out.println(name);

        System.out.println("---------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
       // obj.birthDay= "June/09"; final variable cannot be reassigned
        System.out.println(obj.birthDay);

        System.out.println("---------------------------------");

        System.out.println(FinalVariable.name);
    }
}
