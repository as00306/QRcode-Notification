package com.example.dunqian

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initFund()
    }


    private fun initFund() {

        // 按鈕監聽
        button.setOnClickListener {
            initScan()
        }
    }

    private fun initScan(){
        IntentIntegrator(this).initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        val result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data)

        // 如果 scan 的結果不為 null
        if (result != null){

            // 若結果為 null 或 empty
            if(result.contents == null){
                Toast.makeText(this, "這個資料是空的", Toast.LENGTH_LONG).show()
            } else {
                editText.setText(result.contents.toString())
            }

        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }

    }

}
