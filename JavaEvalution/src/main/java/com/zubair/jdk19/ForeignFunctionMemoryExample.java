package com.zubair.jdk19;


import jdk.internal.foreign.*;

import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class ForeignFunctionMemoryExample {
    public static void main(String[] args) throws Throwable {} /*{
        try (var session = MemorySession.openConfined()) {
            // Allocate memory
            var allocator = MemoryLayout.ofSequence(3, ValueLayout.JAVA_INT);
            var segment = session.allocate(allocator);

            // Access and manipulate memory
            segment.set(ValueLayout.JAVA_INT, 0, 10);
            segment.set(ValueLayout.JAVA_INT, 1, 20);
            segment.set(ValueLayout.JAVA_INT, 2, 30);

            // Retrieve values
            int firstValue = segment.get(ValueLayout.JAVA_INT, 0);
            int secondValue = segment.get(ValueLayout.JAVA_INT, 1);
            int thirdValue = segment.get(ValueLayout.JAVA_INT, 2);

            System.out.println("Values: " + firstValue + ", " + secondValue + ", " + thirdValue);

            // Call a native function (example using C's printf function)
            var linker = CLinker.systemCLinker();
            MethodHandle printf = linker.downcallHandle(
                    linker.lookup("printf").get(),
                    MethodType.methodType(int.class, MemoryAddress.class),
                    FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
            );

            var formatStr = CLinker.toCString("Hello, %s!\n", session);
            printf.invoke(formatStr.address(), CLinker.toCString("World", session).address());
        }
    }*/
}


