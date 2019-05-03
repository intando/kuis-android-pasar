package us.intando.kuispasar.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    //url tersimpanya file-file web service
    private static final String base_url =
            "http://192.168.43.88/kuis_pasar/";
    private static Retrofit retrofit;
    public static Retrofit getClient()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
