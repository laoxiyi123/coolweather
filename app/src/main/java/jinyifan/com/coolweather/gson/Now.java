package jinyifan.com.coolweather.gson;

/**
 * Created by asus on 2017/11/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
