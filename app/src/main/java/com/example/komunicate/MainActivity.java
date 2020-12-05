package com.example.komunicate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

import io.kommunicate.KmConversationBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;


public class  MainActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        fAuth = FirebaseAuth.getInstance();

        Kommunicate.init(this, "373f7359e83c34fbe91ec43dd67477e90");
        List<String> botList = new ArrayList(); botList.add("bot1"); //enter your integrated bot Ids
        new KmConversationBuilder(MainActivity.this)
                .setBotIds(botList)
                .launchConversation(new KmCallback() {
                    @Override
                    public void onSuccess(Object message) {
                        Log.d("Conversation", "Success : " + message);
                    }

                    @Override
                    public void onFailure(Object error) {
                        Log.d("Conversation", "Failure : " + error);
                    }
                });
//        new KmConversationBuilder(MainActivity.this)
//                //.setKmUser(user)
//                .launchConversation(new KmCallback() {
//                    @Override
//                    public void onSuccess(Object message) {
//                        Log.d("Conversation", "Success : " + message);
//                    }
//
//                    @Override
//                    public void onFailure(Object error) {
//                        Log.d("Conversation", "Failure : " + error);
//                    }
//                });

//        new KmConversationBuilder(MainActivity.this)
//                .launchConversation(new KmCallback() {
//                    @Override
//                    public void onSuccess(Object message) {
//                        Log.d("Conversation", "Success : " + message);
//                    }
//
//                    @Override
//                    public void onFailure(Object error) {
//                        Log.d("Conversation", "Failure : " + error);
//                    }
//                });
    }
}
