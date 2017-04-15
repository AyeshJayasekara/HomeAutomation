package com.example.ayeshjayasekara1.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.pubnub.api.*;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;

import org.json.*;
import org.json.JSONObject;
import java.util.Arrays;
//import com.pubnub.*;




public class Landing extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        //PNConfiguration pnConfiguration = new PNConfiguration();
        //pnConfiguration.setSubscribeKey("sub-c-764a7b9e-16a3-11e7-bb8a-0619f8945a4f");
        //pnConfiguration.setPublishKey("pub-c-784c01b6-34fa-46e2-aba7-5eebb8efac0e");
       // pnConfiguration.setSecure(false);
        final HomeController Control = new HomeController("pub-c-784c01b6-34fa-46e2-aba7-5eebb8efac0e","sub-c-764a7b9e-16a3-11e7-bb8a-0619f8945a4f","kozi",24);


        //final PubNub pubnub = new PubNub(pnConfiguration);

        Button btnSum =(Button)findViewById(R.id.button);
        Button ONButton =(Button)findViewById(R.id.ON);
        Button Con =(Button)findViewById(R.id.Conn);
        Button T =(Button)findViewById(R.id.Test);
        Button OFFButton =(Button)findViewById(R.id.OFF);
        final TextView txt = (TextView)findViewById(R.id.text100);
        final EditText txtBox = (EditText)findViewById(R.id.editText);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int s1=Integer.parseInt(edt1.getText().toString());
                //int s2=Integer.parseInt(edt2.getText().toString());

                //int s3= s1 + s2;

                //Toast.makeText(getApplicationContext(),String.valueOf("33"),Toast.LENGTH_LONG).show();
                txt.setText("Heloo Machan!!!!");
                JSONObject jsonObject = null;
                //setContentView(R.layout.activity_landing);
                //String str = "{\"Value\":[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]}";
                //String str = "{\"Value\":[\"1\""+ txtBox.getText().toString()+"]}";
                //String str = "\"Value\":[\""+txtBox.getText().toString()+"\"]\r";
                //[["\"Value\":\"Name"],"14921347497386015"]
//[["\"Value\":\"Name"],"14921347497386015"]
               // JSONArray arr = new JSONArray();
                String str = "Value:["+txtBox.getText().toString()+"]\r";
                try {
                    jsonObject = new JSONObject();
                    jsonObject.put("Value",txtBox.getText().toString());
                    //arr.put(0,txtBox.getText().toString());

                }
                catch(JSONException e){
                    System.out.println(e.toString());
                }
                System.out.println(jsonObject);


                //pubnub.publish()
                        //.message(jsonObject.toString().substring(1,jsonObject.toString().length()-2))
                      //  .message(txtBox.getText().toString())
                      //  .channel("kozi")
                      //  .async(new PNCallback<PNPublishResult>() {
                         //   @Override
                        //    public void onResponse(PNPublishResult result, PNStatus status) {
                                // handle publish result, status always present, result if successful
                                // status.isError to see if error happened
                           // }
                        //});

            }
        });



        ONButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int s1=Integer.parseInt(edt1.getText().toString());
                //int s2=Integer.parseInt(edt2.getText().toString());

                //int s3= s1 + s2;

                Toast.makeText(getApplicationContext(),String.valueOf("Light is ON"),Toast.LENGTH_LONG).show();
                txt.setText("ON!!!!");






               // pubnub.publish()
                       // .message("000000000000000")
                       // .channel("kozi")
                        //.async(new PNCallback<PNPublishResult>() {
                        //    @Override
                       //     public void onResponse(PNPublishResult result, PNStatus status) {
                                // handle publish result, status always present, result if successful
                                // status.isError to see if error happened
                      //      }
                     //   });
            }
        });

        OFFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(),String.valueOf("Light is OFF"),Toast.LENGTH_LONG).show();
                txt.setText("OFF!!!!");






               // pubnub.publish()
                     //   .message("11111111111111")
                    //    .channel("kozi")
                   //     .async(new PNCallback<PNPublishResult>() {
                         //   @Override
                      //      public void onResponse(PNPublishResult result, PNStatus status) {
                   //             // handle publish result, status always present, result if successful
                                // status.isError to see if error happened
                       //     }
                   //    });
            }
        });

        Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    Control.setAllOn();
            }
        });

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Control.setAllOff();
            }
        });





    }



}
