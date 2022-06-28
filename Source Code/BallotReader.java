
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Maygan Miguez
 * BallotReader class contains readBallot() method which reads inputted text file and
 * uses the file's information to create a Ballot.
 * Edited: Maygan Miguez, 10 March 2020, CMPS 1600 Lab section 2
 */

public class BallotReader {

    /**
     * Read inputted Ballot file and construct Ballot object using file information
     * If file does not exist, throw IOException.
     * @param filename name of input file to read Ballot information from
     * @return Ballot that is created from file information
     * @throws IOException file does not exist
     */
    public static Ballot readBallot(String filename) throws IOException {
        Scanner sc = new Scanner(new FileReader(filename));
        String officeName = sc.nextLine();
        Ballot ballot = new Ballot(officeName);
        int numberOfCandidates = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfCandidates; i++) {
            StringTokenizer candidateInfo = new StringTokenizer(sc.nextLine());
            String name = candidateInfo.nextToken(";");
            String affiliation = candidateInfo.nextToken(";");
            Candidate inputCand = new Candidate(name, affiliation);
            ballot.addCandidate(inputCand);
        }
        return ballot;
    }
}


