package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class ThongBao extends AppCompatActivity {


    ImageButton IbtnHomepage,IbtnUtilies,IbtnSearch,IbtnInbox,IbtnMenu;
    TextView txtTBNDung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);
        IbtnHomepage = (ImageButton)findViewById(R.id.imageButtonHomepage);
        IbtnUtilies = (ImageButton)findViewById(R.id.imageButtonUlities);
        IbtnSearch = (ImageButton)findViewById(R.id.imageButtonSearch);
        IbtnInbox = (ImageButton)findViewById(R.id.imageButtonInbox);
        IbtnMenu = (ImageButton)findViewById(R.id.imageButtonMenu);
        txtTBNDung = (TextView)findViewById(R.id.textViewTBNDung);
        IbtnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongBao.this,MainActivity.class);
                startActivity(doimanhinh);
            }
        });
        IbtnUtilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongBao.this,TienIch.class);
                startActivity(doimanhinh);
            }
        });
        IbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongBao.this,TimKiemViecLam.class);
                startActivity(doimanhinh);
            }
        });
        IbtnInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongBao.this, ThongBao.class);
                startActivity(doimanhinh);
            }
        });
        IbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        ThongBao.this,
                        "Ứng dụng đang được phát triển.\n" + "Vui lòng trở lại sau.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });


        Firebase.setAndroidContext(this);
        Firebase root = new Firebase("https://deadline-thongbao.firebaseio.com/thongbao");
        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                txtTBNDung.setText(dataSnapshot.getValue().toString());

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }

}
