package ir.hajkarami.thequizapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

import ir.hajkarami.thequizapp.databinding.ActivityMainBinding;
import ir.hajkarami.thequizapp.model.Question;
import ir.hajkarami.thequizapp.model.QuestionList;
import ir.hajkarami.thequizapp.viewmodel.QuizViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    QuizViewModel quizViewModel;
    List<Question> questionList;

    static int result = 0;
    static int totalQuestions = 0;
    int  i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Data Binding
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        // Resetting the Scores:
        result = 0;
        totalQuestions = 0;

        // Creating an instance of 'QuizViewModel'
        quizViewModel = new ViewModelProvider(this)
                .get(QuizViewModel.class);
        DisplayFirstQuestion();

    }

    private void DisplayFirstQuestion() {
        quizViewModel.getQuestionListLiveData().observe(
                this,
                new Observer<QuestionList>() {
                    @Override
                    public void onChanged(QuestionList questions) {
                        questionList = questions;
                        // setting the first question
                        binding.txtQuestion.setText("Question 1: "+questions.get(0).getQuestion());
                        binding.radio1.setText(questions.get(0).getOption1());
                        binding.radio2.setText(questions.get(0).getOption2());
                        binding.radio3.setText(questions.get(0).getOption3());
                        binding.radio4.setText(questions.get(0).getOption4());
                    }
                }
        );
    }
}