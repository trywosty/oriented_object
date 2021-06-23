
public class Queue
{
    private Node first;
    private Node rear;
    private int size;
    public void put(int n)
    {
	if(size == 0)
	    {
		first = rear = new Node(n, null);
		++size;
		return;
	    }
	Node newNode = new Node(n, null);
	if(size == 1)
	    this.first.setNext(newNode);
	else
	    this.rear.setNext(newNode);
	this.rear = newNode;
	++size;
    }
    public int get()
    {
	if(size == 0)
	    return -1;
	Node temp = this.first;
	this.first = temp.getNext();
	temp.setNext(null);
	--size;
	return temp.getData();
    }
    public int first()
    {
	if(size == 0)
	    return -1;
	return this.first.getData();
    }
    public int size()
    {
	return size;
    }
}
