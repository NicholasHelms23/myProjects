public class Magic {
	public static void main(String[] args) {
      /* Erase and recomment lines of "myNumber"
      int variables to see that the output
      doesn't change*/
      //int myNumber = 6;
      //int myNumber = 8; 
      int myNumber = 12;
      int stepOne = myNumber * myNumber;
      int stepTwo = stepOne + myNumber;
      int stepThree = stepTwo / myNumber;
      int stepFour = stepThree + 17;
      int stepFive = stepFour - myNumber;
      int stepSix = stepFive / 6;
      System.out.println(stepSix);
	}
}
