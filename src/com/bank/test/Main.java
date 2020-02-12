package com.bank.test;

import com.bank.test.model.Message;
import com.bank.test.model.User;
import com.bank.test.utiling.BankingApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to banking application");
        Scanner scanner=new Scanner(System.in);

        User user=null;
        Random random=new Random();
        BankingApplication bankingApplication=new BankingApplication();



        while(true){
            System.out.println("1.Register");
            System.out.println("2.deposite fund");
            System.out.println("3.withdraw fund");
            System.out.println("enter your choice");
            int choice=scanner.nextInt();

            switch (choice){
                case 1:
                    user=new User();
                    System.out.println("enter your name");
                    String r=scanner.next();
                    System.out.println("enter address");
                    String ad=scanner.next();

                    user.setAccountNumber(random.nextLong());
                    user.setAccountName(r);
                    user.setAddress(ad);
                    user.setAmount(0);

                    Message message = bankingApplication.saveUserDetails(user);
                    if(message.isSucess()){
                        System.out.println("your details is successfully saved");
                    }else{
                        System.out.println(message.getErrorMessage());
                        System.out.println("error,Please");
                    }


                    System.out.println("your newely created account is ");
                    System.out.println("Name " +user.getAccountName());
                    System.out.println("Address "+ user.getAddress());
                    System.out.println("ammount "+user.getAmount());
                    System.out.println("account nuber " +user.getAccountNumber());

                    user.getAccountName();




                    break;
                case 2:
                    if(user!=null) {
                        System.out.println("deposite ammount");
                        double am = scanner.nextInt();
                        user.setAmount(am + user.getAmount());

                        System.out.println("your bank account is" + user.getAmount());
                    }
                    break;
                case 3:
                    break;
                default:
                    System.exit(0);
                    break;

            }


        }

    }
}
