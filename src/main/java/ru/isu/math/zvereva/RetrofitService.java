package  ru.isu.math.zvereva;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService  {

//    static Proxy proxy = new Proxy(Proxy.Type.HTTP,  new InetSocketAddress(
//            "proxy.isu.ru", 3128));
//    static OkHttpClient client = new OkHttpClient.Builder().build();

    public static UserService RetrofitBuild() {
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://mysterious-mountain-44553.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UserService service = retrofit.create(UserService.class);
        return service;
    }



}
