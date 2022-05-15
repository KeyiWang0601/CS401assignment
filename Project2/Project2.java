// Project2.java

import java.io.*; // BufferedReader
import java.util.*; // Scanner to read from a text file

public class Project2
{
	public static void main (String args[]) throws Exception // we NEED this 'throws' clause
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED CMD ARGS
		if (args.length < 3)
		{
			System.out.println("\nusage: C:\\> java Project2 <input file name> <lo>  <hi>\n\n");
			// i.e. C:\> java Project1 P1input.txt 1 30
			System.exit(0);
		}

		String infileName = args[0];  // no need to convert, just copy into infileName
		int lo = Integer.parseInt( args[1] ); // conver to int then store into to
		int hi = Integer.parseInt( args[2] ); // conver to int then store into hi


		// STEP #1: OPEN THE INPUT FILE AND COMPUTE THE MIN AND MAX. NO OUTPUT STATMENTS ALLOWED
		Scanner infile = new Scanner( new File(infileName) );
		int min,max;
		min=max=infile.nextInt(); // WE ASSUME INPUT FILE HAS AT LEAST ONE VALUE
		while ( infile.hasNextInt() )
		{
      int num = infile.nextInt();
      if (num < min)
        min = num;
      else if (num > max)
        max = num;

      // YOUR CODE HERE FIND THE MIN AND MAX VALUES OF THE FILE
			// USING THE LEAST POSSIBLE NUMBER OF COMPARISONS
			// ASSIGN CORRECT VALUES INTO min & max INTHIS LOOP.
			// MY CODE BELOW WILL FORMAT THEM TO THE SCREEN
			// DO NOT WRITE ANY OUTPUT TO THE SCREEN
		}
		System.out.format("min: %d max: %d\n",min,max); // DO NOT REMOVE OR MODIFY IN ANY WAY


		// STEP #2: DO NOT MODIFY THE REST OF MAIN. USE THIS CODE AS IS
		// WE ARE TESTING EVERY NUMBER BETWEEN LO AND HI INCLUSIVE FOR
		// BEING PRIME AND/OR BEING PERFECT
		for ( int i=lo ; i<=hi ; ++i)
		{
			System.out.print( i );
			if ( isPrime(i) ) System.out.print( " prime ");
			if ( isPerfect(i) ) System.out.print( " perfect ");
			System.out.println();
		}
	} // END MAIN

	// *************** YOU FILL IN THE METHODS BELOW **********************

	static boolean isPerfect( int n )
	{
    int sum = 0;
    for (int i=1; i<n; i++){
      if (n%i == 0){
        sum +=i;
      }
    }
    if (sum == n)
    return true;
		return false;
	}

	static boolean isPrime( int n )
	{
      for (int j = 2; j<= n/2 ;j++ ) {
        if (n%j == 0 )
        return false;
      }// (just to make it compile) YOU CHANGE AS NEEDED
      return (n!=1);
    }
} // END Project2 CLASS
