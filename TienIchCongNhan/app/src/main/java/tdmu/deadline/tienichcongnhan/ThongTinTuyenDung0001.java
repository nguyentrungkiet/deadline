package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ThongTinTuyenDung0001 extends AppCompatActivity {

    ImageButton IbtnHomepage,IbtnUtilies,IbtnSearch,IbtnInbox,IbtnMenu;
    Button btnDKy;
    TextView txtThongbao,txtCongTy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_tuyen_dung0001);
        IbtnHomepage = (ImageButton)findViewById(R.id.imageButtonHomepage);
        IbtnUtilies = (ImageButton)findViewById(R.id.imageButtonUlities);
        IbtnSearch = (ImageButton)findViewById(R.id.imageButtonSearch);
        IbtnInbox = (ImageButton)findViewById(R.id.imageButtonInbox);
        IbtnMenu = (ImageButton)findViewById(R.id.imageButtonMenu);
        IbtnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0001.this,MainActivity.class);
                startActivity(doimanhinh);
            }
        });
        IbtnUtilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0001.this,TienIch.class);
                startActivity(doimanhinh);
            }
        });
        IbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0001.this,TimKiemViecLam.class);
                startActivity(doimanhinh);
            }
        });
        IbtnInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung0001.this, ThongBao.class);
                startActivity(doimanhinh);
            }
        });
        IbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        ThongTinTuyenDung0001.this,
                        "Ứng dụng đang được phát triển.\n" + "Vui lòng trở lại sau.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        btnDKy = (Button)findViewById(R.id.buttonDKy);
        final String IDCty = "TNHHMayMac00001";
        btnDKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manhinh = new Intent(ThongTinTuyenDung0001.this , DangKyPhongVan.class);
                manhinh.putExtra("idCty",IDCty);
                startActivity(manhinh);

            }
        });
        txtCongTy = (TextView)findViewById(R.id.textViewCongTy);
        txtThongbao = (TextView)findViewById(R.id.textViewThongbao);
        txtThongbao.setText("Cần tuyển :  500 công nhân , \n" +
                "Bao gồm:\n" +
                "-\t300 công nhân có tay nghề may . Lương cơ bản : 5.000.000đ/tháng\n" +
                "-\t100 công nhân chưa có tay nghề. Lương cơ bản : 3.900.000đ/tháng\n" +
                "-\t100 công nhân có kinh nghiệm trong lĩnh vực dệt bằng máy. Lương cơ bản : 5.900.000đ/tháng\n" +
                "Chưa kể tăng ca.\n" +
                "Liên hệ hỗ trợ.\n" +
                "--01655329270 – A Dũng.\n");
        txtCongTy.setText("CÔNG TY TNHH MAY MẶC");
    }


}
