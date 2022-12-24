package com.example.uasmp_rany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    ImageView imageView;

    private EditText edtnama, edtnoinduk, edttgllahir, edtsemester, edtjurusan;
    private Button btnsubmit;
    private TextView txtnama;
    private TextView txtnoinduk;
    private TextView txttgllahir;
    private TextView txtsemester;
    private TextView txtjurusan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Beasiswa Indonesia Pintar");
        edtnama=(EditText) this.findViewById(R.id.namalengkap);
        edtnoinduk=(EditText) this.findViewById(R.id.nomorinduk);
        edttgllahir=(EditText) this.findViewById(R.id.tgllahir);
        edtsemester=(EditText) this.findViewById(R.id.semester);
        edtjurusan=(EditText) this.findViewById(R.id.jurusan);
        btnsubmit=(Button) this.findViewById(R.id.tombol2);
        txtnama=(TextView) this.findViewById(R.id.namalengkap);
        txtnoinduk=(TextView) this.findViewById(R.id.nomorinduk);
        txttgllahir=(TextView) this.findViewById(R.id.tgllahir);
        txtsemester=(TextView) this.findViewById(R.id.semester);
        txtjurusan=(TextView) this.findViewById(R.id.jurusan);
        ImageView = (ImageView) this.findViewById(R.id.imageView1);
        Button btnfoto = (Button) this.findViewById(R.id.tombol1);
        btnfoto.setOnClickListener(new View.OnClickListener());
            btnsubmit.setOnClickListener(new View.OnClickListener());

    @Override

            public void onClick(View view){
                    String namalengkap = edtnama.getText().toString().trim();
                    String nomorinduk = edtnoinduk.getText().toString().trim();
                    String tgllahir = edttgllahir.getText().toString().trim();
                    String semester = edtsemester.getText().toString().trim();
                    String jurusan = edtjurusan.getText().toString().trim();
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, CAMERA_REQUEST);
                }
            }
            });
            btnsubmit.setOnClickListener(new View.OnClickListener());{

                @Override
                        public void onClick(View view){
                    txtnama.setText("");
                    txtnoinduk.setText("");
                    txttgllahir.setText("");
                    txtsemester.setText("");
                    txtjurusan.setText("");
            }
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CAMERA_REQUEST){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }