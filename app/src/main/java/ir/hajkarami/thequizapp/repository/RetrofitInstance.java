package ir.hajkarami.thequizapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ir.hajkarami.thequizapp.api.QuestionsAPI;
import ir.hajkarami.thequizapp.model.QuestionList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private QuestionsAPI mQuestionsAPI;
    String baseUrl = "http://127.0.0.1/quiz/";

    public Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public LiveData<QuestionList> getQuestionsFromAPI() {
        MutableLiveData<QuestionList> data = new MutableLiveData<>();

        Call<QuestionList> response = mQuestionsAPI.getQuestions();
        response.enqueue(new Callback<QuestionList>() {
            @Override
            public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
                QuestionList list = response.body();
                data.setValue(list);
            }

            @Override
            public void onFailure(Call<QuestionList> call, Throwable t) {

            }
        });

        return data;
    }
}
