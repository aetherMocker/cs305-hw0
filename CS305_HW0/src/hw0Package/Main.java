package hw0Package;
/**
 * Main class to test hw0 classes
 * Other classes include: Race and Participant that students should implement
 * 
 * CS 305, Fall 2023
 * @author Martin Cenek
 * @version Fall 2023
 */
public class Main {
    public static void main(String[] args) {
        // create Race objects
        Race stp = new Race(-3);  //create SeattleToPortland (stp) Race with 25 racers
        Race mttabor = new Race(2); //create MtTabor (mttabor) Race with 2 racers
        
        // create participants
        Participant mary = new Participant(545, "Mary Poppins", 26);
        Participant pink = new Participant(322, "Pinkalicious", 11);
        Participant huey = new Participant(122, "Huey Duck", 18);
        Participant dewey = new Participant(111, "Dewey Duck", 25);
        Participant louie = new Participant(121, "Louie Duck", 37);
        Participant peanut = new Participant(1, "Peanut Brown", 62);
        Participant mickey = new Participant(333, "Mickey Mouse", 16);
        Participant pluto = new Participant(222, "Pluto Disney", 21);
        Participant goofy = new Participant(912, "Goofy Diskey", 28);
        Participant daisy = new Participant(124, "Daisy Duke", 41);
       
        // put some Participants into stp Race
        stp.addParticipant(mary);
        stp.addParticipant(pink);
        stp.addParticipant(huey);
        stp.addParticipant(dewey);
        
        // for write-up: draw a picture of what stp's racer roster looks like
        
        // print Race
        stp.printRace();
        
        // put more participants into stp Race
        stp.addParticipant(mickey);
        stp.addParticipant(pluto);
        stp.addParticipant(goofy);
        stp.addParticipant(daisy);
        
        // print Race
        stp.printRace();
        
        // add participants
        stp.addParticipant(pluto);
        stp.addParticipant(pink);
        
        // print Race
        stp.printRace();
        
        // add participants to mttabor
        mttabor.addParticipant(louie);
        mttabor.addParticipant(peanut);
        mttabor.printRace();
        
        // add another participants
        mttabor.addParticipant(goofy);
        
        // for the write-up
        //System.out.println(mttabor);
        //System.out.println(stp);
        
        return;
    }
}