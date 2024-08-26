package com.app.traductor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.app.traductor.TraducidaViewModel;
import com.app.traductor.databinding.ActivityTraducidaBinding;


public class Traducida extends AppCompatActivity {
    private TraducidaViewModel vm;
    private ActivityTraducidaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(TraducidaViewModel.class);
        binding=ActivityTraducidaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm.getmPalabra().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {
        binding.tvTraducida.setText(palabra.getPalabraEng());
        binding.img.setImageResource(palabra.getFoto());


            }
        });

        vm.mostrarPalabra(getIntent());

    }
}