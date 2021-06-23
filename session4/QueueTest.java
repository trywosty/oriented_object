public class QueueTest
{
    public static void main(String[] args)
    {
	Queue q = new Queue();
	System.out.println("Size : " + q.size());
	q.put(45);
	System.out.println("Size : " + q.size());
	System.out.println("Front : " + q.first());
	q.put(46);
	q.put(47);
	System.out.println("Size : " + q.size());
	System.out.println("Get : " + q.get());
	System.out.println("Size : " + q.size());
	q.get();
	System.out.println("Size : " + q.size());	
	System.out.println("Front : " + q.first());
	q.get();
	System.out.println("Size : " + q.size());	
    }
}
   
