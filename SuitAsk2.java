import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

class SuitAsk2 {
    public static long start;
        public static void main(String args[]) {
        
            //Edit this number to select number of shuffles!
            
        
            int wantedShuffles = 100000;
            int randomShuffleCounter = 100;
            
            
            //End of user editable area.
            
            int washCount = 0;
            int multiWash = 0;
            int washBuffer = 0;
            int doubleWash = 0;
            int tripleWash = 0;
            
            int [] finalSuitCount;
            finalSuitCount = new int [14];
            
            int[][] suitCount;
            suitCount = new int[4][4];
            //[player][suit]
            
            int[] cardNumber;
            cardNumber = new int[52];
            //A=1...J=11...
            int[] cardSuit;
            cardSuit = new int[52];
            //CDHS=1234
            
            int[] playerScore;
            playerScore = new int[4];
            int playerNumber = 0;
            int playerDisplayNumber = 0;
            
            int shuffle1 = 0;
            int shuffle2 = 0;
            
            int bufferCardNumber = 0;
            int bufferCardSuit = 0;
            
            
            int temp = 0;
            int temp2 = 0;
            int temp3 = 0;
            Random rand = new Random();
            String textInput;
            String buffer;
            


        //System.out.println((char)27 + "[32m" + "********************************");
        //System.out.println("Hello, and welcome to Card Counter");
        //System.out.println((char)27 + "[32m" + "********************************");
        System.out.println((char)27 + "[31m" + "Let's begin! Start a new game by typing \"start\" ");
        Scanner scan = new Scanner(System.in);
        buffer = scan.next();
        textInput = buffer.toLowerCase();
        if (textInput.equals("start")){
            System.out.println("How many iterations would you like?");
            Scanner scan2 = new Scanner(System.in);
            buffer = scan2.next();
            textInput = buffer.toLowerCase();
            try {
                wantedShuffles = Integer.parseInt(textInput);
            } catch(NumberFormatException e){
                System.out.println("Your input was not an integer. Run the program again.");
                System.out.println((char)27 + "[39m");
                return;
            }
            System.out.println("How many shuffles per iteration would you like?");
            Scanner scan3 = new Scanner(System.in);
            buffer = scan3.next();
            textInput = buffer.toLowerCase();
            try {
                randomShuffleCounter = Integer.parseInt(textInput);
            } catch(NumberFormatException e){
                System.out.println("Your input was not an integer. Run the program again.");
                System.out.println((char)27 + "[39m");
                return;
            }
            //Start Stopwatch
            Stopwatch(1);
            
            //System.out.println("Let's start a game!");
            
            //Initiate Giant Statistics loop
            
            for(int numberOfShuffles = 0; numberOfShuffles<wantedShuffles;numberOfShuffles++){
            
                washBuffer = 0;
            
            //Set Cards
            cardNumber[0] = 1;
            cardNumber[1] = 2;
            cardNumber[2] = 3;
            cardNumber[3] = 4;
            cardNumber[4] = 5;
            cardNumber[5] = 6;
            cardNumber[6] = 7;
            cardNumber[7] = 8;
            cardNumber[8] = 9;
            cardNumber[9] = 10;
            cardNumber[10] = 11;
            cardNumber[11] = 12;
            cardNumber[12] = 13;
            cardNumber[13] = 1;
            cardNumber[14] = 2;
            cardNumber[15] = 3;
            cardNumber[16] = 4;
            cardNumber[17] = 5;
            cardNumber[18] = 6;
            cardNumber[19] = 7;
            cardNumber[20] = 8;
            cardNumber[21] = 9;
            cardNumber[22] = 10;
            cardNumber[23] = 11;
            cardNumber[24] = 12;
            cardNumber[25] = 13;
            cardNumber[26] = 1;
            cardNumber[27] = 2;
            cardNumber[28] = 3;
            cardNumber[29] = 4;
            cardNumber[30] = 5;
            cardNumber[31] = 6;
            cardNumber[32] = 7;
            cardNumber[33] = 8;
            cardNumber[34] = 9;
            cardNumber[35] = 10;
            cardNumber[36] = 11;
            cardNumber[37] = 12;
            cardNumber[38] = 13;
            cardNumber[39] = 1;
            cardNumber[40] = 2;
            cardNumber[41] = 3;
            cardNumber[42] = 4;
            cardNumber[43] = 5;
            cardNumber[44] = 6;
            cardNumber[45] = 7;
            cardNumber[46] = 8;
            cardNumber[47] = 9;
            cardNumber[48] = 10;
            cardNumber[49] = 11;
            cardNumber[50] = 12;
            cardNumber[51] = 13;
            
            
            //Assign Suit
            
            cardSuit[0] = 1;
            cardSuit[1] = 1;
            cardSuit[2] = 1;
            cardSuit[3] = 1;
            cardSuit[4] = 1;
            cardSuit[5] = 1;
            cardSuit[6] = 1;
            cardSuit[7] = 1;
            cardSuit[8] = 1;
            cardSuit[9] = 1;
            cardSuit[10] = 1;
            cardSuit[11] = 1;
            cardSuit[12] = 1;
            cardSuit[13] = 2;
            cardSuit[14] = 2;
            cardSuit[15] = 2;
            cardSuit[16] = 2;
            cardSuit[17] = 2;
            cardSuit[18] = 2;
            cardSuit[19] = 2;
            cardSuit[20] = 2;
            cardSuit[21] = 2;
            cardSuit[22] = 2;
            cardSuit[23] = 2;
            cardSuit[24] = 2;
            cardSuit[25] = 2;
            cardSuit[26] = 3;
            cardSuit[27] = 3;
            cardSuit[28] = 3;
            cardSuit[29] = 3;
            cardSuit[30] = 3;
            cardSuit[31] = 3;
            cardSuit[32] = 3;
            cardSuit[33] = 3;
            cardSuit[34] = 3;
            cardSuit[35] = 3;
            cardSuit[36] = 3;
            cardSuit[37] = 3;
            cardSuit[38] = 3;
            cardSuit[39] = 4;
            cardSuit[40] = 4;
            cardSuit[41] = 4;
            cardSuit[42] = 4;
            cardSuit[43] = 4;
            cardSuit[44] = 4;
            cardSuit[45] = 4;
            cardSuit[46] = 4;
            cardSuit[47] = 4;
            cardSuit[48] = 4;
            cardSuit[49] = 4;
            cardSuit[50] = 4;
            cardSuit[51] = 4;
            
            
            //Shuffle cards
            
            for(int shuffleCounter = 0;shuffleCounter<randomShuffleCounter;shuffleCounter++){
                shuffle1 = rand.nextInt(52);
                shuffle2 = rand.nextInt(52);
                bufferCardNumber = cardNumber[shuffle1];
                bufferCardSuit = cardSuit[shuffle1];
                cardNumber[shuffle1] = cardNumber[shuffle2];
                cardSuit[shuffle1] = cardSuit[shuffle2];
                cardNumber[shuffle2] = bufferCardNumber;
                cardSuit[shuffle2] = bufferCardSuit;
            }
            
            //Count cards
            
            //By JQKA
            
            for(temp = 0; temp<52;temp++){
                
                playerNumber = temp/13;
                
                if (cardNumber[temp]==1){
                    playerScore[playerNumber] = playerScore[playerNumber] + 4;
                }
                else if (cardNumber[temp]==11){
                    playerScore[playerNumber] = playerScore[playerNumber] + 1;
                }
                else if (cardNumber[temp]==12){
                    playerScore[playerNumber] = playerScore[playerNumber] + 2;
                }
                else if (cardNumber[temp]==13){
                    playerScore[playerNumber] = playerScore[playerNumber] + 3;
                }
            }
            //By Suit
            for(temp = 0; temp<52; temp++){
            
                playerNumber = temp/13;
                    
                if (cardSuit[temp]==1){
                    //Clubs
                    suitCount[playerNumber][0]++;
                }
                else if (cardSuit[temp]==2){
                    //Diamonds
                    suitCount[playerNumber][1]++;
                }
                else if (cardSuit[temp]==3){
                    //Hearts
                    suitCount[playerNumber][2]++;
                }
                else if (cardSuit[temp]==4){
                    //Spades
                    suitCount[playerNumber][3]++;
                }
            }
            
            for(temp = 0; temp<4; temp++){
                if(suitCount[temp][0]>4){
                    //Clubs
                    playerScore[temp] = playerScore[temp] + suitCount[temp][0] - 4;
                }
                if(suitCount[temp][1]>4){
                    //Diamonds
                    playerScore[temp] = playerScore[temp] + suitCount[temp][1] - 4;
                }
                if(suitCount[temp][2]>4){
                    //Hearts
                    playerScore[temp] = playerScore[temp] + suitCount[temp][2] - 4;
                }
                if(suitCount[temp][3]>4){
                    //Spades
                    playerScore[temp] = playerScore[temp] + suitCount[temp][3] - 4;
                }
                
            }
            //Suit Statistics
            for (temp = 0; temp<4; temp++){
                for(temp2 = 0; temp2<4; temp2++){
                    if (suitCount[temp][temp2]==0){
                        finalSuitCount[0]++;
                    }
                    else if (suitCount[temp][temp2]==1){
                        finalSuitCount[1]++;
                    }
                    else if (suitCount[temp][temp2]==2){
                        finalSuitCount[2]++;
                    }
                    else if (suitCount[temp][temp2]==3){
                        finalSuitCount[3]++;
                    }
                    else if (suitCount[temp][temp2]==4){
                        finalSuitCount[4]++;
                    }
                    else if (suitCount[temp][temp2]==5){
                        finalSuitCount[5]++;
                    }
                    else if (suitCount[temp][temp2]==6){
                        finalSuitCount[6]++;
                    }
                    else if (suitCount[temp][temp2]==7){
                        finalSuitCount[7]++;
                    }
                    else if (suitCount[temp][temp2]==8){
                        finalSuitCount[8]++;
                    }
                    else if (suitCount[temp][temp2]==9){
                        finalSuitCount[9]++;
                    }
                    else if (suitCount[temp][temp2]==10){
                        finalSuitCount[10]++;
                    }
                    else if (suitCount[temp][temp2]==11){
                        finalSuitCount[11]++;
                    }
                    else if (suitCount[temp][temp2]==12){
                        finalSuitCount[12]++;
                    }
                    else if (suitCount[temp][temp2]==13){
                        finalSuitCount[13]++;
                    }
                }
            }

                //Washability
                for (temp = 0;temp<4;temp++){
                    if (playerScore[temp] <=3){
                        washCount++;
                        washBuffer++;
                    }
                }
                
                
            //Debug output
            /*
            for(int temp = 1; temp<52; temp++){
                //System.out.println("Card number " + temp + " is " + cardNumber[temp] + " " + cardSuit[temp]);
            }
            */
            
            //Output
            /*for(playerNumber = 0;playerNumber<4;playerNumber++){
            
            playerDisplayNumber = playerNumber + 1;
            
            System.out.println("Player " + playerDisplayNumber + ":");
            System.out.println("-----------------------------------------------------------");
            for(temp = 0;temp<13;temp++){
                int playerCardTemp = 0;
                playerCardTemp = temp + playerNumber*13;
                if(cardNumber[playerCardTemp]==1){
                    System.out.print("A");
                }
                else if(cardNumber[playerCardTemp]==11){
                    System.out.print("J");
                }
                else if(cardNumber[playerCardTemp]==12){
                    System.out.print("Q");
                }
                else if(cardNumber[playerCardTemp]==13){
                    System.out.print("K");
                }
                else {
                System.out.print(cardNumber[playerCardTemp]);
                }
                
                
                if(cardSuit[playerCardTemp]==1) {
                    System.out.print("D");
                }
                else if(cardSuit[playerCardTemp]==2) {
                    System.out.print("C");
                }
                else if(cardSuit[playerCardTemp]==3) {
                    System.out.print("H");
                }
                else if(cardSuit[playerCardTemp]==4) {
                    System.out.print("S");
                }
                System.out.print(" ");
            }
            System.out.println();
            System.out.println("Player " + playerDisplayNumber + " Score: " + playerScore[playerNumber]);
                if(playerScore[playerNumber] <=3) {
                    System.out.println("Player " + playerDisplayNumber + " calls for a wash.");
                }
            System.out.println();
            }
             */
                
            //Reset all values
                playerScore[0] = 0;
                playerScore[1] = 0;
                playerScore[2] = 0;
                playerScore[3] = 0;
                suitCount[0][0] = 0;
                suitCount[0][1] = 0;
                suitCount[0][2] = 0;
                suitCount[0][3] = 0;
                suitCount[1][0] = 0;
                suitCount[1][1] = 0;
                suitCount[1][2] = 0;
                suitCount[1][3] = 0;
                suitCount[2][0] = 0;
                suitCount[2][1] = 0;
                suitCount[2][2] = 0;
                suitCount[2][3] = 0;
                suitCount[3][0] = 0;
                suitCount[3][1] = 0;
                suitCount[3][2] = 0;
                suitCount[3][3] = 0;
            //Double/Triple Washability
                if (washBuffer == 2) {
                    //System.out.println((char)27 + "[36m");
                    //System.out.println("We have a multi wash scenario here.");
                    //System.out.println((char)27 + "[31m");
                    multiWash++;
                    doubleWash++;
                }
                else if (washBuffer == 3) {
                    //System.out.println((char)27 + "[36m");
                    //System.out.println("We have a triple wash here!");
                    //System.out.println((char)27 + "[31m");
                    multiWash++;
                    tripleWash++;
                }
                
        }
            
        //Debug Statistics
            System.out.println((char)27 + "[93m");
            System.out.println("Number of iterations: " + wantedShuffles);
            System.out.println("Number of shuffles:   " + randomShuffleCounter);
            System.out.println((char)27 + "[39m");
        
        //Final Statistics
            System.out.println((char)27 + "[94m");
            System.out.println("A wash is available " + washCount + " times.");
            System.out.println("A multi-player wash was available "+ multiWash + " times.");
            System.out.println("A Double Wash was available "+ doubleWash + " times.");
            System.out.println("A Triple Wash was available "+ tripleWash + " times.");
            System.out.print((char)27 + "[39m");
            System.out.println("---------------------------------------------------------");
            System.out.print((char)27 + "[96m");
            System.out.println("Number of hands with none of a suit:     "+ finalSuitCount[0]);
            System.out.println("Number of hands with one of a suit:      "+ finalSuitCount[1]);
            System.out.println("Number of hands with two of a suit:      "+ finalSuitCount[2]);
            System.out.println("Number of hands with three of a suit:    "+ finalSuitCount[3]);
            System.out.println("Number of hands with four of a suit:     "+ finalSuitCount[4]);
            System.out.println("Number of hands with five of a suit:     "+ finalSuitCount[5]);
            System.out.println("Number of hands with six of a suit:      "+ finalSuitCount[6]);
            System.out.println("Number of hands with seven of a suit:    "+ finalSuitCount[7]);
            System.out.println("Number of hands with eight of a suit:    "+ finalSuitCount[8]);
            System.out.println("Number of hands with nine of a suit:     "+ finalSuitCount[9]);
            System.out.println("Number of hands with ten of a suit:      "+ finalSuitCount[10]);
            System.out.println("Number of hands with eleven of a suit:   "+ finalSuitCount[11]);
            System.out.println("Number of hands with twelve of a suit:   "+ finalSuitCount[12]);
            System.out.println("Number of hands with thirteen of a suit: "+ finalSuitCount[13]);
            System.out.println((char)27 + "[39m");
            
        //Stop Stopwatch
            System.out.println((char)27 + "[93m");
            Stopwatch(0);
            System.out.println((char)27 + "[39m");
        }
        

        else {
            System.out.println("I did not understand your input of \"" + textInput + "\"");
            System.out.println((char)27 + "[39m");
        }
    }
    public static void Stopwatch(int a) {
        long start;
        if (a == 1) {
            start = 0;
            start = System.currentTimeMillis();
        }
        else {
            long now = System.currentTimeMillis();
            double elapsedTime = (now - start) / 1000.0;
            System.out.printf("%.3f seconds", elapsedTime);
            //System.out.println(start + " " + now);
        }
    }
}