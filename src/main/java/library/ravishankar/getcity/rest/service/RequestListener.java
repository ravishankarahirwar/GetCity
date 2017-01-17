package library.ravishankar.getcity.rest.service;

import retrofit.RetrofitError;

/**
 * @author Ravishankar Ahirwar
 * @since 17/01/2017
 * @version 1.0
 */
public interface RequestListener
{
    void onSuccess();
    void onFailed(RetrofitError error);
}
