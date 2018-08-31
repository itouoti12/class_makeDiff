package class_makeDiff;

public class ClassMakeDiff {

    public static void main(String[] args) {

        // A
        ClassMakeDiff.A a = new ClassMakeDiff().new A();
        System.out.println(a.str);

        // B
        ClassMakeDiff.B b = new ClassMakeDiff.B();
        System.out.println(b.str);

        // C
        //ŽÀŽ¿ C.new C2()
        ClassMakeDiff.C.C2 c = new ClassMakeDiff.C().new C2();
        System.out.println(c.str);

        // D
        //ŽÀŽ¿ D.D2
        ClassMakeDiff.D.D2 d = new ClassMakeDiff.D.D2();
        System.out.println(d.str);
    }

    /**
     * Outer...public class</br>
     * Inner...public class
     */
    public class A {
        String str = "nonStatic_nonStatic";
    }

    /**
     * Outer...public class</br>
     * Inner...public static class
     */
    public static class B {
        String str = "nonStatic_static";
    }

    /**
     * Outer...public static class</br>
     * Inner...public class
     */
    public static class C {
        public class C2 {
            String str = "staic_nonStatic";
        }
    }

    /**
     * Outer...public static class</br>
     * Inner...public static class
     */
    public static class D {
        public static class D2 {
            String str = "static_static";
        }
    }

}
