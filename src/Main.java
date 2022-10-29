/*CCI Week 5 Lab: design a stack which, in addition to push and pop,
has a function min which returns the minimum element*/

public class Main
{
    public static void main(String[] args)
    {
        Stacking aStack = new Stacking(10);

       aStack.push(1);
       aStack.push(2);
       aStack.push(3);
       aStack.push(4);
       aStack.push(5);
       aStack.push(6);
       aStack.push(7);
       aStack.push(8);

       
        System.out.println("Initial stack: ");

        for (Integer allItem : aStack.getAllItems())
        {
            System.out.println(allItem);
        }

        aStack.pop();

        System.out.println("Stack after pop: ");
        for (Integer allItem : aStack.getAllItems())
        {
            System.out.println(allItem);
        }

        System.out.println("Minimum element in stack: ");
        aStack.getMin();

    }
}