
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** @author Maygan Miguez
 * BallotTests Class tests all methods implemented in Ballot class.
 * Created: Maygan Miguez, 28 February 2020, CMPS 1600 Lab section 2
 */
public class BallotTests {
    private Ballot ballot1;
    private Ballot ballot2;
    private Ballot ballot3;

    private Candidate candidate1;
    private Candidate candidate2;
    private Candidate candidate3;
    private Candidate candidate4;

    /**
     * Test Ballot constructor object implementation
     */
    @BeforeEach
    public void setUp(){
        ballot1 = new Ballot("President");
        ballot2 = new Ballot("Vice President");
        ballot3 = new Ballot("Secretary");

        candidate1 = new Candidate("Tigger", "Tiger Party");
        candidate2 = new Candidate("Winnie the Pooh", "Bear Party");
        candidate3 = new Candidate("Piglet", "Pig Party");
        candidate4 = new Candidate("Tigger", "Tiger Party"); //duplicate to Candidate 1

        ballot1.addCandidate(candidate1);
        ballot1.addCandidate(candidate2);
        ballot1.addCandidate(candidate3);
        ballot1.addCandidate(candidate4); //duplicate candidate is not added to ballot

        ballot2.addCandidate(candidate1);
        ballot2.addCandidate(candidate2);
        ballot2.addCandidate(candidate3);

        ballot3.addCandidate(candidate1);
        ballot3.addCandidate(candidate2);
    }

    /**
     * Test that getOfficeName() method returns expected office name on ballot
     */
    @Test
    public void testGetOfficeName() {
        assertEquals("President", ballot1.getOfficeName());
        assertEquals("Vice President", ballot2.getOfficeName());
        assertEquals("Secretary", ballot3.getOfficeName());
    }

    /**
     * Test that addCandidate() method adds Candidate to arraylist of candidates in race
     * and that a duplicate candidate cannot be added to a ballot
     */
    @Test
    public void testAddCandidate() {
        assertEquals(3, ballot1.getCandidates().size());
        assertEquals(3, ballot2.getCandidates().size());
        assertEquals(2, ballot3.getCandidates().size());
    }

    /**
     * Test that getCandidate() method returns list of Candidates on Ballot
     */
    @Test
    public void testGetCandidate() {
        //Array List that candidate arraylist should be equal to
        ArrayList<Candidate> testCandidate = new ArrayList<>();
        testCandidate.add(candidate1);
        testCandidate.add(candidate2);
        testCandidate.add(candidate3);

        //check if candidates arraylist equals testCandidate arraylist
        assertEquals(testCandidate, ballot1.getCandidates());
        assertEquals(testCandidate, ballot2.getCandidates());

    }

    /**
     * Test that toString() method returns string representation of Ballot object
     */
    @Test
    public void testToString() {
        assertEquals("President: [Tigger - Tiger Party, Winnie the Pooh - Bear Party, Piglet - Pig Party]",
                ballot1.toString());
        assertEquals("Vice President: [Tigger - Tiger Party, Winnie the Pooh - Bear Party, Piglet - Pig Party]",
                ballot2.toString());
        assertEquals("Secretary: [Tigger - Tiger Party, Winnie the Pooh - Bear Party]", ballot3.toString());
    }
}