package maikiencuong.lab3;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity_ChonMau extends AppCompatActivity {
    ImageView imageView;
    Button buttonSelect, buttonWhite, buttonBlue, buttonRed, buttonBlack;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__chon_mau);
        getSupportActionBar().hide();

        imageView = findViewById(R.id.imageView2Mau);
        buttonWhite = findViewById(R.id.button3);
        buttonBlue = findViewById(R.id.button4);
        buttonRed = findViewById(R.id.button5);
        buttonBlack = findViewById(R.id.button6);
        buttonSelect = findViewById(R.id.button7);

        Bundle bundleGet = getIntent().getExtras();
        SmartPhone phone = (SmartPhone) bundleGet.getSerializable("smart");

        imageView.setImageResource(phone.getImage());

        ArrayList<SmartPhone> listSmartPhone = new ListSmartPhone().getPhones();
        position = listSmartPhone.indexOf(phone);

        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = 0;
                imageView.setImageResource(listSmartPhone.get(position).getImage());
            }
        });
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = 1;
                imageView.setImageResource(listSmartPhone.get(position).getImage());
            }
        });
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = 3;
                imageView.setImageResource(listSmartPhone.get(position).getImage());
            }
        });
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = 2;
                imageView.setImageResource(listSmartPhone.get(position).getImage());
            }
        });

        buttonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_ChonMau.this, MainActivity.class);
                Bundle bundlePut = new Bundle();
                bundlePut.putSerializable("smartSelect", listSmartPhone.get(position));
                intent.putExtras(bundlePut);
                startActivity(intent);
//                finish();
            }
        });

    }
}