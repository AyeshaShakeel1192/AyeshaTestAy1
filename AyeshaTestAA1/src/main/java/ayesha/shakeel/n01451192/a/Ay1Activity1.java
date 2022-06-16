/* Ayesha Shakeel n01451192
   Midterm test Practise run - CENG258 - SECTION ...
 */
package ayesha.shakeel.n01451192.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ay1Activity1 extends AppCompatActivity {

    //declare the image Button1
    ImageButton btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.Aye1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ay1Activity1.this);
            }
        });

    }


}