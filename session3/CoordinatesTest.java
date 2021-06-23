/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 3
 *
 * Exercise 1: reading the code of a simple Java program.
 *
 * @author: J.-F. Grailet
 */

public class CoordinatesTest
{
    public static void main(String[] args)
    {
	//      Coordinates a = new Coordinates(1, 2);
	//      Coordinates b = new Coordinates();

	//      a.translate(3, 4);
        
	//      System.out.println(a.toString());
	//      System.out.println(b.toString());
	/*	
	LineSegment x = new LineSegment(0,3,4,0);
	System.out.println(x.toString());
	x.translate(3, 4);
	System.out.println(x.toString());
	System.out.println(x.length());
	*/
	PointCloud cloud = new PointCloud();
	cloud.add(0,0);
	cloud.add(1,1);
	cloud.add(2,2);
	cloud.add(3,3);
	cloud.toArray();
	cloud.translate(1,1);
	cloud.toArray();
    }
}
