package reflection.example1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Class eagleClass= Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        Method[] methods=eagleClass.getMethods();
        System.out.println("--------");
        for (Method m:methods)
        {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getDeclaringClass());

        }

    }
}
