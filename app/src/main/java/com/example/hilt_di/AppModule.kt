package com.example.hilt_di

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun getFirebaseFirestore(): FirebaseFirestore=FirebaseFirestore.getInstance()

    fun getFirebaseStorage():FirebaseStorage= FirebaseStorage.getInstance()

}