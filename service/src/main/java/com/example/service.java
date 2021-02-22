package com.example;

import com.example.dao.DataConnector;
import com.example.entity.Pojo;

/**
 * @author akshay on 18/02/21
 */
public class service {
    public static void main(String[] args) {
        DataConnector da = new DataConnector();
        da.getData();
        Pojo pojo=new Pojo();
    }
}
