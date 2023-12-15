package org.example;

import dao.ControlDAO;
import dao.LogDAO;
import dao.datawarehouse.LotteryDAOWareHouse;
import dao.staging.LotteryResultDAOStaging;
import entity.Date_dim;
import entity.Lottery_Result;
import entity.Province_Dim;
import entity.Reward_dim;

public class Main {
    public static void main(String[] args) {

        LogDAO logDAO = new LogDAO();
        ControlDAO controlDAO = new ControlDAO();
        LotteryDAOWareHouse lotteryWh = new LotteryDAOWareHouse();
        LotteryResultDAOStaging lotteryMart = new LotteryResultDAOStaging();


    }
}