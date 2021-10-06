/*
 * serviziBancariAPI
 * È l'API Restful offerta dal *fornitore dei servizi bancari* che rende accessibile la capability di generazione di un codice di pagamento con certi parametri e di ricevere dati relativi al pagamento di un cliente.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package paymentprovider.payment_client;

import paymentprovider.ApiCallback;
import paymentprovider.ApiClient;
import paymentprovider.ApiException;
import paymentprovider.ApiResponse;
import paymentprovider.Configuration;
import paymentprovider.Pair;
import paymentprovider.ProgressRequestBody;
import paymentprovider.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.LinkBody;
import io.swagger.client.model.MapsV1Credentials;
import io.swagger.client.model.PaymentaDataBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RisorseApi {
    private ApiClient apiClient;

    public RisorseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RisorseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getLink
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLinkCall(LinkBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/link";

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
            "application/json"
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

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLinkValidateBeforeCall(LinkBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLinkCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Genera link di pagamento
     * È la risorsa che, a fronte di una richiesta HTTP nella cui intestazione vi è un &#x60;token&#x60; identificativo valido, restituisce un codice di pagamento relativo all&#x27;offerta specificata.
     * @param body  (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 getLink(LinkBody body) throws ApiException {
        ApiResponse<InlineResponse200> resp = getLinkWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Genera link di pagamento
     * È la risorsa che, a fronte di una richiesta HTTP nella cui intestazione vi è un &#x60;token&#x60; identificativo valido, restituisce un codice di pagamento relativo all&#x27;offerta specificata.
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> getLinkWithHttpInfo(LinkBody body) throws ApiException {
        com.squareup.okhttp.Call call = getLinkValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Genera link di pagamento (asynchronously)
     * È la risorsa che, a fronte di una richiesta HTTP nella cui intestazione vi è un &#x60;token&#x60; identificativo valido, restituisce un codice di pagamento relativo all&#x27;offerta specificata.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLinkAsync(LinkBody body, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLinkValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPaymentdata
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPaymentdataCall(PaymentaDataBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/paymentdata";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPaymentdataValidateBeforeCall(PaymentaDataBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postPaymentdataCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Ricevi dati di pagamento
     * È la risorsa che permette al cliente intenzionato ad acquistare un&#x27;offerta di inviare al fornitore dei servizi bancari il pagamento corrispondente.
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postPaymentdata(PaymentaDataBody body) throws ApiException {
        postPaymentdataWithHttpInfo(body);
    }

    /**
     * Ricevi dati di pagamento
     * È la risorsa che permette al cliente intenzionato ad acquistare un&#x27;offerta di inviare al fornitore dei servizi bancari il pagamento corrispondente.
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postPaymentdataWithHttpInfo(PaymentaDataBody body) throws ApiException {
        com.squareup.okhttp.Call call = postPaymentdataValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Ricevi dati di pagamento (asynchronously)
     * È la risorsa che permette al cliente intenzionato ad acquistare un&#x27;offerta di inviare al fornitore dei servizi bancari il pagamento corrispondente.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPaymentdataAsync(PaymentaDataBody body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPaymentdataValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postRegistration
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postRegistrationCall(MapsV1Credentials body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/registration";

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRegistrationValidateBeforeCall(MapsV1Credentials body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postRegistrationCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registra un nuovo utente
     * È la risorsa che permette a chi intende interagire con il fornitore dei servizi bancari di ottenere l&#x27;APIKey per poter essere identificato e autorizzato.
     * @param body  (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 postRegistration(MapsV1Credentials body) throws ApiException {
        ApiResponse<InlineResponse2001> resp = postRegistrationWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Registra un nuovo utente
     * È la risorsa che permette a chi intende interagire con il fornitore dei servizi bancari di ottenere l&#x27;APIKey per poter essere identificato e autorizzato.
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> postRegistrationWithHttpInfo(MapsV1Credentials body) throws ApiException {
        com.squareup.okhttp.Call call = postRegistrationValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registra un nuovo utente (asynchronously)
     * È la risorsa che permette a chi intende interagire con il fornitore dei servizi bancari di ottenere l&#x27;APIKey per poter essere identificato e autorizzato.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRegistrationAsync(MapsV1Credentials body, final ApiCallback<InlineResponse2001> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postRegistrationValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
