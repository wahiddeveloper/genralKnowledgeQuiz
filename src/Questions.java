import java.util.Scanner;
import java.util.Random;

public class Questions {
    private static int score;

    public static void lineSpace() {
        System.out.println();
    }

    public static void setScore() {
        score++;
    }

    public static int getScore() {
        return score;
    }

    public static void questionsData(String a, Scanner b, int y) {

        System.out.println("Whats Your Name? ");
        a = b.next();
        lineSpace();
        System.out.println("Hello " + a);
        lineSpace();
        System.out.println("You Will be Given Ten Questions Answer The Questions By Typing The Correct Number!");
        lineSpace();
        System.out.println("Are You Ready?!");
        a = b.next();
        if (a.equals("yes")) {
            lineSpace();
            System.out.println("Lets Get Started!");
        } else {
            System.out.println("Oh");
            System.exit(0);
        }

        Random number = new Random();
        int i = 0;
        int randomNum = number.nextInt(10) + 1;

        if (randomNum > 0 - 10) {
            System.out.println();
        } else {
            System.out.println();
        }

            switch (randomNum) {
                case 1:
                    System.out.println("Who Owns Microsoft? ");
                    System.out.println("1. Bill gates");
                    System.out.println("2. Jake");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                        lineSpace();
                    }
                    break;
                case 2:
                    System.out.println("Who Is The Ceo Of Twitter? ");
                    System.out.println("1. Jack Dorsey");
                    System.out.println("2. Bill Gates");
                    System.out.println("3. Mark Zuckerberg");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                        lineSpace();
                    }
                    break;
                case 3:
                    System.out.println("Mark Zuckerberg Only Likes Australian Girls, True Or False");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();
                    if (a.equals("2")) {
                        System.out.println("Well Done! Next Question!");
                        lineSpace();
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                        lineSpace();
                    }
                    break;
                case 4:
                    System.out.println("What Decade Was Trump Born In? ");
                    System.out.println("1. 1960s");
                    System.out.println("2. 1930s");
                    System.out.println("3. 1940s");
                    System.out.println("4. 1950s");
                    a = b.next();
                    if (a.equals("3")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 5:
                    System.out.println("Apple Is Worth One Trillion Dollars, True Or False? ");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 6:
                    System.out.println("Which One Is The Correct Definition Of Melancholy! ");
                    System.out.println("1. An Emotion Of Rage And Anger, That Is Unexpected.");
                    System.out.println("2. A feeling of pensive sadness, typically with no obvious cause.");
                    a = b.next();
                    if (a.equals("2")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 7:
                    System.out.println("Who Was The First Human In Space? ");
                    System.out.println("1. Neil Armstrong");
                    System.out.println("2. Alex Cones");
                    System.out.println("3. John Glenn");
                    System.out.println("4. Yuri Gagarin");
                    a = b.next();
                    if (a.equals("4")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 8:
                    System.out.println("What are the five colours of the Olympic rings?");
                    System.out.println("1. Blue, yellow, black, green and red");
                    System.out.println("2. Blue, yellow, black, pink, orange");
                    System.out.println("3. Red, yellow, pink, orange");
                    System.out.println("4. Green, yellow, black, green");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 9:
                    System.out.println("Goats Can Swim, True Or False?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Last Question!");
                        lineSpace();
                    }
                    break;
                case 10:
                    System.out.println("Cats Have Short Naps Because...");
                    System.out.println("1. Its Fun");
                    System.out.println("2. In The Wild Need To Be Aware");
                    System.out.println("3. They Dont Need A Lot Of Sleep");
                    System.out.println("4. They Will Die If They Have Long Naps");
                    a = b.next();
                    if (a.equals("2")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                        lineSpace();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                        lineSpace();
                    }
                    break;
            }

            Random digit = new Random();
            int f = 0;
            int randomNums = digit.nextInt(5) + 1;

            if (randomNums > 0-5) {
                System.out.println();
            } else {
                System.out.println();
            }

            switch (randomNums) {
                case 1:
                    System.out.println("Where Is Leads Castle?");
                    System.out.println("1. Kent");
                    System.out.println("2. London");
                    System.out.println("3. Leeds");
                    System.out.println("4. Southampton");
                    a = b.next();
                    if (a.equals("1")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next question!\n");
                    }
                    break;
                case 2:
                    System.out.println("What Is The Capital Of Switzerland?");
                    System.out.println("1. Bangkok");
                    System.out.println("2. London");
                    System.out.println("3. Maine");
                    System.out.println("4. Reykjavík");
                    a = b.next();
                    if (a.equals("3")) {
                        System.out.println("Well Done Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 3:
                    System.out.println("How Many Countries Are There In The World?");
                    System.out.println("1. 217");
                    System.out.println("2. 178");
                    System.out.println("3. 298");
                    System.out.println("4. 195");
                    a = b.next();
                    if (a.equals("4")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 4:
                    System.out.println("What Was Score At The 2018 World Cup Final?");
                    System.out.println("1. 2-2");
                    System.out.println("2. 4-2");
                    System.out.println("3. 3-1");
                    System.out.println("4. 1-2");
                    a = b.next();
                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
                case 5:
                    System.out.println("Where Are The 2028 Olympics Going T0 Be Held?");
                    System.out.println("1. Los Angles");
                    System.out.println("2. Germany");
                    System.out.println("3. London");
                    System.out.println("4. France");
                    a = b.next();
                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question!");
                        setScore();
                    } else {
                        System.out.println("Unlucky! Next Question!");
                    }
                    break;
            }
        }
    }
//TODO: MAIN - RANDOMLY GENERATE A QUESTION UPTO 10