package jp.ne.akita.android.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class HelloWorld extends ActionBarActivity {

	@SuppressLint("ResourceAsColor")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
//		//▽--- ここから追加 ------▽
//		TextView display = new TextView(this);
//		display.setTextColor(getResources().getColor(R.color.hello_red));
//		String[] dreams = getResources().getStringArray(R.array.first_dream);
//		String dream = new String();
//		for (int i=0; i < dreams.length; i++) {
//			dream = dream + (i+1) + dreams[i] + "\n";
//		}
//		//display.setText(getResources().getString(R.string.helloText));
//		display.setText(dream);
//		setContentView(display);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
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
