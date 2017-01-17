package library.ravishankar.getcity.rest.responses;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;

import library.ravishankar.getcity.rest.model.Prediction;


/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */

@Parcel
public class PredictionResponse extends BaseResponse
{
    @SerializedName("predictions")
    private ArrayList<Prediction> mPredictionList;

    public ArrayList<Prediction> getPredictionList()
    {
        return mPredictionList;
    }

    @Override
    public String toString()
    {
        return "PredictionResponse{" +
                "mPredictionList=" + mPredictionList +
                "} " + super.toString();
    }
}
