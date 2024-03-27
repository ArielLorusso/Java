//package 39_compile_run;

public class Compile
{
    public static void main (String[] args) {
        System.out.println("this is compile 39");      
    }
}
/*
1. Make sure you have a Java JDK installed (we did this in lesson #1)
2. (optional) use a text editor and save a file as .java
3. Open Command Prompt (windows) or Terminal (Mac) on your computer
4 Write : 
    set path=C:\Program Files\Java\jdk-14.0.1\bin   (where JDK is located)
    cd C:\Users\Myname\Desktop                      (or wherever you java file is)
    javac HelloWorld.java                           (to compile)
    java HelloWorld                                 (to run a .class file, it's portable)


javac 						//compiler
javac Source.java 			//creates source.class in same dir
javac -d .\obj  source.java //creates source.class in dir obj
java Source					// runs Source object in JDK

My case:
set path=C:\Program Files\Eclipse Adoptium\jdk-17.0.3.7-hotspot\bin
cd C:\Users\ariel\OneDrive\Documentos\Visual_Studio_Projecs\JAVA\BroCode\39_compile_run
javac Main.java
java  Main


https://www.cs.princeton.edu/courses/archive/fall97/cs461/jdkdocs/tooldocs/win32/javac.html#Options
https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html
*/