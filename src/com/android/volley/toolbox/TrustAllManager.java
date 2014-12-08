package com.android.volley.toolbox;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

class TrustAllManager implements X509TrustManager {

    public void checkClientTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {

    }

    public void checkServerTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {

    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

}