import java.util.*;

public class PascalTriangle
{
    private static int m_n = -1;
    private static Vector<Vector<Long>> triangle = new Vector<Vector<Long>>();
    private static void resizeTriangle(int n)
    {
	doTriangle(n , m_n);
    }
    private static void makeTriangle(int n)
    {
	doTriangle(n,0);
    }
    private static void doTriangle(int n, int i)
    {
	m_n = n;
	triangle.setSize(n+1);
	for(; i <= n; ++i)
	    {
		triangle.add(i,new Vector<Long>(i+1));
		for(int j = 0; j <= i; ++j)
			{
			    if(j == 0 || j == i)
				triangle.get(i).add(j, (long)1);
			    else
				triangle.get(i).add(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
			}
	    }
    }
    public static long computation(int n, int k)
    {
	if(n < 0 || k < 0 || k > n)
	    return -1;
	if(m_n == -1)
	    makeTriangle(n);
	if(m_n < n)
	    resizeTriangle(n);
	return triangle.get(n).get(k);
    }
    public static void main(String[] agrs)
    {
	System.out.println("La valeur actuelle est : "+  computation(20,21));
    }
}
