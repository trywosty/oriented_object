public class UncrowdedPassenger extends Passenger
{
    public UncrowdedPassenger(int nbStop)
    {
	super(nbStop);
    }
    boolean requestTransport(Transport t, Position p)
    {
	if(!t.remainStandingPlaces() || !t.remainSeatingPlaces() || t == null)
	    return false;
	t.pickPassenger(this, p);
	this.pos = p;
	this.transport = t;
	return true;
    }
}
