/**
 * @author Maygan Miguez
 * Candidate class provides constructor method to
 * construct a Candidate on a ballot using their name and affiliation.
 * Provides methods for retrieving candidate's name, retrieving candidate's affiliation,
 * incrementing vote count, retrieving total number of votes, and overrides toString method
 * to return Candidate information.
 * Created: Maygan Miguez, 28 February 2020, CMPS 1600 Lab section 2
 */
public class Candidate {
    private String name; //Candidate's name
    private String affiliation; //Candidate's party affiliation
    private int voteCount; //vote counter


    /**
     * Construct Candidate from name and party affiliation and
     * set his/her starting vote count to 0.
     * @param name Candidate's name
     * @param affiliation Candidate's affiliation
     */
    public Candidate(String name, String affiliation) {
        this.name = name;
        this.affiliation = affiliation;
        voteCount = 0;
    }

    /**
     * Return the Candidate's name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the Candidate's party affiliation
     * @return affiliation
     */
    public String getAffiliation() {
        return this.affiliation;
    }

    /**
     * Return the number of votes the Candidate has received
     * @return voteCount
     */
    public int getVoteCount() {
        return voteCount;
    }

    /**
     * Increase tally of votes for the Candidate by one
     */
    public void tallyVote() {
        voteCount++;
    }

    /**
     * Return string representation of Candidate's name and party affiliation
     * in the format: "NAME - AFFILIATION"
     * @return string
     */
    @Override
    public String toString() {
        return getName() + " - " + getAffiliation();
    }

    /**
     * Compare two Candidate objects and return true if equal and false if not
     * @param obj Object being compared to Candidate object
     * @return false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Candidate) {
            Candidate test = (Candidate) obj;
            if (test.getName() == this.getName()) {
                return true;
            }
            if (test.getAffiliation() == this.getAffiliation()) {
                return true;
            }
        }
        return false;
    }
}