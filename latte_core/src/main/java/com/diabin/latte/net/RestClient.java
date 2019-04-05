package com.diabin.latte.net;

import com.diabin.latte.net.callback.IError;
import com.diabin.latte.net.callback.IFailure;
import com.diabin.latte.net.callback.IRequest;
import com.diabin.latte.net.callback.ISuccess;

import java.util.WeakHashMap;

import okhttp3.RequestBody;

public class RestClient {

    private final String URL;
    private final WeakHashMap<String,Object> PARAMS;
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IError ERROR;
    private final IFailure FAILURE;
    private final RequestBody BODY;

    public RestClient(String url,
                      WeakHashMap<String, Object> params,
                      IRequest request, ISuccess success,
                      IError error, IFailure failure,
                      RequestBody body) {
        URL = url;
        PARAMS = params;
        REQUEST = request;
        SUCCESS = success;
        ERROR = error;
        FAILURE = failure;
        BODY = body;
    }

    public static RestClientBuilder builder() {
        return new RestClientBuilder();
    }
}
