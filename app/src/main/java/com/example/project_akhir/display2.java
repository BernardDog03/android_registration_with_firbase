package com.example.project_akhir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class display2 extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private LinearLayout layoutside = null;
    Button Side;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);
        layoutside = (LinearLayout) findViewById(R.id.sidedrawwer);
        Side = (Button) findViewById(R.id.aboutUs);

        Side.setBackgroundColor(getColor(R.color.biru3));
        Side.setTextColor(getColor(R.color.colorPrimaryDark));

        findViewById(R.id.drawwer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutside.getVisibility() == View.GONE) {
                    layoutside.setVisibility(View.VISIBLE);
                } else {
                    layoutside.setVisibility(View.GONE);
                }
            }
        });
        mrecyclerView = (RecyclerView) findViewById(R.id.rv_requests);
        new FirebaseDatabaseHelper2().readRequests(new FirebaseDatabaseHelper2.DataStatus() {
            @Override
            public void dataIsLoad(List<Requests> requests, List<String> keys) {
                new
                        RecyclerView_Config().setConfig(mrecyclerView,display2.this,requests,keys);
            }
            @Override
            public void dataIsUpdate() {
            }
            @Override
            public void dataIsDeleted() {
            }
        });
        findViewById(R.id.drawwer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutside.getVisibility() == View.GONE) {
                    layoutside.setVisibility(View.VISIBLE);
                } else {
                    layoutside.setVisibility(View.GONE);
                }
            }
        });
        findViewById(R.id.aboutUs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutside.getVisibility() == View.GONE) {
                    layoutside.setVisibility(View.VISIBLE);
                } else {
                    layoutside.setVisibility(View.GONE);
                }
            }
        });
        findViewById(R.id.log_out).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });
        findViewById(R.id.kelas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), display1.class));
            }
        });
        findViewById(R.id.homeside).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), DisplayActivity.class));
            }
        });
        findViewById(R.id.convetbl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), display3.class));
            }
        });
    }
}
