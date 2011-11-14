/**
 * Java 8 Test:
 * 
 * Compiled with: 
 * lambda-8-b1314-windows-i586-10_nov_2011
 * http://jdk8.java.net/lambda/
 * 
 * They have adopted a C# style syntax.
 * 
 * (Binary build for win32)
 * 
 * berlin.brown at gmail.com
 */

package org.berlin.java8;

/**
 * Lambda8 Test.
 */
public class LambdaJava8Test {

    /**
     * Basic function interface    
     */
    interface F {
        void f();
    }
    interface Fi {
        int f();
    } 
    interface Fx {
        int f(int x);
    }       
    public Fi add(final int seed) {
        final int z = seed;
        return () -> z + 10; 
    }
    public Fx add2(final int seed) {
        final int z = seed;
        return (int x) -> z + x; 
    }    
    public static void main(final String [] args) {
        System.out.println("Running");        
        // [1] Example:        
        final F func = () -> System.out.println("Test");
        System.out.println("Function Object : " + func);
        func.f();        
        // [2] I tried my best to clean up this syntax below.        
        ((F)(() -> System.out.println("Test-2"))).f();        
        
        final int z = 10;
        final int res3 = ((Fi)( () -> z + 1 )).f();                     
        System.out.println("[3] Output from recent lambda call : " + res3);
                
        final int res4 = new LambdaJava8Test().add(10).f();
        System.out.println("[4] Output from recent lambda call {expect 20} : " + res4);
        
        final int res5 = new LambdaJava8Test().add(10).f();
        System.out.println("[5] Output from recent lambda call {expect 20} : " + res4);        
        for (int i = 0; i < 10; i++) {
            final int ii = i;
            final int res6 = ((Fx)( (final int y) -> y + ii )).f(10);            
            System.out.println("[6] Output from recent lambda call index="+i+" : " + res6);
        }
                
        // Now with anonymous inner classes, notice the similarity at line 70-line 75
        for (int i = 0; i < 10; i++) {
            final int ii = i;
            // @line70, anon inner class call
            final Fx fxx = new Fx() {
              public int f(int y) { return y + ii; }  
            };
            final int res6 = fxx.f(10);            
            System.out.println("[7] Output from anonymous inner call index="+i+" : " + res6);
        }
        
        // End of tests ! 
        System.out.println("Done");
    }
    
} // End of the Class //
