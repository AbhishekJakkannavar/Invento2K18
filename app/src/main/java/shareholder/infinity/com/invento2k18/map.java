package shareholder.infinity.com.invento2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class map extends AppCompatActivity {
    SubsamplingScaleImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        imageView = (SubsamplingScaleImageView)findViewById(R.id.mapimageView);
        imageView.setImage(ImageSource.resource(R.drawable.cm));

    }
}
