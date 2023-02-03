package com.example.payment_gateway_demo.Network;

import com.example.payment_gateway_demo.Constant;
import com.example.payment_gateway_demo.Model.Request.DecryptMerchantRequest;
import com.example.payment_gateway_demo.Model.Request.EncHMACRequest;
import com.example.payment_gateway_demo.Model.Request.HMACRequest;
import com.example.payment_gateway_demo.Model.Response.DecryptMerchantResponse;
import com.example.payment_gateway_demo.Model.Response.HMACResponse;
import com.example.payment_gateway_demo.Model.Response.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST(Constant.API_GET_HMAC)
    Call<HMACResponse> getHMACData(@Header("merchantId") String merchantId, @Body HMACRequest jsonData);

    @POST(Constant.API_GET_TOKEN)
    Call<TokenResponse> getTokenResponse(@Header("HMAC") String hmac, @Header("merchantId") String merchantId, @Body EncHMACRequest jsonData);

    @Headers("Content-Type: application/json")
    @POST(Constant.API_DECRYPT_RESPONSE)
    Call<DecryptMerchantResponse> getDecryptResponse(@Body DecryptMerchantRequest jsonStr);

}
