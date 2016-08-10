package com.dismas.imaya.mysqltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                insert();
            }
        }).start();
    }

    protected void insert() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/feedback";
            Connection c = DriverManager.getConnection(url, "imaya", "nyagaka2013");
            PreparedStatement st = c.prepareStatement("insert into feedback values (?,?,;?,?)");
            st.setString(1, "A001");
            st.setString(2, "imaya");
            st.setInt(3, 90);
            st.execute();
            st.close();
            c.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
