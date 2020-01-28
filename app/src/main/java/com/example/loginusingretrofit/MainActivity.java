package com.example.loginusingretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String companyName=et1.getText().toString();
                String userName=et2.getText().toString();
                String password=et3.getText().toString();
                String syskey= "0PBOWWIGVWY42DU4QP9I3LJPJRUZXCLQFRKNUXV7VGQT9WY3A2WL8P0YJHC9H90I04BZAWEVV4KKTAO" +
                        "AKAYL2BNIX4ICPW09MI7WB6FWMPK7IBTBF5OIBE2J3T90OWTJ0EPV4OEBRS72IGAQ38EWQF2HD5LZLT2FHD56BUHI39QYDRLH" +
                        "IMBPTO58Y1FKXN1Z5HLC69HDDIWPZI0NGJF0ZX2AO0LY" +
                        "R4M5HI2ZE92SYQF4N6HAIQ6VQ4RHG5JBSSJDGRHT9JMPNFYV2H1JK6LVH5LZKYUUV6VUU915RREXRGGU";
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://login.glowsis.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                GitHubClient service = retrofit.create(GitHubClient.class);

                Call<ResponseBody> userdetails = service.login(companyName,userName,password,syskey);

                userdetails.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                        Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });


    }
}
