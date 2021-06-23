import java.lang.*;
import java.util.*;
public class PointCloud
{
    private LinkedList<Coordinates> list;
    public void add(int x, int y)
    {
	list.add(new Coordinates(x, y));
	
    }
    public PointCloud()
    {
	list = new LinkedList<Coordinates>();
    }
    public void translate(int dx, int dy)
    {
	for(Coordinates coord : list)
	    coord.translate(dx, dy);
    }
    public LineSegment[] toArray()
    {
	LineSegment array[] = new LineSegment[list.size()-1];
	ListIterator<Coordinates> first = list.listIterator(0), second = list.listIterator(1);
	while( second.hasNext() )
	    {
		array[first.nextIndex()] = new LineSegment(first.next(), second.next());
	    }
	return array;
    }
}
