
import com.example.seekbarnew.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class SeekbarActivity extends Activity{
	
	private SeekBar volumeControl = null;
	
	protected void OnCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		volumeControl = (SeekBar)findViewById(R.id.volume_bar);
	
		volumeControl = (SeekBar) findViewById(R.id.volume_bar);
		 
        volumeControl.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int progressChanged = 0;
 
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }
 
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
 
            public void onStopTrackingTouch(SeekBar seekBar) {
                
            }
        });
 
    }

}