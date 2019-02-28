package br.com.fiap.a03_desafio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Desafio03 extends AppCompatActivity {

    ImageView img1;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio03);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
    }

    public void actionDice(View view) {
        Random rand = new Random();
        int n2 = rand.nextInt(6);
        int n1 = rand.nextInt(6);
        String respToast= "";
        if(n1 == n2){

        }

        switch ( n1 + 1 ) {
            case 1:
                img1.setImageResource(R.drawable.d1);
                break;
            case 2:
                img1.setImageResource(R.drawable.d2);
                break;
            case 3:
                img1.setImageResource(R.drawable.d3);
                break;
            case 4:
                img1.setImageResource(R.drawable.d4);
                break;
            case 5:
                img1.setImageResource(R.drawable.d5);
                break;
            case 6:
                img1.setImageResource(R.drawable.d6);
                break;
        }

    }
}
