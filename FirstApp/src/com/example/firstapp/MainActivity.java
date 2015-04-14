package com.example.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.appcompat.R.id;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.firstapp.personInfo;

public class MainActivity extends ActionBarActivity {

	
	Boolean flag = false;
	TextView textView;
	Button button;
	ToggleButton toggleButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		
//		   Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();  
//		//onButtonClick();
		//changeTextViewContents();
		toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
		 button = (Button) findViewById(R.id.button1);
//		toggleButton.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				if(toggleButton.getText().toString().equals(toggleButton.getTextOn().toString()))
//				{
//					flag = true;
//				}
//				else
//				{
//					flag = false;
//				}
//				
//			}
//		});
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (toggleButton.getText().toString().equals(toggleButton.getTextOn().toString()))
				{
					personInfo person = new personInfo();
					
					person.setFirstName(((EditText) findViewById(R.id.editText1)).getText().toString());
					person.setSecondName(((EditText) findViewById(R.id.editText2)).getText().toString());
//					Intent intent = new Intent(this, SecondActivity.class);
					Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
					intent.putExtra("personObject", person);
					System.out.println("Starting Activity");
					startActivity(intent);
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Non Editable", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		   
		  
		
	}

//	private void onButtonClick() {
//		// TODO Auto-generated method stub
//		
//		
//		
//		 toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
//
//		  // Toast.makeText(getApplicationContext(),toggleButton.getText(),Toast.LENGTH_SHORT).show();  
//		
//		   if(!(toggleButton.getText().equals(toggleButton.getTextOn())))
//		   {
//			   System.out.println("Editable...");
//			   button = (Button) findViewById(R.id.button1);
//				button.setOnClickListener(new OnClickListener() {
//					
//					@Override
//					public void onClick(View v) {
//						// TODO Auto-generated method stub
//						//changeTextViewContents();
//						
//						personInfo person = new personInfo();
//						
//						person.setFirstName(((EditText) findViewById(R.id.editText1)).getText().toString());
//						person.setSecondName(((EditText) findViewById(R.id.editText2)).getText().toString());
////						Intent intent = new Intent(this, SecondActivity.class);
//						Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//						intent.putExtra("personObject", person);
//						System.out.println("Starting Activity");
//						startActivity(intent);
//						
//
//
//					}
//				});
//		   }
//		   else
//		   {
//			   Toast.makeText(getApplicationContext(), "Non Editable", Toast.LENGTH_SHORT).show();
//			   //onButtonClick();
//		   }
//		
//		
//	}

	private void changeTextViewContents() {
		// TODO Auto-generated method stub
		
		textView = (TextView) findViewById(R.id.textView1);
		textView.setText("Rajat");
	}
	
	public void sendNextActivity(View view) {
		
		personInfo person = new personInfo();
		
		person.setFirstName(((EditText) findViewById(R.id.editText1)).getText().toString());
		person.setSecondName(((EditText) findViewById(R.id.editText2)).getText().toString());


		
		
		Intent intent = new Intent(this, SecondActivity.class);
//		Bundle bundle = new Bundle();
//		bundle.putString("first", firstName);
//		bundle.putString("second", secondName);
//		intent.putExtra("bundle", bundle);
//		

		intent.putExtra("personObject", person);
		System.out.println("Starting Activity");
		startActivity(intent);
		
		
		
//		
//		firstName = ((EditText) findViewById(R.id.editText1)).getText().toString();
//		secondName = ((EditText) findViewById(R.id.editText2)).getText().toString();
//		
//		
//		Intent intent = new Intent(this, SecondActivity.class);
//		intent.putExtra("first", firstName);
//		intent.putExtra("second", secondName);
//		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
