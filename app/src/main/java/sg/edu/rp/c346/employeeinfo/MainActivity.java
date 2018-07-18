package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewEmployee);

        alEmployeeList = new ArrayList<>();

        EmployeeInfo employee1 = new EmployeeInfo("John", "Software Technical Leader", 3400.0);
        EmployeeInfo employee2 = new EmployeeInfo("May", "Programmer", 2200.0);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee2);

        caEmployee = new CustomAdapter(this, R.layout.employee_row, alEmployeeList);

        lvEmployee.setAdapter(caEmployee);
    }
}
