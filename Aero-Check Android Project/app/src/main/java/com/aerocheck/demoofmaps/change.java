package com.aerocheck.demoofmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class change extends AppCompatActivity {

    ListView listView;
    //String anystring="hi";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);


        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"NSIT Dwarka-Delhi", "Shadipur-Delhi", "IHBAS-Delhi", "Mandir Mark-DPCC-Delhi", "AnandVihar¬-DPCC-Delhi","R.K.Puram-DPCC-Delhi","Punjabi Bagh-DPCC-Delhi","ITO-Delhi","DTU-Delhi","Sirifort-Delhi",
                "Civil Lines,Nagpur","More chowk,waluj,Aurangabad","Bandra West,Mumbai","K.T.H.M. College,Nashik","Karve Road,Pune","Pimpleshwar Mandir,Dombivli,Thane","Airoli,NaviMumbai","Chandrapur","Solapur",
                "GVMC,RamNagar,Visakhapatnam","Tirumala,Tirupati","IGSC Planetarium Complex,Patna","Muzaffarpur Collectorate","Gaya Collectorate","Maninagar,Ahmedabad","Sector16A,Faridabad","Sector6,Faridabad",
                "VikasSadan,Gurgaon","MD University,Rohtak","BTM layout,Bengaluru","Peenya,Bengaluru","BWSSB Kadabesanahalli","City Railway Station-KSPCB","SaneguruvaHalli-KSPCB","VK Industrial Area,Jaipur","Collectorate,Jodhpur",
                "Alandar Bus Depot","IIT","Manali","Sanathnagar,Hyderabad","Zoo Park,BahadurpuraWest,Hyderabad","IDA Pashamylaram-TSPCB,Hyderabad","Bollaram Industrial Area,Hyderabad","ICRISAT Patancheru,Hyderabad","Sanjay Palace,Agra","Nehru Nagar,Kanpur",
                "Lalbagh,WestLucknow","Central School,Lucknow","TalkatoraDistrict Industries Center","ArdhaliBazar,Varanasi","Victoria,Kolkata","RabindraBharatiUniversity,Kolkata","Howrah","Haldia","SindhuKanhu Indoor Stadium,Durgapur"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bn = new Bundle();
                Intent newActivity = new Intent(change.this, Graph.class);
                int itemPosition     = position;
                String  itemValue    = (String) listView.getItemAtPosition(position);
                switch (itemPosition) {

                       case 0:
                           bn.putString("myname",itemValue);
                           newActivity.putExtras(bn);
                           startActivity(newActivity);
                           break;
                    case 1:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 2:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 3:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 4:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 5:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 6:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 7:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 8:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 9:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 10:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 11:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 12:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 13:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 14:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 15:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 16:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 17:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 18:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 19:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 20:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 21:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 22:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 23:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 24:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 25:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 26:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 27:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 28:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 29:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 30:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 31:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 32:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 33:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 34:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 35:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 36:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 37:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 38:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 39:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 40:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 41:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 42:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 43:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 44:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 45:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 46:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 47:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 48:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 49:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 50:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 51:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 52:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 53:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 54:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                    case 55:
                        bn.putString("myname",itemValue);
                        newActivity.putExtras(bn);
                        startActivity(newActivity);
                        break;
                }
            }
        });
    }
}
