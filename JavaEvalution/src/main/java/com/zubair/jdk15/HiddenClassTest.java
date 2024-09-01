package com.zubair.jdk15;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.io.IOUtils;


public class HiddenClassTest {

    public static void main(String[] args) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        try {
            // Initiate lookup class
            MethodHandles.Lookup lookup = MethodHandles.lookup();

            Class<?> clazz = HiddenClass.class;
            String className = clazz.getName();
            String classAsPath = className.replace('.', '/') + ".class";
            InputStream stream = clazz.getClassLoader().getResourceAsStream(classAsPath);

            Class<?> hiddenClass = lookup.defineHiddenClass(IOUtils.toByteArray(stream),
                    true, MethodHandles.Lookup.ClassOption.NESTMATE).lookupClass();

            Object hiddenClassObject = hiddenClass.getConstructor()
                    .newInstance();

            Method method = hiddenClassObject.getClass()
                    .getDeclaredMethod("convertToUpperCase", String.class);
            System.out.println(hiddenClass.isHidden());

            System.out.println("HELLO".equals(method.invoke(hiddenClassObject, "Hello")));

            System.out.println(HiddenClassTest.class
                    .getClassLoader().equals( hiddenClass.getClassLoader()));

            System.out.println( hiddenClass.getCanonicalName() == null);


        }catch (Exception ex){
            System.out.println("Exception :"+ ex.getMessage());
        }

    }

}

