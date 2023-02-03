package com.example.payment_gateway_demo.Model.Response;


import com.example.payment_gateway_demo.Model.Request.DecryptMerchantRequest;

public class PaymentResponse {
    public String MerchantTxnId;
    public String TransactionStatus;
    public String TransactionStatusCode;
    public DecryptMerchantRequest decryptMerchantResponse;
    public String transactionId;
}
