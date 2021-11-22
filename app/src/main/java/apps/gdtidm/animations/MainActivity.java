package apps.gdtidm.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_slide, btn_move, btn_fade;
    ImageView images;

    Animation slide, move, fade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fade    =   findViewById(R.id.btn_fade_animation);
        btn_move    =   findViewById(R.id.btn_move_animation);
        btn_slide   =   findViewById(R.id.btn_slide_animation);

        images      =   findViewById(R.id.images_animations);

        slide       =   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        move        =   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        fade        =   AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);

        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                images.startAnimation(slide);
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                images.startAnimation(move);
            }
        });

        btn_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                images.startAnimation(fade);
            }
        });

    }
}