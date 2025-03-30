package ir.hajkarami.thequizapp.api;

import ir.hajkarami.thequizapp.model.Question;
import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {
    @GET("myquizapi.php") // end point
    Call<Question> getQuestions();
}
