
public class Lab3 {
    public static void main (String[] args){
        //| 57.2 * (i1 / i2) + 1  |   |
        //| 57.2 * ((double)i1 / i2) + 1  |   |
        //| 15 – i1 * (d1 * 3) + 4  |  |
        //| 15 – i1 * ((int)d1 * 3) + 4  |  |
        //| 15 – i1 * (int)(d1 * 3) + 4  |  |
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;

        double answerOne = 57.2 * (i1 / i2) + 1; // Prediction = 1
        double answerTwo = 57.2 * ((double)i1 / i2) + 1; //Prediction = ~40
        double answerThree = 15.0 - i1 * (d1 * 3) + 4; // prediction = -1345
        double answerFour = 15 - i1 * ((int)d1 * 3) + 4; // prediction = -1313
        double answerFive = 15 - i1 * (int)(d1 * 3) + 4; // prediction  = -1337

        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);
        System.out.println(answerFour);
        System.out.println(answerFive);
        //The answers matched my predictions
        int num = 1234, reversed = 0;
        
                while(num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }
        
                System.out.println("Reversed Number: " + reversed);
            }
        
    }    