package com.example.hilt_di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var db:FirebaseFirestore
    @Inject
    lateinit var storage:FirebaseStorage


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // After use of Inject there is not need to write  this line..It work by compairing datatype
        // db= FirebaseFirestore.getInstance()

    }
}