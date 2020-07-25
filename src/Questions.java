import java.util.Scanner;
import java.util.Random;

public class Questions {
    private static int score;
    private static final String yesValue = "yes";

    public static void setScore() {
        score++;
    }

    public static int getScore() {
        return score;
    }

    public static boolean inputValidation(String a, String b){
        String s = a.toLowerCase();
        if(s.equals("y")){ s = "yes"; }
        return s.equals(b);
    }

    public static void questionsData(String a, Scanner b, int y) {
        System.out.println("Welcome To The General Knowledge Quiz!\n");
        System.out.println("Whats Your Name? ");
        a = b.next();
        System.out.println("Hello " + a + "\n");
        System.out.println("You Will be Given Ten Questions Answer The Questions By Typing The Correct Number!\n");
        String ready = "Are You Ready";
        System.out.println(ready);
        a = b.next();
        //Add method to return true if YES, false if anything else
        boolean userInputValid = inputValidation(a, yesValue);

        while (!userInputValid) {
            System.out.println("Invalid input!");
            System.out.println("Try yes or no!\n");
            System.out.println(ready);
            a = b.next();
            userInputValid = inputValidation(a, yesValue);
        }
        System.out.println("Lets Get Started!\n");

        //Questions
        Random number = new Random();
        int randomNum = number.nextInt(10) + 1;

        switch (randomNum) {
            case 1 -> {
                System.out.println("Who Owns Microsoft? ");
                System.out.println("1. Bill gates");
                System.out.println("2. Jake");
                a = b.next();

               while(a.equals("one")) {
                   a = "1";
               }

                if ("1".equals(a)) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 2 -> {

                System.out.println("Who Is The Ceo Of Twitter? ");
                System.out.println("1. Jack Dorsey");
                System.out.println("2. Bill Gates");
                System.out.println("3. Mark Zuckerberg");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1! \n");
                }
            }
            case 3 -> {
                System.out.println("Mark Zuckerberg Only Likes Australian Girls, True Or False");
                System.out.println("1. True");
                System.out.println("2. False");
                a = b.next();

               while(a.equals("two"))  {
                   a = "2";
               }

                if (a.equals("2")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 2!\n");
                }
            }
            case 4 -> {
                System.out.println("What Decade Was Trump Born In? ");
                System.out.println("1. 1960s");
                System.out.println("2. 1930s");
                System.out.println("3. 1940s");
                System.out.println("4. 1950s");
                a = b.next();

                while(a.equals("three")) {
                    a = "3";
                }

                if (a.equals("3")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 3!\n");
                }
            }
            case 5 -> {
                System.out.println("Apple Is Worth One Trillion Dollars, True Or False? ");
                System.out.println("1. True");
                System.out.println("2. False");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 6 -> {
                System.out.println("Which One Is The Correct Definition Of Melancholy! ");
                System.out.println("1. An Emotion Of Rage And Anger, That Is Unexpected.");
                System.out.println("2. A feeling of pensive sadness, typically with no obvious cause.");
                a = b.next();

                while(a.equals("two"))  {
                    a = "2";
                }

                if (a.equals("2")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 2!\n");
                }
            }
            case 7 -> {
                System.out.println("Who Was The First Human In Space? ");
                System.out.println("1. Neil Armstrong");
                System.out.println("2. Alex Cones");
                System.out.println("3. John Glenn");
                System.out.println("4. Yuri Gagarin");
                a = b.next();

                while(a.equals("four")) {
                    a = "4";
                }

                if (a.equals("4")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 4!!\n");
                }
            }
            case 8 -> {
                System.out.println("What are the five colours of the Olympic rings?");
                System.out.println("1. Blue, yellow, black, green and red");
                System.out.println("2. Blue, yellow, black, pink, orange");
                System.out.println("3. Red, yellow, pink, orange");
                System.out.println("4. Green, yellow, black, green");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 9 -> {
                System.out.println("Goats Can Swim, True Or False?");
                System.out.println("1. True");
                System.out.println("2. False");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 10 -> {
                System.out.println("Cats Have Short Naps Because...");
                System.out.println("1. Its Fun");
                System.out.println("2. In The Wild Need To Be Aware");
                System.out.println("3. They Dont Need A Lot Of Sleep");
                System.out.println("4. They Will Die If They Have Long Naps");
                a = b.next();

                while(a.equals("two"))  {
                    a = "2";
                }

                if (a.equals("2")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 2!\n");
                }
            }
        }

        Random digit = new Random();
        int f = 0;
        int randomNums = digit.nextInt(10) + 1;

        if (randomNums > -5) {
            System.out.println();
        } else {
            System.out.println();
        }

        switch (randomNums) {
            case 1 -> {
                System.out.println("Where Is Leads Castle?");
                System.out.println("1. Kent");
                System.out.println("2. London");
                System.out.println("3. Leeds");
                System.out.println("4. Southampton");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 2 -> {
                System.out.println("What Is The Capital Of Switzerland?");
                System.out.println("1. Bangkok");
                System.out.println("2. London");
                System.out.println("3. Maine");
                System.out.println("4. Reykjavík");
                a = b.next();

                while(a.equals("three")) {
                    a = "3";
                }

                if (a.equals("3")) {
                    System.out.println("Well Done Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 3!\n");
                }
            }
            case 3 -> {
                System.out.println("How Many Countries Are There In The World?");
                System.out.println("1. 217");
                System.out.println("2. 178");
                System.out.println("3. 298");
                System.out.println("4. 195");
                a = b.next();

                while(a.equals("four")) {
                    a = "4";
                }

                if (a.equals("4")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 4!\n");
                }
            }
            case 4 -> {
                System.out.println("What Was Score At The 2018 World Cup Final?");
                System.out.println("1. 2-2");
                System.out.println("2. 4-2");
                System.out.println("3. 3-1");
                System.out.println("4. 1-2");
                a = b.next();

                while(a.equals("two"))  {
                    a = "2";
                }

                if (a.equals("2")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 2!\n");
                }
            }
            case 5 -> {
                System.out.println("Where Are The 2028 Olympics Going To Be Held?");
                System.out.println("1. Los Angles");
                System.out.println("2. Germany");
                System.out.println("3. London");
                System.out.println("4. France");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }

                if (a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 6 -> {
                System.out.println("Whats More Colder North Pole Or South Pole?");
                System.out.println("1. North Pole");
                System.out.println("2. South Pole");
                a = b.next();

                while(a.equals("one")) {
                    a = "1";
                }
                if(a.equals("1")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 1!\n");
                }
            }
            case 7 -> {
                System.out.println("Who Was The First Programmer?");
                System.out.println("1. James Smith");
                System.out.println("2. Albert Einstein");
                System.out.println("3. Olive Pierce");
                System.out.println("4. Ada Lovelace");
                a = b.next();

                while(a.equals("four")) {
                    a = "4";
                }

                if(a.equals("4")) {
                    System.out.println("Well Done! Next Question!\n");
                    setScore();
                } else {
                    System.out.println("Unlucky! The Answer Is 4!\n");
                }
                }
                case 8 -> {
                    System.out.println("Dogs Have 7 Paws, True Or False");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }
                case 9 -> {
                    System.out.println("How Old Is Earth?");
                    System.out.println("1. 2.7 Billion Years");
                    System.out.println("2. 28.1 Billion Years");
                    System.out.println("3. 8.9 Billion Years");
                    System.out.println("4. 4.54 Billion Years");
                    a = b.next();

                    while(a.equals("four")) {
                        a = "4";
                    }

                    if(a.equals("4")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 4!\n");
                    }
                }
                case 10 -> {
                    System.out.println("When Did Adolf Hitler Die?");
                    System.out.println("1. 1947");
                    System.out.println("2. 1942");
                    System.out.println("3. 1945");
                    System.out.println("4. 1939");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }
                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 3!\n");
                    }
                }
        }
    }

}