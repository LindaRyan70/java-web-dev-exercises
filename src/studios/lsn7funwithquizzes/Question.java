package studios.lsn7funwithquizzes;

public abstract class Question {

    private String text;
    private int pointValue;

    public Question(String text, int pointValue) {
        this.text = text;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(text);
    }

}
