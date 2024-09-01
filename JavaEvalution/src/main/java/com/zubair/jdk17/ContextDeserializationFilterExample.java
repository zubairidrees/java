package com.zubair.jdk17;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ContextDeserializationFilterExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> data = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");


        // Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"))) {
            oos.writeObject(data);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Define a deserialization filter that allows only strings starting with "J"
        ObjectInputFilter filter = (info) -> {
            Class<?> clazz = info.serialClass();
            if (clazz != null && clazz.equals(String.class)) {
                //try {
                    String str = "";//(String) info.serialObject();
                    return str != null && str.startsWith("J") ? ObjectInputFilter.Status.ALLOWED : ObjectInputFilter.Status.REJECTED;
               // } /*catch (IOException | ClassNotFoundException e) {
                    //e.printStackTrace();
                    //return ObjectInputFilter.Status.REJECTED;
                //}*/
            }
            return ObjectInputFilter.Status.UNDECIDED;
        };

        // Set the filter
        ObjectInputFilter.Config.setSerialFilter(filter);

        // Perform deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Object obj = ois.readObject();
            if (obj instanceof String) {
                System.out.println("Deserialized string: " + obj);
            } else if (obj instanceof String[]) {
                String[] strings = (String[]) obj;
                System.out.println("Deserialized strings:");
                for (String str : strings) {
                    System.out.println("- " + str);
                }
            } else {
                System.out.println("Unsupported object type: " + obj.getClass());
            }
        }
    }
}
