package library.ravishankar.getcity.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */

@Parcel
public class Terms
{
    @SerializedName("offset")
    private int mOffset;

    @SerializedName("value")
    private String mValue;

    public String getValue()
    {
        return mValue;
    }

    public int getOffset()
    {
        return mOffset;
    }

    @Override
    public String toString()
    {
        return "Terms{" +
                "mOffset=" + mOffset +
                ", mValue='" + mValue + '\'' +
                '}';
    }
}
