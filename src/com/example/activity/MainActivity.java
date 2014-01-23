package com.example.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv = (TextView)findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void chamarOutraActivity(View v) {
		Intent intent = new Intent(this, OutraActivity.class);
		startActivityForResult(intent, 1234);
		// startActivity(intent);
		
		Toast.makeText(this, "Chamando Outra Activity", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == 1234 && resultCode == RESULT_OK) {
			Bundle bundle = data.getExtras();
			tv.setText(bundle.getString("string"));
		}
	}

}
