package library.ravishankar.getcity.rest;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.util.ArrayList;
import java.util.HashMap;

import library.ravishankar.getcity.managers.ContentManager;
import library.ravishankar.getcity.rest.model.Prediction;
import library.ravishankar.getcity.rest.responses.PredictionResponse;
import library.ravishankar.getcity.rest.service.ApiService;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */
public class RestClientManager
{
    private final Context mContext;
    private ApiService mApiService;
    private static RestClientManager msInstance;
    public static final String LOG_TAG = RestClientManager.class.getSimpleName();

    private RestClientManager(Context context)
    {
        mContext = context;
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'")
                .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ServerParams.BASE_SERVER_URL)
                .setConverter(new GsonConverter(gson))
                .build();

        mApiService = restAdapter.create(ApiService.class);
    }

    public static RestClientManager init(Context context)
    {
        if (msInstance == null)
        {
            msInstance = new RestClientManager(context);
        }

        return msInstance;
    }

    public static RestClientManager getInstance()
    {
        return msInstance;
    }

    public ArrayList<Prediction> getSyncPredictionList(String input)
    {
        HashMap<String, String> params = new HashMap<>();
        params.put(ServerParams.INPUT, input);
        params.put(ServerParams.KEY, ServerParams.YOUR_PLACES_KEY);
        params.put(ServerParams.TYPES, ServerParams.TYPE_CITY);
        params.put(ServerParams.COMPONENTS, ServerParams.COMPONENT_COUNTRY);
//        params.put(ServerParams.ADMINISTRATIVE_AREA_LEVEL_1, ServerParams.ADMINISTRATIVE_VALUE);

//        params.put(ServerParams.LOCATION, ServerParams.LOCATION_AREA);
//        params.put(ServerParams.RADIUS, ServerParams.RADIUS_VALUE);
//        params.put(ServerParams.STRICTBOUNDS, ServerParams.STRICTBOUNDS_VALUE);

        PredictionResponse predictions = mApiService.getPredictions(params);
        ContentManager.getInstance().setPredictionList(predictions.getPredictionList());
        return predictions.getPredictionList();
    }
}
