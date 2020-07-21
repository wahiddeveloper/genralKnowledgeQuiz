import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        String name, ready, questions;
        int greater = 5;


        Scanner input = new Scanner(System.in);

        Questions.whatsName();
        name = input.next();
        Questions.lineSpace();
        Questions.helloName(name);

        Questions.lineSpace();
        Questions.introduction();
        Questions.lineSpace();

        Questions.readyYet();
        ready = input.next();
        Questions.ohYes(ready);

        Questions.lineSpace();
        Questions.questionOne();
        Questions.answer(); questions = input.next();
        Questions.questionOneInput(questions);

        Questions.lineSpace();
        Questions.questionTwo();
        Questions.answer();  questions = input.next();
        Questions.questionTwoInput(questions);

        Questions.lineSpace();
        Questions.questionThree();
        Questions.answer(); questions = input.next();
        Questions.questionThreeInput(questions);

        Questions.lineSpace();
        Questions.questionFour();
        Questions.answer(); questions = input.next();
        Questions.questionFourInput(questions);

        Questions.lineSpace();
        Questions.questionFive();
        Questions.answer(); questions = input.next();
        Questions.questionFiveInput(questions);

        Questions.lineSpace();
        Questions.questionSix();
        Questions.answer(); questions = input.next();
        Questions.questionSixInput(questions);

        Questions.lineSpace();
        Questions.questionSeven();
        Questions.answer(); questions = input.next();
        Questions.questionSevenInput(questions);

        Questions.lineSpace();
        Questions.questionEight();
        Questions.answer(); questions = input.next();
        Questions.questionEightInput(questions);

        Questions.lineSpace();
        Questions.questionNine();
        Questions.answer(); questions = input.next();
        Questions.questionNineInput(questions);

        Questions.lineSpace();
        Questions.questionTen();
        Questions.answer(); questions =  input.next();
        Questions.questionTenInput(questions);

        Questions.lineSpace();
        Questions.finalScore();
        Questions.scoreOutput(Questions.getScore(), greater);
    }
}
