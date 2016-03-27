package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class ThongTinTuyenDung extends AppCompatActivity {

    TextView Congty , Congty2,Congty3,Congty4;
    ImageButton IbtnHomepage,IbtnUtilies,IbtnSearch,IbtnInbox,IbtnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_tuyen_dung);
        IbtnHomepage = (ImageButton)findViewById(R.id.imageButtonHomepage);
        IbtnUtilies = (ImageButton)findViewById(R.id.imageButtonUlities);
        IbtnSearch = (ImageButton)findViewById(R.id.imageButtonSearch);
        IbtnInbox = (ImageButton)findViewById(R.id.imageButtonInbox);
        IbtnMenu = (ImageButton)findViewById(R.id.imageButtonMenu);
        IbtnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this,MainActivity.class);
                startActivity(doimanhinh);
            }
        });
        IbtnUtilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this,TienIch.class);
                startActivity(doimanhinh);
            }
        });
        IbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this,TimKiemViecLam.class);
                startActivity(doimanhinh);
            }
        });
        IbtnInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this,ThongBao.class);
                startActivity(doimanhinh);
            }
        });
        IbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        ThongTinTuyenDung.this,
                        "Ứng dụng đang được phát triển.\n"+"Vui lòng trở lại sau.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        final
        C_IdCty TNHHMayMac = new C_IdCty("Công ty TNHH May Mặc","TNHHMM00001","Bình Dương"," Bến Cát",5000000,"Công nhân may và thêu") ;
        C_IdCty CKDongNai = new C_IdCty("Công ty Cơ Khí Đồng Nai","CKDN00001","Đồng Nai","Trảng Bom",4500000,"Bộ phận Marketing");
        C_IdCty XKThuyHaiSan = new C_IdCty("Công ty xuất khẩu thủy , hải sản","XKTHS00001","Bình Dương","Dĩ An",12000000,"Thợ đánh cá ngoài biển");
        C_IdCty CSOngNuoc = new C_IdCty("Cơ sở sữa chữa ống nước tại gia.","CSSON00001","Bình Dương","Bến Cát",4000000,"Thợ sửa ống nước");



                Congty = (TextView)findViewById(R.id.textViewCongty00001);
        Congty.setText(TNHHMayMac.TenCty + "\nCần tuyển : "+TNHHMayMac.Bophan +"\nLương :"+TNHHMayMac.Luong +" đ/tháng"+ "\nĐịa Điểm: " + TNHHMayMac.DiadiemHuyen + " " + TNHHMayMac.DiadiemThanhpho + "\nChi tiết >>");
        Congty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this, ThongTinTuyenDung0001.class);
                startActivity(doimanhinh);

            }
        });

        Congty2 = (TextView)findViewById(R.id.textViewCongty00002);
        Congty2.setText(CKDongNai.TenCty + "\nCần tuyển : "+CKDongNai.Bophan +"\nLương :"+CKDongNai.Luong +" đ/tháng"+ "\nĐịa Điểm: " + CKDongNai.DiadiemHuyen + " " + CKDongNai.DiadiemThanhpho + "\nChi tiết >>");
        Congty2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this, ThongTinTuyenDung0002.class);
                startActivity(doimanhinh);

            }
        });
        Congty3 = (TextView)findViewById(R.id.textViewCongty00003);
        Congty3.setText(XKThuyHaiSan.TenCty + "\nCần tuyển : "+XKThuyHaiSan.Bophan +"\nLương :"+XKThuyHaiSan.Luong +" đ/tháng"+ "\nĐịa Điểm: " + XKThuyHaiSan.DiadiemHuyen + " " + XKThuyHaiSan.DiadiemThanhpho + "\nChi tiết >>");
        Congty3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this, ThongTinTuyenDung0003.class);
                startActivity(doimanhinh);

            }
        });
        Congty4 = (TextView)findViewById(R.id.textViewCongty00004);
        Congty4.setText(CSOngNuoc.TenCty + "\nCần tuyển : "+CSOngNuoc.Bophan +"\nLương :"+CSOngNuoc.Luong +" đ/tháng"+ "\nĐịa Điểm: " + CSOngNuoc.DiadiemHuyen + " " + CSOngNuoc.DiadiemThanhpho + "\nChi tiết >>");
        Congty4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(ThongTinTuyenDung.this, ThongTinTuyenDung0004.class);
                startActivity(doimanhinh);

            }
        });


    }

}
