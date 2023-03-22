package Class16.Webview

import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textservice.TextServicesManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isGone
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityMainClass16WebViewBinding

class MainActivityClass16_WebView : AppCompatActivity() {
    lateinit var binding: ActivityMainClass16WebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainClass16WebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (isonline()) {
            binding.webview.loadUrl("https://evaly.com.bd/")
            binding.webview.settings.javaScriptEnabled = true

            binding.webview.webViewClient = object : WebViewClient() {

                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    super.onPageStarted(view, url, favicon)
                    binding.webview.visibility = View.GONE
                    binding.loading.visibility = View.VISIBLE
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    binding.webview.visibility = View.VISIBLE
                    binding.loading.visibility = View.GONE
                }
            }
        } else{
                binding.nonetwork.visibility = View.VISIBLE
                binding.webview.visibility = View.GONE
                binding.loading.visibility = View.GONE
            }
        }


    override fun onBackPressed() {
        if (binding.webview.canGoBack()){
            binding.webview.goBack()
        }else
            super.onBackPressed()
    }

    fun isonline():Boolean{
        val sysService = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkinfo: NetworkInfo? = sysService.activeNetworkInfo

        return networkinfo?.isConnected == true

    }
}