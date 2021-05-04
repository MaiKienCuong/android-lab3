package maikiencuong.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonChonMau;
    ImageView imageView;
    TextView tvPhoneName, tvReview, tvPrice, tvDiscoutPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        buttonChonMau = findViewById(R.id.buttonChonMau);
        imageView = findViewById(R.id.imageView);
        tvPhoneName = findViewById(R.id.tvPhoneName);
        tvDiscoutPrice = findViewById(R.id.tvDiscoutPrice);
        tvPrice = findViewById(R.id.tvPrice);
        tvReview = findViewById(R.id.tvDanhGia);

        ArrayList<SmartPhone> phones = ListSmartPhone.getNewInstance().getPhones();

        SmartPhone smartPhone = phones.get(0);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            SmartPhone phone = (SmartPhone) bundle.getSerializable("smartSelect");
            setContent(phone);
        } else {
            setContent(smartPhone);
        }

        buttonChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity_ChonMau.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("smart", smartPhone);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void setContent(SmartPhone smartPhone) {
        tvDiscoutPrice.setText(smartPhone.getDiscountPrice() + "");
        tvPhoneName.setText(smartPhone.getPhoneName());
        tvPrice.setText(smartPhone.getPrice() + "");
        tvReview.setText(smartPhone.getReview()+"");
        imageView.setImageResource(smartPhone.getImage());
    }
}