import java.lang.*;

public class LineSegment
{
    private Coordinates begin, end;
    public LineSegment(int x1, int y1, int x2, int y2)
    {
	this.begin = new Coordinates(x1, y1);
	this.end = new Coordinates(x2, y2);
    }
    public LineSegment(Coordinates begin, Coordinates end)
    {
	this.begin = begin;
	this.end = end;
    }
    public void translate(int dx, int dy)
    {
	begin.translate(dx, dy);
	end.translate(dx, dy);
    }
    public double length()
    {
	return Math.hypot(end.getX() - begin.getX(), end.getY()- begin.getY());
    }
    public String toString()
    {
	return "[" + begin.toString() + ", " + end.toString() + "]";
    }
}
