package library.ravishankar.getcity.rest.service;


import java.util.Map;

import library.ravishankar.getcity.rest.responses.PredictionResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */
public interface ApiService
{
    @GET("/place/autocomplete/json")
    void getPredictions(@QueryMap Map<String, String> options, Callback<PredictionResponse> callback);

    @GET("/place/autocomplete/json")
    PredictionResponse getPredictions(@QueryMap Map<String, String> options);
}
