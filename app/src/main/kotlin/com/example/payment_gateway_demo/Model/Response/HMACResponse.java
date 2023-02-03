package com.example.payment_gateway_demo.Model.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HMACResponse {
    @SerializedName("hmac")
    @Expose
    public String hmac;
}
