package com.example.collegeworld;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Arrays;
public class home extends AppCompatActivity {
 Button logout;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.home);
 ListView listView = (ListView) findViewById(R.id.list1);
 Spinner spinner = (Spinner)findViewById(R.id.spin1);
 Spinner spinner1 = (Spinner)findViewById(R.id.spin2);
 Spinner spinner2 = (Spinner)findViewById(R.id.spin3);
 String info[] = {"Final Term Exams will commence from 15 
May,2021.","Datesheet for May-June 2021 will be out soon.","Results for Nov-Dec 2020 
exams will be out soon."};
 ListAdapter listAdapter = new 
ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, 
Arrays.asList(info));
 listView.setAdapter(listAdapter);
 ArrayAdapter<String> adapter;
 adapter = new ArrayAdapter(this, 
android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.S
ocities));
 spinner.setAdapter(adapter);
 spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
 @Override
 public void 
onItemSelected(AdapterView<?> parent, View view, int position, long id) {
 switch (position) {
 case 1:
 
gotoUUrl("https://www.facebook.com/strokessgtbkhalsa/");
 break;
 case 2:
 
gotoUUrl("https://www.instagram.com/anhad_sgtb/?hl=en");
 break;
 case 3:
 
gotoUUrl("https://dubeat.com/tag/enactus-sgtb-khalsa/");
 break;
 }
 }
 private void gotoUUrl(String s) {
 Uri uri = Uri.parse(s);
 startActivity(new Intent(Intent.ACTION_VIEW,uri));
 }
 @Override
 public void 
onNothingSelected(AdapterView<?> parent) {
 }
 });
 ArrayAdapter<String> adapter1;
 adapter1 = new ArrayAdapter(this, 
android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.F
aculty));
 spinner1.setAdapter(adapter1);
 ArrayAdapter<String> adapter2;
 adapter2 = new ArrayAdapter(this, 
android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.T
ime_Table));
 spinner2.setAdapter(adapter2);
 spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
 @Override
 public void onItemSelected(AdapterView<?> View, View view, int position, 
long id) {
 switch (position) {
 case 1:
 Intent intent = new Intent(view.getContext(),bsc.class);
 startActivity(intent);
break;
 case 2:
 Intent intent1 = new Intent(view.getContext(),bcom.class);
 startActivity(intent1);
break;
 case 3:
 Intent intent2 = new Intent(view.getContext(),ba.class);
 startActivity(intent2);
 break;
 }
 }
 @Override
 public void onNothingSelected(AdapterView<?> parent) {
 }
 });
 Button logout = (Button)findViewById(R.id.logout);
 logout.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 AlertDialog.Builder builder = new AlertDialog.Builder(home.this);
 builder.setMessage("You sure you want to logout?")
 .setTitle("Confirm")
.setPositiveButton("YES", new 
DialogInterface.OnClickListener() {
 @Override
public void onClick(DialogInterface dialog, int which) {
 Intent intent = new Intent(getApplicationContext(), 
MainActivity.class);
 startActivity(intent);
 }
 })
 .setNegativeButton("NO", new 
DialogInterface.OnClickListener() {
 @Override
public void onClick(DialogInterface dialog, int which) {
 dialog.cancel();
 }
 })
.setCancelable(true);
 AlertDialog alert11 = builder.create();
 alert11.show();
 }
 });
 }
}
