package ngeeann.com.redcamp.Content;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import ngeeann.com.redcamp.Links;
import ngeeann.com.redcamp.R;

public class Home extends AppCompatActivity {
    RelativeLayout Btn1,Btn2,Btn3,Btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Links links = new Links();

        Btn1 = findViewById(R.id.button1);
        Btn2 = findViewById(R.id.button2);
        Btn3 = findViewById(R.id.button3);
        Btn4 = findViewById(R.id.button4);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            Btn1.setOnClickListener(v-> startActivity(new Intent(this,WebView.class)
                    .putExtra("links", links.getCamp_programme())
                    .putExtra("name","Camp Programme")));
            Btn3.setOnClickListener(v-> startActivity(new Intent(this,WebView.class)
                    .putExtra("links", links.getCampus_explorer())
                    .putExtra("name","Campus Explorer")));
            Btn2.setOnClickListener(v-> startActivity(new Intent(this,WebView.class)
                    .putExtra("links", links.getCourse_finder())
                    .putExtra("name","Course Finder")));
            Btn4.setOnClickListener(v-> startActivity(new Intent(this,WebView.class)
                    .putExtra("links", links.getAsk_red_camp())
                    .putExtra("name","Ask Red Camp")));
        }else{
            Btn1.setOnClickListener((View v)->{
                Intent intent = new Intent(this, WebView.class);
                intent.putExtra("Links", links.getCamp_programme());
                intent.putExtra("name","Camp Programme");
                startActivity(intent);
            });
            Btn2.setOnClickListener((View v)->{
                Intent intent = new Intent(this, WebView.class);
                intent.putExtra("Links", links.getCampus_explorer());
                intent.putExtra("name","Campus Explorer");
                startActivity(intent);
            });
            Btn3.setOnClickListener((View v)->{
                Intent intent = new Intent(this, WebView.class);
                intent.putExtra("Links", links.getCourse_finder());
                intent.putExtra("name","Course Finder");
                startActivity(intent);
            });
            Btn4.setOnClickListener((View v)->{
                Intent intent = new Intent(this, WebView.class);
                intent.putExtra("Links", links.getAsk_red_camp());
                intent.putExtra("name","Ask Red Camp");
                startActivity(intent);
            });
        }
    }
}
