package com.example.mylibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

import com.example.mylibrary.R

class HTMLStuff : Fragment() {

    companion object {
        fun newInstance() = HTMLStuff()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = view?.findViewById<WebView>(R.id.webView)
        webView?.webViewClient = WebViewClient()
        webView?.settings?.javaScriptEnabled = true
        webView?.settings?.domStorageEnabled = true
        webView?.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        val htmlContent = """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script type="module" src="https://components-stg.stellarfi.com/staging/latest/my-timer/index.esm.js"></script>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello, World!</h1>

    <my-timer duration="10"></my-timer>
</body>
</html>
""";
        webView?.loadData(htmlContent, "text/html", "UTF-8")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.fragment_h_t_m_l_time, container, false)
    }

}