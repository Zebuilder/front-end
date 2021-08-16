package io.zolaton;

/**
 * Hello world!
 *
 */
public class FrontEnd 
{
    public static void main(String[] args)
    {
        System.out.println(new FrontEnd().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name + " from FrontEnd";
    }
}
