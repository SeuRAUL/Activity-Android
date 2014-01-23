package com.example.activity;

//import com.example.helloworld.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OutraActivity extends Activity {
	
	private EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_outra);
		
		et = (EditText)findViewById(R.id.editText1);
	}
	
	public void closeActivity(View v) {
		
		
		Intent data = new Intent();
		data.putExtra("string", et.getText().toString());
		setResult(RESULT_OK, data);
		finish();
		
		Toast.makeText(this, "Enviando texto", Toast.LENGTH_SHORT).show();
	}

}
