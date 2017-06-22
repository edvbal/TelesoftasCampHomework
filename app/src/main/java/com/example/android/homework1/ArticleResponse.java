package com.example.android.homework1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Edvinas on 22/06/2017.
 */

public class ArticleResponse {
    // Parasom kokius JSON objektus is GET atsakymo reikia pasiimt
    @SerializedName("status")
    public String status;
    @SerializedName("source")
    public String source;

    public String getStatus() {
        return status;
    }

    public String getSource() {
        return source;
    }
}
