/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coinex.dex.client.api;

import org.coinex.dex.client.ApiCallback;
import org.coinex.dex.client.ApiClient;
import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.ApiResponse;
import org.coinex.dex.client.Configuration;
import org.coinex.dex.client.Pair;
import org.coinex.dex.client.ProgressRequestBody;
import org.coinex.dex.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.coinex.dex.client.model.InlineResponse20053;
import org.coinex.dex.client.model.InlineResponse20054;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiscApi {
    private ApiClient apiClient;

    public MiscApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MiscApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for queryBlockTimes
     * @param height Block height (required)
     * @param count Querier count limited to 1024 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryBlockTimesCall(Long height, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/misc/block-times";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryBlockTimesValidateBeforeCall(Long height, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling queryBlockTimes(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling queryBlockTimes(Async)");
        }
        

        com.squareup.okhttp.Call call = queryBlockTimesCall(height, count, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query block time
     * Query the block time up to given height
     * @param height Block height (required)
     * @param count Querier count limited to 1024 (required)
     * @return List&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Long> queryBlockTimes(Long height, Integer count) throws ApiException {
        ApiResponse<List<Long>> resp = queryBlockTimesWithHttpInfo(height, count);
        return resp.getData();
    }

    /**
     * Query block time
     * Query the block time up to given height
     * @param height Block height (required)
     * @param count Querier count limited to 1024 (required)
     * @return ApiResponse&lt;List&lt;Long&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Long>> queryBlockTimesWithHttpInfo(Long height, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = queryBlockTimesValidateBeforeCall(height, count, null, null);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query block time (asynchronously)
     * Query the block time up to given height
     * @param height Block height (required)
     * @param count Querier count limited to 1024 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryBlockTimesAsync(Long height, Integer count, final ApiCallback<List<Long>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryBlockTimesValidateBeforeCall(height, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryDonation
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryDonationCall(Long time, Long sid, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/misc/donations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (time != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("time", time));
        if (sid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sid", sid));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryDonationValidateBeforeCall(Long time, Long sid, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'time' is set
        if (time == null) {
            throw new ApiException("Missing the required parameter 'time' when calling queryDonation(Async)");
        }
        
        // verify the required parameter 'sid' is set
        if (sid == null) {
            throw new ApiException("Missing the required parameter 'sid' when calling queryDonation(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling queryDonation(Async)");
        }
        

        com.squareup.okhttp.Call call = queryDonationCall(time, sid, count, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query donations info
     * Query donations by DonateToCommunityPool or CommentToken
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @return InlineResponse20054
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20054 queryDonation(Long time, Long sid, Integer count) throws ApiException {
        ApiResponse<InlineResponse20054> resp = queryDonationWithHttpInfo(time, sid, count);
        return resp.getData();
    }

    /**
     * Query donations info
     * Query donations by DonateToCommunityPool or CommentToken
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @return ApiResponse&lt;InlineResponse20054&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20054> queryDonationWithHttpInfo(Long time, Long sid, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = queryDonationValidateBeforeCall(time, sid, count, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20054>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query donations info (asynchronously)
     * Query donations by DonateToCommunityPool or CommentToken
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryDonationAsync(Long time, Long sid, Integer count, final ApiCallback<InlineResponse20054> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryDonationValidateBeforeCall(time, sid, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20054>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryLastBlock
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryLastBlockCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/misc/height";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryLastBlockValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = queryLastBlockCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query least block info
     * Query least block info
     * @return InlineResponse20053
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20053 queryLastBlock() throws ApiException {
        ApiResponse<InlineResponse20053> resp = queryLastBlockWithHttpInfo();
        return resp.getData();
    }

    /**
     * Query least block info
     * Query least block info
     * @return ApiResponse&lt;InlineResponse20053&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20053> queryLastBlockWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = queryLastBlockValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20053>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query least block info (asynchronously)
     * Query least block info
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryLastBlockAsync(final ApiCallback<InlineResponse20053> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryLastBlockValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20053>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
