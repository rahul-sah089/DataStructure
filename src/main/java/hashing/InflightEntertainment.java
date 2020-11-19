package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
https://www.interviewcake.com/question/java/inflight-entertainment?course=fc1&section=hashing-and-hash-tables
 */
public class InflightEntertainment {
    public boolean canTwoMoviesFillFlight1(int flightLength, int[] movieLengths) {
        boolean result = false;
        for (int i = 0; i < movieLengths.length; i++) {
            int firstMovieLength = movieLengths[i];
            int secondMovieLength = flightLength - firstMovieLength;
            for (int j = 0; j < movieLengths.length; j++) {
                if (secondMovieLength == movieLengths[j] && i != j) {
                    System.out.println("Movie 1 length => " + i + " and Movie 2 length=>" + j);
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean canTwoMoviesFillFlight2(int flightLength, int[] movieLengths) {
        Set<Integer> movieLengthSeen = new HashSet<Integer>();
        for (int movieLength : movieLengths) {
            int matchingSecondMovieLength = flightLength - movieLength;
            if(movieLengthSeen.contains(matchingSecondMovieLength)){
                return true;
            }
            movieLengthSeen.add(movieLength);
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
