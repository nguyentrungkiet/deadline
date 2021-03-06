package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ThongTinTuyenDung0002 extends AppCompatActivity {

    ImageButton IbtnHomepage,IbtnUtilies,IbtnSearch,IbtnInbox,IbtnMenu;
    TextView txtCongTy,txtThongbao;
    Button btnDKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_tuyen_dung0002);

        IbtnHomepage = (ImageButton)findViewById(R.id.imageButtonHomepage);
        IbtnUtilies = (ImageButton)findViewById(R.id.imageButtonUlities);
        IbtnSearch = (ImageButton)findViewById(R.id.imageButtonSearch);
        IbtnInbox = (ImageButton)findViewById(R.id.imageButtonInbox);
        IbtnMenu = (ImageButton)findViewById(R.id.imageButtonMenu);
        IbtnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0002.this,MainActivity.class);
                startActivity(doimanhinh);
            }
        });
        IbtnUtilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0002.this,TienIch.class);
                startActivity(doimanhinh);
            }
        });
        IbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0002.this,TimKiemViecLam.class);
                startActivity(doimanhinh);
            }
        });
        IbtnInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0002.this, ThongBao.class);
                startActivity(doimanhinh);
            }
        });
        IbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        ThongTinTuyenDung0002.this,
                        "Ứng dụng đang được phát triển.\n" + "Vui lòng trở lại sau.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        btnDKy = (Button)findViewById(R.id.buttonDKy);
        final String IDCty = "CKDN00001";
        btnDKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manhinh = new Intent(ThongTinTuyenDung0002.this , DangKyPhongVan.class);
                manhinh.putExtra("idCty",IDCty);
                startActivity(manhinh);

            }
        });
        txtCongTy = (TextView)findViewById(R.id.textViewCongTy);
        txtThongbao = (TextView)findViewById(R.id.textViewThongbao);
        txtThongbao.setText("Cần tuyển :  3 nhân viên Marketing , \n" +
                "Bao gồm:\n" +
                "-\t3 nhân viên có trình độ về thuyết trình.\n" +
                "-\tYêu cầu có bằng cao đẳng hoặc đại học về Công Tác Xã Hội\n" +
                "Lương 4.500.000 đ/ tháng \n" +
                "Lương 4.500.000 đ/ tháng \n" +
                "Thời gian làm việc 7h -> 16h từ thứ 2 đến thứ 7 \n" +
                "--01656063669 – A Kiệt.\n");
        txtCongTy.setText("CÔNG TY CƠ KHÍ ĐỒNG NAI");

    }

}
