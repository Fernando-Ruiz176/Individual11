package cl.fernando.individual11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cl.fernando.individual11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> Toast.makeText(this, "Modo avión desactivado", Toast.LENGTH_SHORT).show());
        binding.button2.setOnClickListener(v -> Toast.makeText(this, "Perfil actualiazado", Toast.LENGTH_SHORT).show());
        binding.button3.setOnClickListener(v -> Toast.makeText(this, "Imagen guardada en galeria", Toast.LENGTH_SHORT).show());
        binding.button4.setOnClickListener(v -> Toast.makeText(this, "Nivel 5 desbloqueado", Toast.LENGTH_SHORT).show());
        binding.button5.setOnClickListener(v -> Toast.makeText(this, "Nivel 4 completado", Toast.LENGTH_SHORT).show());
        binding.button6.setOnClickListener(v -> Toast.makeText(this, "Musica pausada", Toast.LENGTH_SHORT).show());
    }
}