package com.juhe.weather;

import com.juhe.weather.utils.HttpUtil;
import com.thinkland.juheapi.common.CommonFun;

import android.app.Application;


public class WeatherApplication extends Application{

     //juhe_sdk_v_x_x.jar + openid   JH3dee9cd7f33abdbb29a1cf6afd6f9958,根据你在juhe天气上账号有关；
     //用户申请过这个数据之后，用户会获取一个APPKEY，这个key在单独调用接口时是必选参数，在JuhAPISDK中不需要，只要绑定唯一的openid即可。


    //全国天气  http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY ；             AppKey： 15bf2a3cf850786e885984f55076c2be
   //空气质量   https://www.juhe.cn/docs/api/id/33                                                             9b02c8d800e04c87554533a68ab7b8a5
    @Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

        HttpUtil.init(Constant.BASE_URL);
		CommonFun.initialize(getApplicationContext());
	}


}
