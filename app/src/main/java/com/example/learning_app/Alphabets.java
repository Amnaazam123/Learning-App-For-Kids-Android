package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.lang.reflect.Array;

public class Alphabets extends AppCompatActivity implements View.OnClickListener{

    ImageButton Abtn,Bbtn,Cbtn,Dbtn,Ebtn,Fbtn,Gbtn,Hbtn,Ibtn,Jbtn,Kbtn,Lbtn,Mbtn,Nbtn,Obtn,Pbtn,Qbtn,Rbtn,Sbtn,Tbtn,Ubtn,Vbtn,Wbtn,Xbtn,Ybtn,Zbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        Abtn=findViewById(R.id.a);
        Bbtn=findViewById(R.id.b);
        Cbtn=findViewById(R.id.c);
        Dbtn=findViewById(R.id.d);
        Ebtn=findViewById(R.id.e);
        Fbtn=findViewById(R.id.f);
        Gbtn=findViewById(R.id.g);
        Hbtn=findViewById(R.id.h);
        Ibtn=findViewById(R.id.i);
        Jbtn=findViewById(R.id.j);
        Kbtn=findViewById(R.id.k);
        Lbtn=findViewById(R.id.l);
        Mbtn=findViewById(R.id.m);
        Nbtn=findViewById(R.id.n);
        Obtn=findViewById(R.id.o);
        Pbtn=findViewById(R.id.p);
        Qbtn=findViewById(R.id.q);
        Rbtn=findViewById(R.id.r);
        Sbtn=findViewById(R.id.s);
        Tbtn=findViewById(R.id.t);
        Ubtn=findViewById(R.id.u);
        Vbtn=findViewById(R.id.v);
        Wbtn=findViewById(R.id.w);
        Xbtn=findViewById(R.id.x);
        Ybtn=findViewById(R.id.y);
        Zbtn=findViewById(R.id.z);

        Abtn.setOnClickListener(this);
        Bbtn.setOnClickListener(this);
        Cbtn.setOnClickListener(this);
        Dbtn.setOnClickListener(this);
        Ebtn.setOnClickListener(this);
        Fbtn.setOnClickListener(this);
        Gbtn.setOnClickListener(this);
        Hbtn.setOnClickListener(this);
        Ibtn.setOnClickListener(this);
        Jbtn.setOnClickListener(this);
        Kbtn.setOnClickListener(this);
        Lbtn.setOnClickListener(this);
        Mbtn.setOnClickListener(this);
        Nbtn.setOnClickListener(this);
        Obtn.setOnClickListener(this);
        Pbtn.setOnClickListener(this);
        Qbtn.setOnClickListener(this);
        Rbtn.setOnClickListener(this);
        Sbtn.setOnClickListener(this);
        Tbtn.setOnClickListener(this);
        Ubtn.setOnClickListener(this);
        Vbtn.setOnClickListener(this);
        Wbtn.setOnClickListener(this);
        Xbtn.setOnClickListener(this);
        Ybtn.setOnClickListener(this);
        Zbtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(Alphabets.this, imageDisplay.class);
        switch(v.getId()){
            case R.id.a:
                intent.putExtra("resourseInt", R.drawable.a_words);
                startActivity(intent);
                break;
            case R.id.b:
                intent.putExtra("resourseInt", R.drawable.b_words);
                startActivity(intent);
                break;
            case R.id.c:
                intent.putExtra("resourseInt", R.drawable.c_words);
                startActivity(intent);
                break;
            case R.id.d:
                intent.putExtra("resourseInt", R.drawable.d_words);
                startActivity(intent);
                break;
            case R.id.e:
                intent.putExtra("resourseInt", R.drawable.e_words);
                startActivity(intent);
                break;
            case R.id.f:
                intent.putExtra("resourseInt", R.drawable.f_words);
                startActivity(intent);
                break;
            case R.id.g:
                intent.putExtra("resourseInt", R.drawable.g_words);
                startActivity(intent);
                break;
            case R.id.h:
                intent.putExtra("resourseInt", R.drawable.h_words);
                startActivity(intent);
                break;
            case R.id.i:
                intent.putExtra("resourseInt", R.drawable.i_words);
                startActivity(intent);
                break;
            case R.id.j:
                intent.putExtra("resourseInt", R.drawable.j_words);
                startActivity(intent);
                break;
            case R.id.k:
                intent.putExtra("resourseInt", R.drawable.k_words);
                startActivity(intent);
                break;
            case R.id.l:
                intent.putExtra("resourseInt", R.drawable.l_words);
                startActivity(intent);
                break;
            case R.id.m:
                intent.putExtra("resourseInt", R.drawable.m_words);
                startActivity(intent);
                break;
            case R.id.n:
                intent.putExtra("resourseInt", R.drawable.n_words);
                startActivity(intent);
                break;
            case R.id.o:
                intent.putExtra("resourseInt", R.drawable.o_words);
                startActivity(intent);
                break;
            case R.id.p:
                intent.putExtra("resourseInt", R.drawable.p_words);
                startActivity(intent);
                break;
            case R.id.q:
                intent.putExtra("resourseInt", R.drawable.q_words);
                startActivity(intent);
                break;
            case R.id.r:
                intent.putExtra("resourseInt", R.drawable.r_words);
                startActivity(intent);
                break;
            case R.id.s:
                intent.putExtra("resourseInt", R.drawable.s_words);
                startActivity(intent);
                break;
            case R.id.t:
                intent.putExtra("resourseInt", R.drawable.t_words);
                startActivity(intent);
                break;
            case R.id.u:
                intent.putExtra("resourseInt", R.drawable.u_words);
                startActivity(intent);
                break;
            case R.id.v:
                intent.putExtra("resourseInt", R.drawable.v_words);
                startActivity(intent);
                break;
            case R.id.w:
                intent.putExtra("resourseInt", R.drawable.w_words);
                startActivity(intent);
                break;
            case R.id.x:
                intent.putExtra("resourseInt", R.drawable.x_words);
                startActivity(intent);
                break;
            case R.id.y:
                intent.putExtra("resourseInt", R.drawable.y_words);
                startActivity(intent);
                break;
            case R.id.z:
                intent.putExtra("resourseInt", R.drawable.z_words);
                startActivity(intent);
                break;
        }

    }


}