import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String questions = null;
        
        Scanner input = new Scanner(System.in);

        Questions.questionsData(questions, input, Questions.getScore());
        System.out.print("Your Final Score Is " + Questions.getScore());
        System.exit(0);
    }
}