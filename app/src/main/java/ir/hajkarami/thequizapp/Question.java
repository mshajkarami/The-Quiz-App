package ir.hajkarami.thequizapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Question {
    @SerializedName("question")
    @Expose
    private final String question;
    @SerializedName("option1")
    @Expose
    private final String option1;
    @SerializedName("option2")
    @Expose
    private final String option2;
    @SerializedName("option3")
    @Expose
    private final String option3;
    @SerializedName("option4")
    @Expose
    private final String option4;
    @SerializedName("correct_option")
    @Expose
    private final String correctOption;

    public Question(String question, String option1, String option2, String option3, String option4, String correctOption) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getCorrectOption() {
        return correctOption;
    }
}



