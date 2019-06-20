package com.example.dunqian

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage



class MyFirebaseMessagingService : FirebaseMessagingService() {


    //APP在前景時收到Notification Message會呼叫
    override fun onMessageReceived(msg: RemoteMessage) {
        super.onMessageReceived(msg)



        Log.e("Firebase","AAAA")



    }
}