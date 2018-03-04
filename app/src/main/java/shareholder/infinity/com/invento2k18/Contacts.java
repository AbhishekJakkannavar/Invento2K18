package shareholder.infinity.com.invento2k18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Contacts extends AppCompatActivity {

    public TextView princi;
    public TextView princi1;
    public TextView princi2;
    public TextView princi3;
    public TextView princi4;
    public TextView princi5;
    public TextView princi6;
    public TextView princi7;
    public TextView princi8;
    public TextView princi9;
    public TextView princi10;
    public TextView princi11;
    public TextView princi12;
    public TextView princi13;
    public TextView princi14;
    public TextView princi15;
    public TextView princi16;
    public TextView princi17;
    public TextView princi18;
    public TextView princi19;
    public TextView princi20;
    public TextView princi21;
    public TextView princi22;
    public TextView princi23;
    public TextView princi24;
    public TextView princi25;



    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

//                    principal
        princi = (TextView) findViewById(R.id.princic);
        princi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:083142010818"));
                startActivity(intent);
            }
        });
        ///////////////////////////princi end////////////////////////


        //////////////////staff co-ordinators/////////////////////////
        princi1 = (TextView) findViewById(R.id.princi1);
        princi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9972008555"));
                startActivity(intent);
            }
        });princi2 = (TextView) findViewById(R.id.princi2);
        princi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8147903260"));
                startActivity(intent);
            }
        });princi3 = (TextView) findViewById(R.id.princi3);
        princi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9538645617"));
                startActivity(intent);
            }
        });princi4 = (TextView) findViewById(R.id.princi4);
        princi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8095255902"));
                startActivity(intent);
            }
        });

        princi5 = (TextView) findViewById(R.id.princi5);
        princi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8220583325"));
                startActivity(intent);
            }
        });

        princi6 = (TextView) findViewById(R.id.princi6);
        princi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8553504884"));
                startActivity(intent);
            }
        });princi7 = (TextView) findViewById(R.id.princi7);
        princi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9591364909"));
                startActivity(intent);
            }
        });princi8 = (TextView) findViewById(R.id.princi8);
        princi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9164316462"));
                startActivity(intent);
            }
        });princi9 = (TextView) findViewById(R.id.princi9);
        princi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8861994533"));
                startActivity(intent);
            }
        });princi10 = (TextView) findViewById(R.id.princi10);
        princi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9449200828"));
                startActivity(intent);
            }
        });princi11 = (TextView) findViewById(R.id.princi11);
        princi11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9986977472"));
                startActivity(intent);
            }
        })
        ////////////////////////staff end/////////////////////

        ;princi12 = (TextView) findViewById(R.id.rad);
        princi12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8446167817"));
                startActivity(intent);
            }
        });princi13 = (TextView) findViewById(R.id.adi);
        princi13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8792284567"));
                startActivity(intent);
            }
        });princi14 = (TextView) findViewById(R.id.sta);
        princi14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8792916403"));
                startActivity(intent);
            }
        });princi15 = (TextView) findViewById(R.id.aks);
        princi15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9844110863"));
                startActivity(intent);
            }
        });princi16 = (TextView) findViewById(R.id.ani);
        princi16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7204626372"));
                startActivity(intent);
            }
        });princi17 = (TextView) findViewById(R.id.ars);
        princi17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8088867101"));
                startActivity(intent);
            }
        });princi18 = (TextView) findViewById(R.id.abh);
        princi18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8971017845"));
                startActivity(intent);
            }
        });princi19 = (TextView) findViewById(R.id.aji);
        princi19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7204455932"));
                startActivity(intent);
            }
        });princi20 = (TextView) findViewById(R.id.ami);
        princi20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8792713898"));
                startActivity(intent);
            }
        });princi21 = (TextView) findViewById(R.id.mak);
        princi21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9986431788"));
                startActivity(intent);
            }
        });

        princi22 = (TextView) findViewById(R.id.pri);
        princi22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9916796030"));
                startActivity(intent);
            }
        });

        princi23 = (TextView) findViewById(R.id.sak);
        princi23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9620674303"));
                startActivity(intent);
            }
        });
        ///////////////student end//////////////////////////////

        //////Emergency/////////////////////////////////////////
        princi24 = (TextView) findViewById(R.id.sbk);
        princi24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9986788945"));
                startActivity(intent);
            }
        });

        princi25 = (TextView) findViewById(R.id.utta);
        princi25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9164316462"));
                startActivity(intent);
            }
        });
    }

    public void expandableButton1(View view) {
        expandableLayout1 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle(); // toggle expand and collapse
    }

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }
}
