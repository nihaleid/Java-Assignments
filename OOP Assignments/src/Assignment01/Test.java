package Assignment01;

/**
 *
 * @author nihal
 */
public class Test {
    public static void main(String[] args) {
        ObjectPass ob1 = new ObjectPass();          // Passing Object: 01
        ObjectPass ob2 = new ObjectPass(6, 4);      // Passing Object: 02
        ObjectPass ob3 = new ObjectPass(12, 9);     // Passing Object: 03
        ObjectPass ob4 = new ObjectPass(ob2);       // Passing Object: 04
        System.out.println("Object01 == Object02? " + ob1.check(ob2));
        System.out.println("Object01 == Object03? " + ob1.check(ob3));
        System.out.println("Object02 == Object04? " + ob2.check(ob4));
        System.out.println("Object03 == Object04? " + ob3.check(ob4));
        ObjectPass ob5 = new ObjectPass();
        ob5 = ob5.adding(ob2, ob3);                 // Passing Object: 05
        System.out.println(ob5.a+" "+ob5.b);
    }
}
