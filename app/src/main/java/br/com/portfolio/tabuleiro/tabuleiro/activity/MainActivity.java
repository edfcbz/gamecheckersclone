package br.com.portfolio.tabuleiro.tabuleiro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.com.portfolio.tabuleiro.tabuleiro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, TabuleiroActivity.class);
        startActivity(intent);
        finish();

    }
}
