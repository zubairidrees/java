package com.zubair.jdk17.sealedclasses;

public sealed interface Shape permits Circle, Rectangle, Triangle {
    double area();

}
