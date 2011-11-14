@echo off

REM ## Note java will load the boot directories at relative JDK_HOME/./jre/lib/ jars by default.
REM ## Change the java binary path for your system

"C:\work\JDK8\lambda-8-b1314-windows-i586-10_nov_2011\bin\java.exe" -version

"C:\work\JDK8\lambda-8-b1314-windows-i586-10_nov_2011\bin\java.exe" -cp src;. org.berlin.java8.LambdaJava8Test