package com.example.navigationpracticewithdani.Screens
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//
//public class MainActivity extends AppCompatActivity {
//
//    FloatingActionButton fab1, fab2, fab3, fab4;
//    boolean flag = true;
//
//    @Override
//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
//        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
//        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
//        fab4 = (FloatingActionButton) findViewById(R.id.fab4);
//
//        fab4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (flag) {
//                    fab1.show();
//                    fab2.show();
//                    fab3.show();
//                    fab1.animate().translationY(-(fab2.getCustomSize()+fab3.getCustomSize()+fab4.getCustomSize()));
//                    fab2.animate().translationY(-(fab3.getCustomSize()+fab4.getCustomSize()));
//                    fab3.animate().translationY(-(fab4.getCustomSize()));
//
//                    fab4.setImageResource(R.drawable.ic_favorite);
//                    flag = false;
//
//                }else {
//                    fab1.hide();
//                    fab2.hide();
//                    fab3.hide();
//                    fab1.animate().translationY(0);
//                    fab2.animate().translationY(0);
//                    fab3.animate().translationY(0);
//
//                    fab4.setImageResource(R.drawable.ic_dashboard_black_24dp);
//                    flag = true;
//
//                }
//            }
//        });
//    }
//}