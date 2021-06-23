public class SeatedPassenger extends Passenger
{
    public SeatedPassenger(int nbStop)
    {
	super(nbStop);
    }
    public boolean requestTransport(Transport t, Position p)
    {
	if(t == null || !t.remainSeatingPlaces() || p != Position.SEATING)
	    return false;
	t.pickPassenger(this, p);
	this.pos = p;
	this.transport = t;
	return true;
    }
}
