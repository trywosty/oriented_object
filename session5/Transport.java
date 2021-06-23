import java.util.*;

public abstract class Transport
{
    private final int maxSeating; // Max number of Seated places
    private final int maxStanding; // Max number of Standing places
    protected int nbSeating, nbStanding; // Current number of seated and standing places
    protected LinkedList<Passenger> passengers; // List of Passengers in this transport ( Most efficient Data structure in this case)
    public Transport(int maxSeating, int maxStanding) // Construct the list and set up max constant and 0 places occupied
    {
	this.maxSeating = maxSeating;
	this.maxStanding = maxStanding;
	this.passengers = new LinkedList<Passenger>();
    }
    public boolean remainStandingPlaces()
    {
	return maxStanding - nbStanding > 0 ?  true : false;
    }
    public boolean remainSeatingPlaces()
    {
	return maxSeating - nbSeating > 0 ? true : false;
    }
    public abstract boolean pickPassenger(Passenger passenger, Position position);
    // E.g Subclasses will decide if the transport can be overcrowded or not in which position, specific task when we pick up a passenger, ...

    // Transport arrived next stop
    public void nextStop()
    {
	for(ListIterator<Passenger> l = passengers.listIterator(0); l.hasNext();)
	    if(l.next().newStop() == 0)
		{
		    Position pos = l.previous().getPosition();
		    if(pos == Position.SEATING)
			--nbSeating;
		    if(pos == Position.STANDING)
			--nbStanding;
		    l.remove();
		   }
    }

}
