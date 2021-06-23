public abstract class Passenger
{
    protected Position pos;
    protected Transport transport;
    private int nbStop;
    public Passenger(int nbStop)
    {
	if(nbStop < 0)
	    nbStop = 0;
	this.nbStop = nbStop;
    }
    abstract boolean requestTransport(Transport t, Position p);
    // Subclass of Passenger may have different behaviors to o request an entry into a Transport.
    public int newStop()
    {
	--nbStop;
	if(nbStop == 0)
	    transport = null;
	return nbStop;
    }
    public Position getPosition()
    {
	return this.pos;
    }
}

