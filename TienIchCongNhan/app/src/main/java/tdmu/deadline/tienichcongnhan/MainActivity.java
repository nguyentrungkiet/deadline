package tdmu.deadline.tienichcongnhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTTTDung,btnDKPVan,btnKBNViec,btnTKVLam,btnTIch,btnTBao,btnThoat;
    TextView txtThongtin,txtLienhe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTTTDung = (Button)findViewById(R.id.buttonTTTDung);
        btnDKPVan =(Button)findViewById(R.id.buttonDKPVan);
        btnKBNViec =(Button)findViewById(R.id.buttonKBNViec);
        btnTKVLam =(Button)findViewById(R.id.buttonTKVL);
        btnTIch =(Button)findViewById(R.id.buttonTIch);
        btnTBao =(Button)findViewById(R.id.buttonTBao);
        btnThoat = (Button)findViewById(R.id.buttonThoat);
        txtThongtin = (TextView)findViewById(R.id.textViewThongtin);
        txtLienhe = (TextView)findViewById(R.id.textViewLienhe);

        btnTTTDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhTTTDung = new Intent(MainActivity.this , ThongTinTuyenDung.class);
                startActivity(mhTTTDung);
            }
        });
        btnDKPVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhDKPVan = new Intent(MainActivity.this , DangKyPhongVan.class);
                startActivity(mhDKPVan);
            }
        });
        btnTKVLam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhTKVLam = new Intent(MainActivity.this , TimKiemViecLam.class);
                startActivity(mhTKVLam);
            }
        });
        btnKBNViec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhKBNViec = new Intent(MainActivity.this, KhaiBaoNghiViec.class);
                startActivity(mhKBNViec);
            }
        });
        btnTIch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhTIch = new Intent(MainActivity.this , TienIch.class);
                startActivity(mhTIch);
            }
        });
        btnTBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhTBao = new Intent(MainActivity.this , ThongBao.class);
                startActivity(mhTBao);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
            }
        });
        txtLienhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = "\n" +
                        "---- Thu Dau Mot Univercity ----\n" +
                        "\n" +
                        "- Website: fit.tdmu.edu.vn\n" +
                        "- Email maker:\n" +
                        "+ nguyentrungkiet1993@gmail.com\n" +
                        "+ dungtrinh2701@gmail.com\n" +
                        "+ tranthanhquang0712@gmail.com";
                Toast.makeText(
                        MainActivity.this,
                        n,
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        txtThongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = "\n" +
                        "-Phát hành bởi:\n" +
                        " DeadLine - Đại học Thủ Dầu Một.\n" +
                        "-Lập Trình Viên:\n" +
                        "+ Nguyễn Trung Kiệt,\n" +
                        "+ Trịnh Văn Dũng,\n" +
                        "+ Trần Thanh Quang.";
                Toast.makeText(
                        MainActivity.this,
                        n,
                        Toast.LENGTH_LONG

                ).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
