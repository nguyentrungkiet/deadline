package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;


public class DangKyPhongVan extends AppCompatActivity {

    ImageButton IbtnHomepage,IbtnUtilies,IbtnSearch,IbtnInbox,IbtnMenu;
    EditText edtMSDNghiep,edtMNGThieu,edtHVTen,edtNTNSinh, edtNSinh, edtQTich, edtDCTTru, edtDCLHe, edtSDThoai, edtEMail, edtTTHNhan, edtSKhoe, edtCNNMBBiet, edtKNTHoc, edtCBCap, edtNGThieu, edtMLMMuon, edtGchu;
    Button btnGui,btnXoa;
    TextView txtMSDNgiep;
    CheckBox CKet;
    String success="Đã gửi";
    String ERROR="Bạn cần đồng ý với những điều khoản dịch vụ của chúng tôi.";
    String HVTen="",NTNSinh="",NSinh="",QTich="",DCTTru="",DCLhe="",SDThoai="",EMail="",TTHNhan="",SKhoe="",CNNMBBiet="",KNTHoc="",CBCap="",NGThieu="",MLMMMuon="",GChu="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_phong_van);
        IbtnHomepage = (ImageButton)findViewById(R.id.imageButtonHomepage);
        IbtnUtilies = (ImageButton)findViewById(R.id.imageButtonUlities);
        IbtnSearch = (ImageButton)findViewById(R.id.imageButtonSearch);
        IbtnInbox = (ImageButton)findViewById(R.id.imageButtonInbox);
        IbtnMenu = (ImageButton)findViewById(R.id.imageButtonMenu);
        edtHVTen =(EditText)findViewById(R.id.editTextHVTen);
        btnGui = (Button)findViewById(R.id.buttonGui);
        edtNTNSinh=(EditText)findViewById(R.id.editTextNTNSinh);
        edtNSinh=(EditText)findViewById(R.id.editTextNSinh);
        edtDCTTru=(EditText)findViewById(R.id.editTextDCTTru);
        edtDCLHe=(EditText)findViewById(R.id.editTextDCLHe);
        edtSDThoai=(EditText)findViewById(R.id.editTextSDThoai);
        edtEMail=(EditText)findViewById(R.id.editTextEmail);
        edtTTHNhan=(EditText)findViewById(R.id.editTextTTHNhan);
        edtSKhoe=(EditText)findViewById(R.id.editTextSKoe);
        edtCNNMBBiet=(EditText)findViewById(R.id.editTextCNNMBBiet);
        edtKNTHoc=(EditText)findViewById(R.id.editTextKNTHoc);
        edtCBCap=(EditText)findViewById(R.id.editTextCBCap);
        edtNGThieu=(EditText)findViewById(R.id.editTextNGThieu);
        edtMLMMuon=(EditText)findViewById(R.id.editTextMLMMuon);
        edtGchu=(EditText)findViewById(R.id.editTextGChu);
        edtMNGThieu = (EditText)findViewById(R.id.editTextMNGThieu);
        edtMSDNghiep =(EditText)findViewById(R.id.editTextMSDNghiep);
        btnGui =(Button)findViewById(R.id.buttonGui);
        IbtnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(DangKyPhongVan.this,MainActivity.class);
                startActivity(doimanhinh);
            }
        });
        IbtnUtilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(DangKyPhongVan.this,TienIch.class);
                startActivity(doimanhinh);
            }
        });
        IbtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(DangKyPhongVan.this, TimKiemViecLam.class);
                startActivity(doimanhinh);
            }
        });
        IbtnInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doimanhinh = new Intent(DangKyPhongVan.this, ThongBao.class);
                startActivity(doimanhinh);
            }
        });
        IbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        DangKyPhongVan.this,
                        "Ứng dụng đang được phát triển.\n" + "Vui lòng trở lại sau.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        Firebase.setAndroidContext(this);
        // Nhap ho va ten.
        final Firebase root_1 = new Firebase("https://deadline-xinviec.firebaseio.com/HovaTen");
        final Firebase root_2 = new Firebase("https://deadline-xinviec.firebaseio.com/NTNS");
        final Firebase root_3 = new Firebase("https://deadline-xinviec.firebaseio.com/Cacbangcap");
        final Firebase root_4 = new Firebase("https://deadline-xinviec.firebaseio.com/Dchilienhe");
        final Firebase root_5 = new Firebase("https://deadline-xinviec.firebaseio.com/Email");
        final  Firebase root_6 = new Firebase("https://deadline-xinviec.firebaseio.com/Ghichu");
        final Firebase root_7 = new Firebase("https://deadline-xinviec.firebaseio.com/Khanangtinhoc");
        final  Firebase root_8 = new Firebase("https://deadline-xinviec.firebaseio.com/Macongnhangioithieu");
        final  Firebase root_9 = new Firebase("https://deadline-xinviec.firebaseio.com/Mucluongmongmuon");
        final  Firebase root_10 = new Firebase("https://deadline-xinviec.firebaseio.com/Ngonngu");
        final  Firebase root_11 = new Firebase("https://deadline-xinviec.firebaseio.com/Nguoigioithieu");
        final  Firebase root_12 = new Firebase("https://deadline-xinviec.firebaseio.com/Noisinh");
        final  Firebase root_13 = new Firebase("https://deadline-xinviec.firebaseio.com/Sodienthoai");
        final  Firebase root_14 = new Firebase("https://deadline-xinviec.firebaseio.com/Suckhoe");
        final  Firebase root_15 = new Firebase("https://deadline-xinviec.firebaseio.com/Tinhtranghonnhan");
        final  Firebase root_16 = new Firebase("https://deadline-xinviec.firebaseio.com/Dchithuongtru");
        final  Firebase root_17 = new Firebase("https://deadline-xinviec.firebaseio.com/Masodoanhnghiep");

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root_1.setValue(edtHVTen.getText().toString());
                root_2.setValue(edtNTNSinh.getText().toString());
                root_3.setValue(edtCBCap.getText().toString());
                root_4.setValue(edtDCLHe.getText().toString());
                root_5.setValue(edtEMail.getText().toString());
                root_6.setValue(edtGchu.getText().toString());
                root_7.setValue(edtKNTHoc.getText().toString());
                root_8.setValue(edtMNGThieu.getText().toString());
                root_9.setValue(edtMLMMuon.getText().toString());
                root_10.setValue(edtCNNMBBiet.getText().toString());
                root_11.setValue(edtNGThieu.getText().toString());
                root_12.setValue(edtNSinh.getText().toString());
                root_13.setValue(edtSDThoai.getText().toString());
                root_14.setValue(edtSKhoe.getText().toString());
                root_15.setValue(edtTTHNhan.getText().toString());
                root_16.setValue(edtDCTTru.getText().toString());
                root_17.setValue(edtMSDNghiep.getText().toString());

            }

        });

        btnXoa = (Button)findViewById(R.id.buttonXoa);
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtGchu.setText("");
                edtMLMMuon.setText("");
                edtNGThieu.setText("");
                edtCBCap.setText("");
                edtKNTHoc.setText("");
                edtCNNMBBiet.setText("");
                edtCNNMBBiet.setText("");
                edtSKhoe.setText("");
                edtTTHNhan.setText("");
                edtEMail.setText("");
                edtSDThoai.setText("");
                edtDCLHe.setText("");
                edtDCTTru.setText("");
                edtNSinh.setText("");
                edtNTNSinh.setText("");
                edtHVTen.setText("");
                edtMNGThieu.setText("");
                edtMSDNghiep.setText("");
            }
        });
        txtMSDNgiep = (TextView)findViewById(R.id.textViewidDNghiep);
      //  String s;
        Bundle bd = getIntent().getExtras();
        if(bd != null)
        {
           String s  = bd.getString("idCty");
            edtMSDNghiep.setText( s );
            edtMSDNghiep.setEnabled(false);
        }


    }



}
