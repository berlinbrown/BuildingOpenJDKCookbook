@echo off

REM ## Note java will load the boot directories at relative JDK_HOME/./jre/lib/ jars by default.
REM ## Change the java binary path for your system

"C:\work\JDK8\lambda-8-b1314-windows-i586-10_nov_2011\bin\javac.exe" -verbose src\org\berlin\java8\*.java 