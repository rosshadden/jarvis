package com.rhadden.jarvis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void change(View v) {
		final TextView welcome = (TextView) findViewById(R.id.welcome);
		final Button speak = (Button) findViewById(R.id.speak);

		welcome.setText("Mwahahaha.");
	}
}
