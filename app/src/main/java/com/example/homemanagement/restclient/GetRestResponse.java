package com.example.homemanagement.restclient;

import android.os.AsyncTask;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class GetRestResponse extends AsyncTask<String, Void, ResponseEntity<Account>> {


    @Override
    public ResponseEntity<Account> doInBackground(String... strings) {

        final String url = "http://localhost:8080/getAcc";
        RestTemplate rt = new RestTemplate();

        try {
            rt.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

            HttpHeaders headers = new HttpHeaders();
            headers.set("token", "s");

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<Account> response = rt.exchange(url, HttpMethod.GET, entity, Account.class);

            return response;
        } catch (Exception e) {
            return null;
        }
    }

    public void onPostExecute(ResponseEntity<Account> result) {
        HttpStatus statusCode = result.getStatusCode();
        Account returnedAcc = result.getBody();
    }
}
