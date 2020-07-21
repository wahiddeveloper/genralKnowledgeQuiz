public class Questions {
    private static int score;

    public static void answer() { System.out.println("Answer: "); }
    public static void whatsName() { System.out.println("Whats Your Name? "); }
    public static void lineSpace() { System.out.println(); }
    public static void helloName(String a) { System.out.println("Hello " + a); }
    public static void introduction() { System.out.println("You Will be Given Ten Questions Answer The Questions By Typing The Correct Number!"); }
    public static void readyYet() {
        System.out.println("Are You Ready!? ");
    }
    public static void ohYes(String a) { if(a.equals("yes")) {
        System.out.println("Great Lets Get Started! ");
    } else {
        System.out.println("Oh");
        System.exit(0);
    } }

    public static void questionOne() {
        System.out.println("Whats More Colder 1 Or 2? ");
        System.out.println("1. North Pole");
        System.out.println("2. South Pole");
    }
    public static void questionOneInput(String a) { if(a == ("1")) {
        System.out.println("Well Done! Next Question!");
        setScore();
    } else {
        System.out.println("Unlucky! Next Question!");
    } }

    public static void questionTwo() {
        System.out.println("Who Is The Ceo Of Twitter? ");
        System.out.println("1. Bill gates");
        System.out.println("2. Jack Dorsey");
        System.out.println("3. Biz Stone");
    }
    public static void questionTwoInput(String a) { if(a.equals("2")) {
        System.out.println("Well Done! Next Question!");
        setScore();
    } else { System.out.println("Unlucky! Next Question!"); }
    }
    public static void questionThree() {
        System.out.println("How Old Is The Oldest Person Alive Today?");
        System.out.println("1. 102");
        System.out.println("2. 107");
        System.out.println("3. 119");
        System.out.println("4. 116");
    }
    public static void questionThreeInput(String a) { if(a.equals("4"))  {
        System.out.println("Well Done! Next Question!");
        setScore();
        } else { System.out.println("Unlucky! Next Question!");
    }
    }
    public static void questionFour() {
        System.out.println("The Great Wall of China is longer than the distance between London and Beijing, True Or false? ");
        System.out.println("1. True");
        System.out.println("2. False");
    }
    public static void questionFourInput(String a) { if(a.equals("1")) {
        System.out.println("Well Done! Next Question");
        setScore();
    } else { System.out.println("Unlucky! Next Question!");
    }
    }
    public static void questionFive() {
        System.out.println("Apple Is Worth A Trillion Dollars");
        System.out.println("1. True");
        System.out.println("2. False");
    }
    public static void questionFiveInput(String a) { if(a.equals("1")) {
        System.out.println("Well Done! Next Question!");
        setScore();
    } else {
        System.out.println("Unlucky! Next Question!");
    }
    }
    public static void questionSix() {
        System.out.println("Microsoft Was Found By? ");
        System.out.println("1. Miley Cyrus");
        System.out.println("2. Mark Zuckerberg");
        System.out.println("3. Jk Rowling");
        System.out.println("4. Bill Gates");
    }
    public static void questionSixInput(String a) { if(a.equals("4")) {
        System.out.println("Well Done! Next Question! ");
        setScore();
    } else { System.out.println("Unlucky! Next Question! "); } }
    public static void questionSeven() {
        System.out.println("Who Was The First Person In Space? ");
        System.out.println("1. Neil Armstrong");
        System.out.println("2. Alan Shepard");
        System.out.println("3. Yuri Gagarin");
        System.out.println("4. John Glenn");
    }
    public static void questionSevenInput(String a) { if(a.equals("3")) {
        System.out.println("Well Done! Next Question!");
        setScore();
    } else {
        System.out.println("Unlucky! Next Question!");
    }
    }
    public static void questionEight() {
        System.out.println("Mark Zuckerberg Only Likes Girls From Australia, True Or False? ");
        System.out.println("1. True");
        System.out.println("2. False");
    }
    public static void questionEightInput(String a) { if(a.equals("2")){
        System.out.println("Well Done! Next Question!");
        setScore();
    }else {
        System.out.println("Unlucky! Next Question! ");
    } }
    public static void questionNine() {
        System.out.println("In which decade was Donald Trump born? ");
        System.out.println("1. 1960s");
        System.out.println("2. 1930s");
        System.out.println("3. 1940s");
        System.out.println("4. 1920s");
    }
    public static void questionNineInput(String a) { if(a.equals("3")) {
        System.out.println("Well Done! Last Question!");
        setScore();
    } else {
        System.out.println("Unlucky! Last Question!");
    } }
    public static void questionTen() {
        System.out.println("Who Found Netflix? ");
        System.out.println("1. Reed Hastings");
        System.out.println("2. Donald Trump");
        System.out.println("3. Alex Randolph");
    }
    public static void questionTenInput(String a) { if(a.equals("1")){
        System.out.println("Well Done! We Are Done!");
        setScore();
    } else {
        System.out.println("Unlucky! Lets See Your Score!");
    } }
    public static void finalScore() {
        System.out.println("Your Final Score Is " + getScore());
    }
    public static void scoreOutput(int a, int b) {
        if(a >= b) { System.out.println("Good Score!"); }
        else { System.out.println("You can Do Better Next Time!"); }
    }

    public static void setScore(){ score++; }
    public static int getScore(){
        return score;
    }

    public static void questionsData(int a){
        switch(a){
            case 1:
                questionOne();
        }
    }
}
//TODO: MAIN - RANDOMLY GENERATE A QUESTION UPTO 10
//TODO: CREATE SWITCH STATEMENT
