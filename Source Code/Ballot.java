import java.util.ArrayList;

/**
 * @author Maygan Miguez
 * Ballot class provides constructor method to construct a Ballot consisting of
 * the name of the office up for a vote and a list of candidates.
 * Provides methods for retrieving office name, adding candidate to ballot,
 * and retrieving list of candidates on ballot.
 * Edited: Maygan Miguez, 28 February 2020, CMPS 1600 Lab section 2
 */


public class Ballot {
    private String officeName; //Name of office that is up for vote
    private ArrayList<Candidate> candidates; //List of candidates

    /**
     * Construct a Ballot with name of office being voted on and create arraylist
     * to store Candidates being voted on in the race
     * @param officeName name of office up for vote
     */
    public Ballot(String officeName) {
        this.officeName = officeName;
        candidates = new ArrayList<>();
    }

    /**
     * Return name of office being voted on
     * @return officeName
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Add Candidate to list of Candidates in race.
     * Duplicate Candidate object cannot be added to ballot.
     * @param c Candidate being added to ballot
     */
    public void addCandidate(Candidate c) {
        if (!candidates.contains(c)) {
            candidates.add(c);
        }
    }
    /**
     * Return Arraylist of all Candidates on the ballot
     * @return candidates
     */
    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }

    /**
     * Return string representation of office name and ArrayList of Candidates on Ballot
     * @return string
     * in the format: "OFFICE NAME: [Candidate - Affiliation]"
     */
    @Override
    public String toString() {
        return String.format("%s: %s", getOfficeName(), getCandidates());
    }
}
