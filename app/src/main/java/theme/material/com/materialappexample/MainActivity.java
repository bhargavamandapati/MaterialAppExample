package theme.material.com.materialappexample;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theme.material.com.material_button.TestMaterialButton testMaterialButton;
    }

    public void onThemeChange(View view) {
        Resources res = getResources();
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final int newColor = res.getColor(R.color.colorAccent);
        image.setColorFilter(newColor, PorterDuff.Mode.SRC_ATOP);
    }
}
