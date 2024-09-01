package com.zubair.jdk14;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBufferExample {
    public static void main(String[] args) throws Exception {
        // Create a RandomAccessFile for read-write access
        RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

        // Get the FileChannel from the RandomAccessFile
        FileChannel channel = file.getChannel();

        // Map a region of the file into memory
        MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);

        // Write data to the buffer
        buffer.put("Hello, world!".getBytes());

        // Force any changes to be written to the file
        buffer.force();

        // Close the file and channel
        channel.close();
        file.close();

        System.out.println("Data written to memory-mapped file successfully.");
    }
}
