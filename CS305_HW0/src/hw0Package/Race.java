/*
 * Class: Race
 * author: Aether Mocker
 * date: 31 Aug 23
 * 
 * public class measuring the race of participants
 */
package hw0Package;

public class Race {

	
	//instance vars
	private Participant[] Race;
	private int numParticipants;
	private int maxRaceSize;
	
	/*
	 * ctor: Race
	 * creates the race and evaluates both maxRaceSize and numParticipants
	 */
	public Race(int _maxRaceSize) {
		if(this.maxRaceSize <= 0) {
			maxRaceSize = 25;
		}
		if (this.maxRaceSize > 0) {
			this.maxRaceSize = _maxRaceSize;
		}
		
		Race = new Participant[maxRaceSize];
		numParticipants = 0;
		
	}
	
	/*
	 * method: addParticipant
	 * return type: int
	 * 
	 */
	public int addParticipant(Participant participant) {
		if(numParticipants >= maxRaceSize) {
			System.out.println("Cannot add Participant to Race, the race is full.");
			return -1;
		}
		else {
			Race[numParticipants] = participant;
			numParticipants++;
			return 0;
		}
	}
	
	public void printRace() {
		System.out.println("Race Participants: ");
		
		//i'm gonna check the ages and calc age as it's printing for efficiency
		int indexOfMin = 0;
		int indexOfMax = 0;
		long avgAge = 0;
		for(int i = 0; i < numParticipants; ++i) {
			Race[i].print();
			avgAge += Race[i].getAge();
			
			if (Race[i].getAge() >= Race[i+1].getAge()) {
				indexOfMax = i;
				indexOfMin = 0;
			}
			else {
				indexOfMin = i;
				indexOfMax = 0;
			}
		}
		avgAge = avgAge/numParticipants;
		
		System.out.println("Average age: " + avgAge + " Youngest Racer: " + 
				Race[indexOfMin].getAge() + "Oldest Racer: " + Race[indexOfMax].getAge());
	}
	
	
}
