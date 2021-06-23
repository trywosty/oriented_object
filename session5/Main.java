
public class Main
{
    public static void main(String[] args)
    {
	Bus b = new Bus (1, 10, 300);
	SeatedPassenger sp = new SeatedPassenger(1);
	System.out.println(sp.requestTransport(b, Position.STANDING));
	System.out.println(sp.requestTransport(b, Position.SEATING));
	System.out.println(b.remainSeatingPlaces());
	b.nextStop();
	System.out.println(b.remainSeatingPlaces());
    }
}
