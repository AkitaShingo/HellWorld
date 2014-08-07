package jp.ne.akita.android.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ButtonClick extends Activity implements OnClickListener {

	private Button btn;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);

		//buttonを取得
		Button btn = (Button)findViewById(R.id.btn_change_textView);
		btn.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {

		Log.v("Button","onClick");
		// textViewの値を変更する
		if(v == btn){
			TextView display = (TextView)findViewById(R.id.top_textView);
			display.setText(R.string.good_by);
			setContentView(display);
		}

	}

}
