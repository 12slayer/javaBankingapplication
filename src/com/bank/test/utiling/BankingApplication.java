package com.bank.test.utiling;

import com.bank.test.model.Message;
import com.bank.test.model.User;

import java.io.FileWriter;
import java.io.IOException;

public class BankingApplication {
    public Message saveUserDetails(User user){
            Message message=new Message();
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\susha\\IdeaProjects\\BankingApplication\\src\\com\\bank\\test"+user.getAccountNumber());
            fileWriter.write("Account="+user.getAccountNumber()+System.lineSeparator());
            fileWriter.write("name="+user.getAccountName()+System.lineSeparator());
            fileWriter.write("Address="+user.getAddress()+System.lineSeparator());
            fileWriter.write("balance="+user.getAmount()+System.lineSeparator());


            fileWriter.close();
            message.setSucess(true);
            message.setErrorMessage(null);

        } catch (IOException e) {
            e.printStackTrace();
            message.setSucess(false);
            message.setErrorMessage(null);

        }
        return message;
    }

    public void getUserDetails(Long accNo){
        //open file related
        //readfile
        //parse the line
        //set the value to the user object



    }
}
