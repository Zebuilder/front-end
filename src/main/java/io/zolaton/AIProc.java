package io.zolaton;

/**
 * Hello world!
 *
 */
public class AIProc 
{
    public static void main(String[] args)
    {
        System.out.println(new AIProc().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name + " from AIProc";
    }
}
