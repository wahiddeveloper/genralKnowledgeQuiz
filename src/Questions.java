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
        System.out.println("This Will Be Fun!");
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
        Random switch1 = new Random();
        int switchA = switch1.nextInt(10) + 1;

        switch (switchA) {
            case 1 -> {
                System.out.println("Who Owns Microsoft? ");
                System.out.println("1. Bill gates");
                System.out.println("2. Mark Zuckenberg");
                System.out.println("3. James Doe");
                System.out.println("4. Elon Musk");
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

        Random switch2 = new Random();
        int switchB = switch2.nextInt(10) + 1;

        switch (switchB) {
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
            Random switch3 = new Random();
            int switchC = switch3.nextInt(10) + 1;

            switch(switchC) {

                case 1 -> {
                    System.out.println("What Is A Heliport?");
                    System.out.println("1. Helicopter Part");
                    System.out.println("2. Airport Of Helicopter");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 2 -> {
                    System.out.println("What IS The Intelligence Agency Of The UK?");
                    System.out.println("1. Royal Navy");
                    System.out.println("2. British Army");
                    System.out.println("3. RAF");
                    System.out.println("4. MI5");
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

                case 3 -> {
                    System.out.println("How Many Teeth Does An Adult Have?");
                    System.out.println("1. 32");
                    System.out.println("2. 23");
                    System.out.println("3. 19");
                    System.out.println("4. 28");
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

                case 4 -> {
                    System.out.println("How Many Eggs Does The Average Chicken Lay A Year?");
                    System.out.println("1. 19");
                    System.out.println("2. 391");
                    System.out.println("3. 265");
                    System.out.println("4. 113");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }

                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question!\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 4!\n");
                    }
                }

                case 5 -> {
                    System.out.println("What Is The Capital Of Spain?");
                    System.out.println("1. Madrid");
                    System.out.println("2. Barcelona");
                    System.out.println("3. Valencia");
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

                case 6 -> {
                    System.out.println("Where Would You Find The River Thames?");
                    System.out.println("1. Surrey");
                    System.out.println("2. London");
                    System.out.println("3. Leicester");
                    System.out.println("4. Manchester");
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

                case 7 -> {
                    System.out.println("How Many Legs Does A Lobster Have?");
                    System.out.println("1. 6");
                    System.out.println("2. 10");
                    System.out.println("3. 4");
                    System.out.println("4. 8");
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
                    System.out.println("Enchiladas Originated In Which Country?");
                    System.out.println("1. Spain");
                    System.out.println("2. Italy");
                    System.out.println("3. Portugal");
                    System.out.println("4. Mexico");
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

                case 9 -> {
                    System.out.println("In 'The Jungle Book' What Kind Of Animal Is a Baloo?");
                    System.out.println("1. Bear");
                    System.out.println("2. Tiger");
                    System.out.println("3. Wolf");
                    System.out.println("4. Elephant");
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

                case 10 -> {
                    System.out.println("Where Was Prince Phillip Born?");
                    System.out.println("1. United Kingdom");
                    System.out.println("2. Greece");
                    System.out.println("3. America");
                    System.out.println("4. Germany");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }
            }

        Random switch4 = new Random();
        int switchD = switch4.nextInt(5) + 1;

            switch(switchD) {
                case 1 -> {
                    System.out.println("How Many Players Are On A Rugby League Team?");
                    System.out.println("1. 13");
                    System.out.println("2. 11");
                    System.out.println("3. 7");
                    System.out.println("4. 16");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 1!\n");
                    }
                }

                case 2 -> {
                    System.out.println("Who won the FIFA Women's World Cup in 2019?");
                    System.out.println("1. Germany");
                    System.out.println("2. Australia");
                    System.out.println("3. England");
                    System.out.println("4. Usa");
                    a = b.next();

                    while(a.equals("four")) {
                        a = "4";
                    }

                    if(a.equals("4")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 4!\n");
                    }
                }

                case 3 -> {
                    System.out.println("In Football, Which Team Has Won The Champions League The Most?");
                    System.out.println("1. Barcelona");
                    System.out.println("2. Real Madrid");
                    System.out.println("3. Arsenal");
                    System.out.println("4. Chelsea");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 4 -> {
                    System.out.println("Which vitamin is the only one that you will not find in an egg?");
                    System.out.println("1. Vitamin C");
                    System.out.println("2. Vitamin A");
                    System.out.println("3. Vitamin B");
                    System.out.println("4. Vitamin D");
                    a = b.next();

                    while(a.equals("1")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 1!\n");
                    }
                }

                case 5 -> {
                    System.out.println("Which singer has the most UK Number One singles ever?");
                    System.out.println("1. Ed Sheeran");
                    System.out.println("2. Elvis Presley");
                    System.out.println("3. Stormzy");
                    System.out.println("4. Lewis Capaldi");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 6 -> {
                    System.out.println("Which year was the Premier League founded?");
                    System.out.println("1. 1879");
                    System.out.println("2. 1978");
                    System.out.println("3. 1953");
                    System.out.println("4. 1992");
                    a = b.next();

                    while(a.equals("four")) {
                        a = "4";
                    }

                    if(a.equals("4")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 4!\n");
                    }
                }

                case 7 -> {
                    System.out.println("Who has scored most career goals?");
                    System.out.println("1. Neymar");
                    System.out.println("2. Lionel Messi");
                    System.out.println("3. Cristiano Ronaldo");
                    System.out.println("4. Eden Hazard");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }

                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 3!\n");
                    }
                }

                case 8 -> {
                    System.out.println("Which club won the 2017 UEFA Super Cup?");
                    System.out.println("1. Barcelona");
                    System.out.println("2. PSG");
                    System.out.println("3. Real Madrid");
                    System.out.println("4. Manchester City");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }

                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 3!\n");
                    }
                }

                case 9 -> {
                    System.out.println("Which footballer has the most Instagram followers in the world - as of 2020?");
                    System.out.println("1. Lionel Messi");
                    System.out.println("2. Neymar");
                    System.out.println("3. Cristiano Ronaldo");
                    System.out.println("4. Zlatan Ibrahimović");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }

                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 3!\n");
                    }
                }

                case 10 -> {
                    System.out.println("A woman has walked on the Moon");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }
            }

        Random switch5 = new Random();
        int switchE = switch5.nextInt(5) + 1;

            switch(switchE) {
                case 1 -> {
                    System.out.println("Wayne Rooney scored his Premier League first goal against which team?");
                    System.out.println("1. Manchester City");
                    System.out.println("2. Chelsea");
                    System.out.println("3. Arsenal");
                    System.out.println("4. Liverpool");
                    a = b.next();

                    while(a.equals("three")) {
                        a = "3";
                    }

                    if(a.equals("3")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 3!\n");
                    }
                }

                case 2 -> {
                    System.out.println("There are McDonald’s one every continent except one");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 3 -> {
                    System.out.println("The Channel Tunnel is the longest rail tunnel in the world");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 4 -> {
                    System.out.println("According to Scottish law, it is illegal to be drunk in charge of a cow");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 5 -> {
                    System.out.println("The can-opener was not invented until 45 years after the tin can");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 6 -> {
                    System.out.println("Vietnamese is an official language in Canada");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 7 -> {
                    System.out.println("President Theodore Roosevelt's son was called Kermit");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 8 -> {
                    System.out.println("Edinburgh is further East than Carlisle");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 9 -> {
                    System.out.println("The setting for the ITV drama Midsomer Murders is a fictional English county called Midsomer");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 10 -> {
                    System.out.println("An emu can fly");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }
            }

        Random switch6 = new Random();
        int switchF = switch6.nextInt(5) + 1;

            switch(switchF) {
                case 1 -> {
                    System.out.println("Snakes hear noises through their jaw bone");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 2 -> {
                    System.out.println("The smallest bones in the human body are in the nose");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 3 -> {
                    System.out.println("Fish hear sound through very small ears located 5cm from their eyes");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 4 -> {
                    System.out.println("Smokers are 2x more likely to lose their hearing than non smokers");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 5 -> {
                    System.out.println("Ears not only help you hear but also help you balance");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 6 -> {
                    System.out.println("The loudest sound ever recorded was the blast from the Mars Lunar Rocket launch at Cape Cod in 1986");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 7 -> {
                    System.out.println(" Sound travels at exactly 770 miles per hour");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 8 -> {
                    System.out.println("The noise of a Blue Whale is louder than a jet engine");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 9 -> {
                    System.out.println("The Tiger Pistol Shrimp is the loudest animal in the world");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 10 -> {
                    System.out.println("he sound of the human voice talking is usually about 10 decibels");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }
            }

        Random switch7 = new Random();
        int switchG = switch7.nextInt(5) + 1;

        switch(switchG) {
               case 1 -> {
                   System.out.println("Prince Harry is taller than Prince William");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }

               case 2 -> {
                   System.out.println("The star sign Aquarius is represented by a tiger");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("one")) {
                       a = "1";
                   }

                   if(a.equals("1")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is True!\n");
                   }
               }

               case 3 -> {
                   System.out.println("Meryl Streep has won two Academy Awards");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }

               case 4 -> {
                   System.out.println("Marrakesh is the capital of Morocco");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }

               case 5 -> {
                   System.out.println("Idina Menzel sings 'let it go' 20 times in 'Let It Go' from Frozen");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }

               case 6 -> {
                   System.out.println("Waterloo has the greatest number of tube platforms in London");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("one")) {
                       a = "1";
                   }

                   if(a.equals("1")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is True!\n");
                   }
               }

               case 7 -> {
                   System.out.println("M&M stands for Mars and Moordale");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }

               case 8 -> {
                   System.out.println("Gin is typically included in a Long Island Iced Tea");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("one")) {
                       a = "1";
                   }

                   if(a.equals("1")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is True!\n");
                   }
               }

               case 9 -> {
                   System.out.println("The unicorn is the national animal of Scotland");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("one")) {
                       a = "1";
                   }

                   if(a.equals("1")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is True!\n");
                   }
               }

               case 10 -> {
                   System.out.println("There are two parts of the body that can't heal themselves");
                   System.out.println("1. True");
                   System.out.println("2. False");
                   a = b.next();

                   while(a.equals("two")) {
                       a = "2";
                   }

                   if(a.equals("2")) {
                       System.out.println("Well Done! Next Question\n");
                       setScore();
                   } else {
                       System.out.println("Unlucky! The Answer Is 2!\n");
                   }
               }
            }

        Random switch8 = new Random();
        int switchH = switch8.nextInt(5) + 1;

        switch(switchH) {
                case 1 -> {
                    System.out.println("the five rings on the Olympic flag are interlocking?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 2 -> {
                    System.out.println("Mount Kilimanjaro is the highest mountain in the world?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 3 -> {
                    System.out.println("Strictly Come Dancing first aired in the UK in 2005?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 4 -> {
                    System.out.println("a group of swans is known as a bevy?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 5 -> {
                    System.out.println("Sydney is the capital of Australia?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 6 -> {
                    System.out.println("the Penny Black is an old-fashioned coin?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 7 -> {
                    System.out.println("Glastonbury had been due to celebrate its 50th anniversary in June before the festival was cancelled?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 8 -> {
                    System.out.println("Will.i.am is the only mentor to have appeared on every single series of The Voice UK?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }

                case 9 -> {
                    System.out.println("a heptagon has eight sides?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("two")) {
                        a = "2";
                    }

                    if(a.equals("2")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is 2!\n");
                    }
                }

                case 10 -> {
                    System.out.println("the star sign Capricorn is represented by a goat?");
                    System.out.println("1. True");
                    System.out.println("2. False");
                    a = b.next();

                    while(a.equals("one")) {
                        a = "1";
                    }

                    if(a.equals("1")) {
                        System.out.println("Well Done! Next Question\n");
                        setScore();
                    } else {
                        System.out.println("Unlucky! The Answer Is True!\n");
                    }
                }
            }
        }
    }