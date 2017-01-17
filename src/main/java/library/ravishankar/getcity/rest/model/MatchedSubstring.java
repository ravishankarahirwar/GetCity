package library.ravishankar.getcity.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */

@Parcel
public class MatchedSubstring
{
    @SerializedName("length")
    private int mLength;

    @SerializedName("offset")
    private int mOffset;

    public int getLength()
    {
        return mLength;
    }

    public int getOffset()
    {
        return mOffset;
    }

    @Override
    public String toString()
    {
        return "MatchedSubstring{" +
                "mLength=" + mLength +
                ", mOffset=" + mOffset +
                '}';
    }
}
