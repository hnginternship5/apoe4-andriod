package hng.tech.apoe_4.models;

public class QuestionAnswerChat {
    public static final int QUESTION_TYPE = 0;
    public static final int ANSWER_TYPE = 1;
    public static final int LOADING_TYPE = 2;
    private String text, time;
    private int type;

    public QuestionAnswerChat(String text, String time, int type) {
        this.text = text;
        this.time = time;
        this.type = type;
    }

    public QuestionAnswerChat() {
    }

    public QuestionAnswerChat(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
