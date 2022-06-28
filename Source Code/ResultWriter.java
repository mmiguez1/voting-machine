import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Maygan Miguez
 * ResultWriter class contains writeResults() method which takes in a file name and Ballot and
 * writes final results of election from given Ballot to file with given file name.
 * Edited: Maygan Miguez, 10 March 2020, CMPS 1600 Lab section 2
 */

public class ResultWriter {
    /**
     * Write results of election from given Ballot to output file with given file name.
     * If unable to write results to file, throw IOException.
     *
     * @param filename name of file to output ballot results to
     * @param ballot   Ballot that race results are being written about
     * @throws IOException unable to write results to file
     */
    public static void writeResults(String filename, Ballot ballot) throws IOException {
        FileWriter file = new FileWriter(filename);
        PrintWriter output = new PrintWriter(file);
        output.println("RESULTS - " + ballot.getOfficeName());
        for (int i = 0; i < 10 + ballot.getOfficeName().length(); i++) {
            output.print("-");
        }
        output.println();
        ArrayList<Candidate> candidatesOnBallot = ballot.getCandidates();

        String longestString = candidatesOnBallot.get(0).toString();

        for (Candidate ballotCandidate : candidatesOnBallot) {
            if (ballotCandidate.toString().length() > longestString.length()) {
                longestString = ballotCandidate.toString();
            }

        }

        boolean winner = false;
        int columnLength = longestString.length() + 12;
        Candidate ballotWinner = candidatesOnBallot.get(0);
        for (Candidate ballotCandidate : candidatesOnBallot) {

            String columnFormat = "%-" + columnLength + "s " + "%d";
            output.println(String.format(columnFormat, ballotCandidate.toString(), ballotCandidate.getVoteCount()));

            if (ballotCandidate.getVoteCount() > ballotWinner.getVoteCount()) {
                ballotWinner = ballotCandidate;
                winner = true;
            } else if (ballotCandidate.getVoteCount() == ballotWinner.getVoteCount()) {
                winner = false;
            } else if (ballotWinner.getVoteCount() > ballotCandidate.getVoteCount()) {
                winner = true;
            }
        }
        output.println();
        if (winner) {
            output.println("WINNER: " + ballotWinner.toString());
        } else {
            output.println("NO WINNER");
        }
        output.close();
    }
}
