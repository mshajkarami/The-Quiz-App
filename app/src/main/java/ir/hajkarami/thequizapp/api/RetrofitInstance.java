package ir.hajkarami.thequizapp.api;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ir.hajkarami.thequizapp.model.QuestionList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    String baseUrl = "http://10.0.2.2/quiz/";

    public Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
