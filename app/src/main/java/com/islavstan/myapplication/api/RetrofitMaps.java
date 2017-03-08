package com.islavstan.myapplication.api;

import com.islavstan.myapplication.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface RetrofitMaps {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);


    @GET("/api/directions/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getRoute(@Query("origin") String origin, @Query("destination") String destination);

}