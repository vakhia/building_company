package Interfaces;

import java.sql.Date;

public interface IBuilder extends IEmployee {
    String Build();
    String Rest(Date date);
    String Сarry(String position, String materials);
    int ReceiveSalary();

}
