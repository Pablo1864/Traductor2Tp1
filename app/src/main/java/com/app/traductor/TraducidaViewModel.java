package com.app.traductor;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class TraducidaViewModel extends AndroidViewModel {
    private MutableLiveData<Palabra> mPalabra;

    public TraducidaViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Palabra> getmPalabra() {

        if (mPalabra==null){
            mPalabra=new MutableLiveData<>();
        }

        return mPalabra;
    }

    public void mostrarPalabra(Intent intent){
        Bundle bundle= intent.getBundleExtra("palabra");
        Palabra pal=(Palabra) bundle.getSerializable("palabra");

        if (pal!=null){

            mPalabra.setValue(pal);
        }


    }
}
