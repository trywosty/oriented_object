public class Bus extends Transport
{
    private double time;
    private final double maxTime;
    private int count;  // Count of how many differents Passengers has travelled inside the bus during a certain period
    public Bus(int maxSeating, int maxStanding, int maxTime)
    {
	super(maxSeating, maxStanding);
	if(maxTime < 0)
	    maxTime = 0;
	this.maxTime = maxTime;
    }
    private void handle_count()
    {
	if(time > maxTime)
	    {
		time -= (maxTime*((int)time/(int)maxTime));
		count = nbSeating + nbStanding;
	    }
	else
	    ++count;
    }
    // Buses can accept overcrowded standing places but you can't exceed the number of seated places
    public boolean pickPassenger(Passenger passenger, Position position)
    {
	if(position == Position.SEATING && !remainSeatingPlaces())
	    return false;
	if(position == Position.SEATING)
	    ++nbSeating;
	if(position == Position.STANDING)
	    ++nbStanding;
	handle_count(); // We can only check the time when we pick up a new passenger
	passengers.add(passenger);
	return true;
    }
			      
}
