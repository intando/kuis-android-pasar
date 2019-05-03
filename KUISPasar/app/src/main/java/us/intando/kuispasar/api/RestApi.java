package us.intando.kuispasar.api;

import us.intando.kuispasar.model.ResponseModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {
    //insert
    @FormUrlEncoded
    @POST("insert.php")
    Call<ResponseModel> sendPasar(@Field("kode") String kode,
                                    @Field("nama") String nama,
                                    @Field("alamat") String
                                            alamat);

    //read
    @GET("read.php")
    Call<ResponseModel> getPasar();

    //update menggunakan 3 parameter
    @FormUrlEncoded
    @POST("update.php")
    Call<ResponseModel> updateData( @Field("id") String id,
                                    @Field("kode") String kode,
                                    @Field("nama") String nama,
                                    @Field("alamat") String
                                            alamat);

    //delete menggunakan parameter id
    @FormUrlEncoded
    @POST("delete.php")
    Call<ResponseModel> deleteData(@Field("id") String id);
}
