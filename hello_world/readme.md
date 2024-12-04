# first lesson 
## install
download and install from https://www.oracle.com/java/technologies/downloads/?er=221886
## program
write 
```
rustam@rustam-zenbook:~/java-education/hello_world$ cat HelloWorld.java 

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}

```
compile
```
rustam@rustam-zenbook:~/java-education/hello_world$ javac HelloWorld.java 

```
run
```
rustam@rustam-zenbook:~/java-education/hello_world$ java HelloWorld 
Hello world!
```
## create jar archive 
```
rustam@rustam-zenbook:~/java-education/hello_world$ jar cfe hw.jar HelloWorld HelloWorld.class 
rustam@rustam-zenbook:~/java-education/hello_world$ ll
total 28
drwxrwxr-x 2 rustam rustam 4096 Dec  4 20:20 ./
drwxrwxr-x 4 rustam rustam 4096 Dec  4 20:14 ../
-rw-rw-r-- 1 rustam rustam  426 Dec  4 20:09 HelloWorld.class
-rw-rw-r-- 1 rustam rustam  112 Dec  4 20:06 HelloWorld.java
-rw-rw-r-- 1 rustam rustam  760 Dec  4 20:20 hw.jar
-rw-rw-r-- 1 rustam rustam 6761 Dec  4 20:13 readme.md
```
manifest
```
rustam@rustam-zenbook:~/java-education/hello_world$ jar tf hw.jar 
META-INF/
META-INF/MANIFEST.MF
HelloWorld.class
```
run from archive 
```
rustam@rustam-zenbook:~/java-education/hello_world$ java -jar hw.jar 
Hello world!
rustam@rustam-zenbook:~/java-education/hello_world$ java -classpath hw.jar HelloWorld
Hello world!

```
## additional info
created class file 
```
rustam@rustam-zenbook:~/java-education/hello_world$ ll
total 28
drwxrwxr-x 2 rustam rustam 4096 Dec  4 20:07 ./
drwxrwxr-x 4 rustam rustam 4096 Dec  4 19:31 ../
-rw-rw-r-- 1 rustam rustam  426 Dec  4 20:09 HelloWorld.class
-rw-rw-r-- 1 rustam rustam  112 Dec  4 20:06 HelloWorld.java
-rw-rw-r-- 1 rustam rustam 5745 Dec  4 20:05 readme.md
```
bytecode
```
rustam@rustam-zenbook:~/java-education/hello_world$ hexdump -C HelloWorld.class 
00000000  ca fe ba be 00 00 00 43  00 1d 0a 00 02 00 03 07  |.......C........|
00000010  00 04 0c 00 05 00 06 01  00 10 6a 61 76 61 2f 6c  |..........java/l|
00000020  61 6e 67 2f 4f 62 6a 65  63 74 01 00 06 3c 69 6e  |ang/Object...<in|
00000030  69 74 3e 01 00 03 28 29  56 09 00 08 00 09 07 00  |it>...()V.......|
00000040  0a 0c 00 0b 00 0c 01 00  10 6a 61 76 61 2f 6c 61  |.........java/la|
00000050  6e 67 2f 53 79 73 74 65  6d 01 00 03 6f 75 74 01  |ng/System...out.|
00000060  00 15 4c 6a 61 76 61 2f  69 6f 2f 50 72 69 6e 74  |..Ljava/io/Print|
00000070  53 74 72 65 61 6d 3b 08  00 0e 01 00 0c 48 65 6c  |Stream;......Hel|
00000080  6c 6f 20 77 6f 72 6c 64  21 0a 00 10 00 11 07 00  |lo world!.......|
00000090  12 0c 00 13 00 14 01 00  13 6a 61 76 61 2f 69 6f  |.........java/io|
000000a0  2f 50 72 69 6e 74 53 74  72 65 61 6d 01 00 07 70  |/PrintStream...p|
000000b0  72 69 6e 74 6c 6e 01 00  15 28 4c 6a 61 76 61 2f  |rintln...(Ljava/|
000000c0  6c 61 6e 67 2f 53 74 72  69 6e 67 3b 29 56 07 00  |lang/String;)V..|
000000d0  16 01 00 0a 48 65 6c 6c  6f 57 6f 72 6c 64 01 00  |....HelloWorld..|
000000e0  04 43 6f 64 65 01 00 0f  4c 69 6e 65 4e 75 6d 62  |.Code...LineNumb|
000000f0  65 72 54 61 62 6c 65 01  00 04 6d 61 69 6e 01 00  |erTable...main..|
00000100  16 28 5b 4c 6a 61 76 61  2f 6c 61 6e 67 2f 53 74  |.([Ljava/lang/St|
00000110  72 69 6e 67 3b 29 56 01  00 0a 53 6f 75 72 63 65  |ring;)V...Source|
00000120  46 69 6c 65 01 00 0f 48  65 6c 6c 6f 57 6f 72 6c  |File...HelloWorl|
00000130  64 2e 6a 61 76 61 00 21  00 15 00 02 00 00 00 00  |d.java.!........|
00000140  00 02 00 01 00 05 00 06  00 01 00 17 00 00 00 1d  |................|
00000150  00 01 00 01 00 00 00 05  2a b7 00 01 b1 00 00 00  |........*.......|
00000160  01 00 18 00 00 00 06 00  01 00 00 00 02 00 09 00  |................|
00000170  19 00 1a 00 01 00 17 00  00 00 25 00 02 00 01 00  |..........%.....|
00000180  00 00 09 b2 00 07 12 0d  b6 00 0f b1 00 00 00 01  |................|
00000190  00 18 00 00 00 0a 00 02  00 00 00 04 00 08 00 05  |................|
000001a0  00 01 00 1b 00 00 00 02  00 1c                    |..........|
000001aa
rustam@rustam-zenbook:~/java-education/hello_world$ java -p HelloWorld.class 
java               javacalls-bpfcc    javaflow-bpfcc     javaobjnew-bpfcc   javastat-bpfcc
javac              javadoc            javagc-bpfcc       javap              javathreads-bpfcc
rustam@rustam-zenbook:~/java-education/hello_world$ java -p HelloWorld.class 
java               javacalls-bpfcc    javaflow-bpfcc     javaobjnew-bpfcc   javastat-bpfcc
javac              javadoc            javagc-bpfcc       javap              javathreads-bpfcc
rustam@rustam-zenbook:~/java-education/hello_world$ javap -p HelloWorld.class 
Compiled from "HelloWorld.java"
public class HelloWorld {
  public HelloWorld();
  public static void main(java.lang.String[]);
}
rustam@rustam-zenbook:~/java-education/hello_world$ javap -v HelloWorld.class 
Classfile /home/rustam/java-education/hello_world/HelloWorld.class
  Last modified Dec 4, 2024; size 426 bytes
  SHA-256 checksum 7fda3998a35e2e6a1826f41b41bd8e08c834f9824ff28de0250bbafcb9d0ee1f
  Compiled from "HelloWorld.java"
public class HelloWorld
  minor version: 0
  major version: 67
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // HelloWorld
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Class              #10            // java/lang/System
   #9 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
  #10 = Utf8               java/lang/System
  #11 = Utf8               out
  #12 = Utf8               Ljava/io/PrintStream;
  #13 = String             #14            // Hello world!
  #14 = Utf8               Hello world!
  #15 = Methodref          #16.#17        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #16 = Class              #18            // java/io/PrintStream
  #17 = NameAndType        #19:#20        // println:(Ljava/lang/String;)V
  #18 = Utf8               java/io/PrintStream
  #19 = Utf8               println
  #20 = Utf8               (Ljava/lang/String;)V
  #21 = Class              #22            // HelloWorld
  #22 = Utf8               HelloWorld
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               main
  #26 = Utf8               ([Ljava/lang/String;)V
  #27 = Utf8               SourceFile
  #28 = Utf8               HelloWorld.java
{
  public HelloWorld();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 2: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #13                 // String Hello world!
         5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 4: 0
        line 5: 8
}
SourceFile: "HelloWorld.java"

```
