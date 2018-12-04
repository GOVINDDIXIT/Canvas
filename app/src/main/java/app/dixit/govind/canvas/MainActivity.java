package app.dixit.govind.canvas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST=1;
    private Button mButtonChooser;
    private Button mButtonUploads;
    private Button mButtonShowFeeds;
    private TextView mTextViewShowFeeds;
    private EditText mEditTextFileName;
    private ImageView mImageView;
    private ProgressBar mProgressBar;

    private Uri ImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonChooser=findViewById(R.id.btn1);
        mButtonUploads=findViewById(R.id.btn2);
        mButtonShowFeeds=findViewById(R.id.btn3);
        mImageView=findViewById(R.id.iView);
        mEditTextFileName=findViewById(R.id.eText);

        mButtonUploads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonShowFeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

       mButtonChooser.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openFileChooser();

           }
       });
    }

    private void openFileChooser()
    {
        Intent intent =new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PICK_IMAGE_REQUEST && resultCode==RESULT_OK && data!=null && data.getData()!=null)
        {
            ImageUri=data.getData();

            Picasso.with(this).load(ImageUri).into(mImageView);
        }
    }
}
