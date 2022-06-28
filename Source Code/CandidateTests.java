
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** @author Maygan Miguez
 * CandidateTests Class tests all methods implemented in Candidate class.
 * Created: Maygan Miguez, 28 February 2020, CMPS 1600 Lab section 2
 */
public class CandidateTests {
    private Candidate candidate1;
    private Candidate candidate2;
    private Candidate candidate3;
    private Candidate candidate4;

    /**
     * Test Candidate constructor object implementation
     */
    @BeforeEach
    public void setUp(){
        candidate1 = new Candidate("Tigger", "Tiger Party");
        candidate2 = new Candidate("Winnie the Pooh", "Bear Party");
        candidate3 = new Candidate("Piglet", "Pig Party");
        candidate4 = new Candidate("Tigger", "Tiger Party");
    }

    /**
     * Test that getName() method returns candidate's expected name
     */
    @Test
    public void testName() {
       assertEquals("Tigger", candidate1.getName());
       assertEquals("Winnie the Pooh", candidate2.getName());
       assertEquals("Piglet", candidate3.getName());
    }

    /**
     * Test that getAffiliation() method returns Candidate's expected affiliation
     */
    @Test
    public void testAffiliation() {
        assertEquals("Tiger Party", candidate1.getAffiliation());
        assertEquals("Bear Party", candidate2.getAffiliation());
        assertEquals("Pig Party", candidate3.getAffiliation());
    }

    /**
     * Test that getVoteCount() method returns expected number of votes
     */
    @Test
    public void testGetVoteCount() {
        assertEquals(0, candidate1.getVoteCount());
        assertEquals(0, candidate2.getVoteCount());
        assertEquals(0, candidate3.getVoteCount());
    }
    /**
     * Test that tallyVote() method increments by 1
     */
    @Test
    public void testTallyVote() {
        candidate1.tallyVote();
        candidate2.tallyVote();
        candidate2.tallyVote();
        candidate3.tallyVote();
        candidate3.tallyVote();
        candidate3.tallyVote();
        assertEquals(1, candidate1.getVoteCount());
        assertEquals(2, candidate2.getVoteCount());
        assertEquals(3, candidate3.getVoteCount());
    }

    /**
     * Test that toString() method returns string representation of Candidate object
     */
    @Test
    public void testToString() {
        assertEquals("Tigger - Tiger Party", candidate1.toString());
        assertEquals("Winnie the Pooh - Bear Party", candidate2.toString());
        assertEquals("Piglet - Pig Party", candidate3.toString());
    }

    /**
     * Test that equals() method returns false when comparing equality of two unique
     * Candidates and returns true for duplicate Candidates
     */
    @Test
    public void testEquals() {
        assertFalse(candidate1.equals(candidate2) && candidate1.equals(candidate3));
        assertFalse(candidate2.equals(candidate1) && candidate2.equals(candidate3));
        assertFalse(candidate3.equals(candidate1) && candidate3.equals(candidate2));
        assertFalse(candidate4.equals(candidate2) && candidate4.equals(candidate3));
        assertTrue(candidate1.equals(candidate4) && candidate4.equals(candidate1));


    }
}