public class UnicodeCharacterDemo {
	public static void main(String[] args){
		// to use a stored unicode character..
		char unicodeChar = '\u0041';
		System.out.println("using stored unicode chars: " + unicodeChar);

		char unicodeChar2 = 'A';
		System.out.println("storing unicode chars: " + unicodeChar2);

		//advancing omo...

		// using unicode chars
		char letterA = '\u0041';	
		char letterSigma = '\u03A3';
      		char copyrightSymbol = '\u00A9';

      		// Storing Unicode chars directly
      		char letterZ = 'Z';
      		char letterOmega = 'Ω';
      		char registeredSymbol = '®';

      		
      		System.out.println("Stored Unicode Characters using Escape Sequences:");
      		System.out.println("Letter A: " + letterA);
      		System.out.println("Greek Capital Letter Sigma: " + letterSigma);
      		System.out.println("Copyright Symbol: " + copyrightSymbol);
      		System.out.println("\nStored Unicode Characters Directly:");
      		System.out.println("Letter Z: " + letterZ);
      		System.out.println("Greek Capital Letter Omega: " + letterOmega);
      		System.out.println("Registered Symbol: " + registeredSymbol);

		// futher with calculations
		// I already declared letterA above  
		char smallLetterA = '\u0061';
		char letterB = 'B';

		int difference = letterA - smallLetterA;
		char letterC = (char) (letterB + difference);
		
		System.out.println("difference btw A and a: " + difference);
		System.out.println("letter C: " + letterC);

	}
}