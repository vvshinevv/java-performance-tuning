package com.perf.compile;

/**
 * javap -v -c HelloWorld.class
 * 자바 클래스 파일 구조 명세
 *
 * Classfile /Users/nhn/Project/java-performance-tuning/src/main/java/com/perf/compile/HelloWorld.class
 *   Last modified Jun 26, 2021; size 516 bytes
 *   MD5 checksum 97e038a986d3c5153809e436fa2b24eb
 *   Compiled from "HelloWorld.java"
 * class com.perf.compile.HelloWorld
 *   minor version: 0
 *   major version: 52
 *   flags: ACC_SUPER
 * Constant pool:
 *    #1 = Methodref          #6.#18         // java/lang/Object."<init>":()V
 *    #2 = Fieldref           #19.#20        // java/lang/System.out:Ljava/io/PrintStream;
 *    #3 = String             #21            // Hello World
 *    #4 = Methodref          #22.#23        // java/io/PrintStream.println:(Ljava/lang/String;)V
 *    #5 = Class              #24            // com/perf/compile/HelloWorld
 *    #6 = Class              #25            // java/lang/Object
 *    #7 = Utf8               number
 *    #8 = Utf8               I
 *    #9 = Utf8               <init>
 *   #10 = Utf8               ()V
 *   #11 = Utf8               Code
 *   #12 = Utf8               LineNumberTable
 *   #13 = Utf8               main
 *   #14 = Utf8               ([Ljava/lang/String;)V
 *   #15 = Utf8               StackMapTable
 *   #16 = Utf8               SourceFile
 *   #17 = Utf8               HelloWorld.java
 *   #18 = NameAndType        #9:#10         // "<init>":()V
 *   #19 = Class              #26            // java/lang/System
 *   #20 = NameAndType        #27:#28        // out:Ljava/io/PrintStream;
 *   #21 = Utf8               Hello World
 *   #22 = Class              #29            // java/io/PrintStream
 *   #23 = NameAndType        #30:#31        // println:(Ljava/lang/String;)V
 *   #24 = Utf8               com/perf/compile/HelloWorld
 *   #25 = Utf8               java/lang/Object
 *   #26 = Utf8               java/lang/System
 *   #27 = Utf8               out
 *   #28 = Utf8               Ljava/io/PrintStream;
 *   #29 = Utf8               java/io/PrintStream
 *   #30 = Utf8               println
 *   #31 = Utf8               (Ljava/lang/String;)V
 * {
 *   com.perf.compile.HelloWorld();
 *     descriptor: ()V
 *     flags:
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 3: 0
 *
 *   public static void main(java.lang.String[]);
 *     descriptor: ([Ljava/lang/String;)V
 *     flags: ACC_PUBLIC, ACC_STATIC
 *     Code:
 *       stack=2, locals=2, args_size=1
 *          0: iconst_0
 *          1: istore_1
 *          2: iload_1
 *          3: bipush        10
 *          5: if_icmpge     22
 *          8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *         11: ldc           #3                  // String Hello World
 *         13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 *         16: iinc          1, 1
 *         19: goto          2
 *         22: return
 *       LineNumberTable:
 *         line 8: 0
 *         line 9: 8
 *         line 8: 16
 *         line 11: 22
 *       StackMapTable: number_of_entries = 2
 *         frame_type = 252 // append
 *          offset_delta=2
 *          locals=[int]
 *          frame_type=250 // chop
 *         offset_delta=19
 *}
 * SourceFile:"HelloWorld.java"
 *
 */
class HelloWorld {

    private int number;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}
