package com.app.traductor;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
private List<Palabra>listaPalabra;
//private MutableLiveData <Palabra> mPalabra;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    listaPalabra=new ArrayList<>();
    listaPalabra.add(new Palabra(R.drawable.arbolito,"tree","arbol"));
        listaPalabra.add(new Palabra(R.drawable.barquito,"boat","barco"));
        listaPalabra.add(new Palabra(R.drawable.casita,"house","casa"));
        listaPalabra.add(new Palabra(R.drawable.dinosaurito,"dinosaur","dinosaurio"));

    }

//    public LiveData<Palabra> getmPalabra() {
//
//        if (mPalabra==null){
//            mPalabra=new MutableLiveData<>();
//        }
//
//        return mPalabra;
//    }


    public void buscarPalabra(String palabra){
      Palabra  palabraEncontrada=new Palabra(R.drawable.error,"Palabra no encontrada","");
    for (Palabra p : listaPalabra) {

        if (p.getPalabraEsp().equalsIgnoreCase(palabra)){
       palabraEncontrada=p;

        }


    }
        Intent intent=new Intent(getApplication(), Traducida.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("palabra",palabraEncontrada);

        intent.putExtra("palabra",bundle);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(intent);

    }
}
