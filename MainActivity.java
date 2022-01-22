
package com.example.collegeworld;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_SHORT;
public class MainActivity extends AppCompatActivity {
 EditText uidtxt,passtxt;
 Button login;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 uidtxt = (EditText)findViewById(R.id.uidtxt);
 passtxt = (EditText)findViewById(R.id.passtxt);
 login = (Button)findViewById(R.id.log);
 login.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 String username = uidtxt.getText().toString();
 String password = passtxt.getText().toString();
 if (username.equals("KASHISH") && (password.equals("kaur"))) {
 Intent intent = new Intent(v.getContext(), home.class);
 startActivity(intent);
 } else {
 Intent intent1 = new Intent(v.getContext(), MainActivity.class);
 startActivity(intent1);
 }
 }
 });
 }
}
