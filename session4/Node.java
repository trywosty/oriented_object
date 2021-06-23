

public class Node
{
    private int data;
    private Node next;
    public Node(int data, Node n)
    {
	this.data = data;
	this.next = next;
    }
    public void setData(int data)
    {
	this.data = data;
    }
    public void setNext(Node n)
    {
	next = n;
    }
    public int getData()
    {
	return this.data;
    }
    public Node getNext()
    {
	return this.next;
    }
}
