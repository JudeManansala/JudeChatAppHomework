package com.example.citrus.yeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterChat(View view)  {
        Intent intent = new Intent(this, ChatActivity.class );
        EditText chatroomEntranceText = (EditText) findViewById(R.id.chatroomNameInput);
        String chatroomName = chatroomEntranceText.getText().toString();
        intent.putExtra("CHATROOM_NAME",chatroomName);
        EditText usernameText = (EditText) findViewById(R.id.usernameInput);
        String userName = usernameText.getText().toString();
        intent.putExtra("USER_NAME",userName);
        Switch incognitoModeSwitch = (Switch) findViewById(R.id.incognitoModeSwitch);
        Boolean incognitoSwitch = incognitoModeSwitch.isChecked();
        intent.putExtra("INCOGNITO_MODE",incognitoSwitch);

        startActivity(intent);


    }
}
