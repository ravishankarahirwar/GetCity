package library.ravishankar.getcity.rest.responses;

import com.google.gson.annotations.SerializedName;

import library.ravishankar.getcity.rest.ServerParams;


/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */
public class BaseResponse
{
    @SerializedName("status")
    private String mStatus;

    @SerializedName("error_message")
    private String mErrorMessage;

    public String getStatus()
    {
        return mStatus;
    }

    public boolean isSucceeded()
    {
        if (mStatus.equals(ServerParams.STATUS_SUCCEEDED))
        {
            return true;
        }

        return false;
    }

    public boolean isFailure()
    {
        return !isSucceeded();
    }

    @Override
    public String toString()
    {
        return "BaseResponse{" +
                "mStatus='" + mStatus + '\'' +
                ", mErrorMessage='" + mErrorMessage + '\'' +
                '}';
    }
}
