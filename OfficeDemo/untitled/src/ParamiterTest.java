public class ParamiterTest {
    public static void main(String[] args) {
        Integer a = 3;
        ParamiterTest ob1=new ParamiterTest();


         a=ob1.f1(a);
         a= ob1.f2(a);
        System.out.println(a+"  last");
    }

    Integer f1(Integer a) {
        System.out.println("What is this "+a);
        return a;
    }

    Integer f2 (Integer a) {
        System.out.println(a+"  2nd");
        return a;
    }

}