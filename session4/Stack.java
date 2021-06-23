public class Stack
{
    private int size;
    private Node top;
    public void push(int v)
	{
	    if(top == null)
		top = new Node(v, null);
	    else
		{
		    Node newNode = new Node(v, null);
		    newNode.setNext(top);
		    top = newNode;
		}
	    ++size;
	}
    public int pop_back()
    {
	if(top == null)
	    return 0;
	Node temp = top;
	top = top.getNext();
	--size;
	return temp.getData();
    }
    public int top()
    {
	return top.getData();
    }
    public int size()
    {
	return this.size;
    }
	
}
