# Java Evolution: Key Features from JDK 11 to 21

Welcome to the repository for **Java Evolution: Key Features from JDK 11 to 21**. This article explores the significant enhancements and features introduced in Java Development Kit (JDK) versions 11 through 21. Java continues to evolve, and each new release brings improvements that enhance performance, security, and developer productivity.

## Table of Contents
- [Introduction](#introduction)
- [JDK 11](#jdk-11)
- [JDK 12](#jdk-12)
- [JDK 13](#jdk-13)
- [JDK 14](#jdk-14)
- [JDK 15](#jdk-15)
- [JDK 16](#jdk-16)
- [JDK 17](#jdk-17)
- [JDK 18](#jdk-18)
- [JDK 19](#jdk-19)
- [JDK 20](#jdk-20)
- [JDK 21](#jdk-21)
- [Conclusion](#conclusion)
- [References](#references)

## Introduction
Java, one of the most popular programming languages, continues to evolve with each new release of the Java Development Kit (JDK). From performance enhancements to language improvements, each JDK version brings a plethora of new features and enhancements that shape the way we write Java code. In this article, we'll take a closer look at some of the key features introduced in JDK versions 11 through 21.

## JDK 11
Key features introduced in JDK 11 include:
- **Local-Variable Syntax for Lambda Parameters (JEP 323):** Allows the use of `var` when declaring lambda parameters, enhancing code readability.
- **HTTP Client (JEP 321):** Introduces a modern HTTP client API for easier and more efficient HTTP requests and responses.
- **Flight Recorder (JEP 328):** Enables continuous JVM and application monitoring.
- **Epsilon: A No-Op Garbage Collector (JEP 318):** A garbage collector that doesn't reclaim memory, useful for performance testing.
- **TLS 1.3 (JEP 332):** Adds support for Transport Layer Security 1.3 for improved security.
- **Launch Single-File Source-Code Programs (JEP 330):** Allows running Java source files directly without prior compilation.

## JDK 12
Highlights from JDK 12:
- **Switch Expressions (JEP 325):** Enhances switch statements to be used as expressions, reducing boilerplate code.
- **Shenandoah: A Low-Pause-Time Garbage Collector (JEP 189):** Aims to reduce GC pause times by performing most of its work concurrently with application threads.
- **Microbenchmark Suite (JEP 230):** Adds a set of microbenchmarks for performance measurement of Java features and APIs.

## JDK 13
Key features of JDK 13:
- **Text Blocks (JEP 355):** Introduces text blocks, simplifying multiline string literals with triple quotes.
- **Switch Expressions (Preview) (JEP 354):** Standardizes switch expressions, introduced as a preview in JDK 12.
- **Reimplement the Legacy Socket API (JEP 353):** Optimizes the java.net.Socket and java.net.ServerSocket APIs.

## JDK 14
Enhancements in JDK 14:
- **Switch Expressions (Finalized) (JEP 361):** Makes switch expressions a permanent feature.
- **Non-Volatile Mapped Byte Buffers (JEP 352):** Improves performance for I/O operations involving memory-mapped files.
- **Packaging Tool (Incubator) (JEP 343):** Introduces `jpackage` for creating platform-specific packages.

## JDK 15
Major updates in JDK 15:
- **Sealed Classes (JEP 360):** Allows restricting which classes can extend or implement a class or interface.
- **Hidden Classes (JEP 371):** Introduces hidden classes that are not discoverable by other classes.
- **Remove the Nashorn JavaScript Engine (JEP 372):** Removes the outdated Nashorn JavaScript engine.

## JDK 16
Notable features in JDK 16:
- **Records (JEP 395):** Introduces records for immutable data classes with less boilerplate.
- **Foreign-Memory Access API (Second Incubator) (JEP 389):** Enhances access to non-Java memory.
- **Vector API (Second Incubator) (JEP 338):** Enhances performance for operations on arrays of data.

## JDK 17
Key features of JDK 17:
- **Sealed Classes (Second Preview) (JEP 409):** Further enhances sealed classes.
- **Foreign Function & Memory API (Incubator) (JEP 419):** Provides a safer alternative to JNI for interacting with native code and memory.
- **Pattern Matching for Switch (Second Preview) (JEP 406):** Extends pattern matching capabilities to switch statements.

## JDK 18
Highlights of JDK 18:
- **Pattern Matching for Switch (Final Release) (JEP 420):** Completes pattern matching for switch statements.
- **Simple Web Server (JEP 408):** Introduces a lightweight web server for serving static content.
- **Code Snippets in Java API Documentation (JEP 413):** Adds formatted code snippets in Java documentation.

## JDK 19
Major updates in JDK 19:
- **Pattern Matching for Switch (Third Preview - JEP 427):** Continues refinement of pattern matching for switch.
- **Virtual Threads (JEP 425):** Introduces lightweight threads managed by the JVM.

## JDK 20
New features in JDK 20:
- **Record Patterns (Second Preview) - JEP 432:** Enables concise deconstruction of records within pattern matching.
- **Scoped Values (Incubator - JEP 429):** Provides a better alternative to thread-local variables.
- **Virtual Threads (Second Preview - JEP 436):** Further improvements and refinements based on feedback.

## JDK 21
Key features in JDK 21:
- **String Templates (Preview - JEP 430):** Simplifies combining text with computed values.
- **Sequenced Collections (JEP 431):** Introduces sequenced collections with a defined encounter order.
- **Virtual Threads (Third Preview - JEP 453):** Enhances integration and support for debugging and profiling virtual threads.
- **Structured Concurrency (Third Incubator - JEP 446):** Further refinement of APIs based on user feedback.
- **Foreign Function & Memory API (Third Preview - JEP 442):** Continued enhancements for performance and safety.
- **Record Patterns (Third Preview - JEP 440):** Improves pattern matching with record patterns.
- **Pattern Matching for Switch (Fifth Preview - JEP 443):** Extends pattern matching capabilities and improves error handling.
- **Vector API (Sixth Incubator - JEP 448):** Continues optimization for performance across different CPU architectures.

## Conclusion
Java's evolution from JDK 11 to 21 showcases the language's commitment to enhancing developer experience, performance, and security. Each release introduces valuable features that not only keep Java relevant but also make it easier and more enjoyable to work with.

## References
For more details, refer to the official [Java Documentation](https://docs.oracle.com/javase/).

---

Feel free to explore the [source code examples](./examples) provided in this repository to see these features in action!
