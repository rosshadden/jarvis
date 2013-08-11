package com.rhadden.jarvis;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;

public class MainActivity extends Activity implements OnInitListener {
	private int MY_DATA_CHECK_CODE = 0;
	private TextToSpeech tts;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tts = new TextToSpeech(this, this);
	}

	@Override
	public void onInit(int code) {
		if (code == TextToSpeech.SUCCESS) {
			tts.setLanguage(Locale.getDefault());

			speakWords("Hello. I am Jarvis");
		} else {
			tts = null;
		}
	}

	private void speakWords(String speech) {
		tts.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
	}

	public void change(View v) {
		final TextView welcome = (TextView) findViewById(R.id.welcome);
		final Button speak = (Button) findViewById(R.id.speak);

		welcome.setText("Mwahahaha.");
	}
}
