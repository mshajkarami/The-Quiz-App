package ir.hajkarami.thequizapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import ir.hajkarami.thequizapp.model.QuestionList;
import ir.hajkarami.thequizapp.repository.QuizRepository;

public class QuizViewModel extends ViewModel {
    QuizRepository mQuizRepository = new QuizRepository();

    LiveData<QuestionList> mQuestionListLiveData ;

    public LiveData<QuestionList> getQuestionListLiveData() {
        return mQuestionListLiveData;
    }

    public QuizViewModel() {
        mQuestionListLiveData = mQuizRepository.getQuestionsFromAPI();
    }



}
