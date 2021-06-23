public class StackTest
{
    public static void main(String[] args)
    {
	Stack s = new Stack();
	s.push(53);
	s.push(45);
	System.out.println("Top : " + s.top());
	System.out.println("Size : " + s.size());
	s.pop_back();
	System.out.println("Size : " + s.size());	
    }
}
