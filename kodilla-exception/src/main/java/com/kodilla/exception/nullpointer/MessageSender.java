package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String message)throws MessageNotSentException{
        if(user !=null) {
            System.out.println("Sending meddage: " + message + "to: " + user.getName());
        }else{
            throw new MessageNotSentException("Object User was null");
        }
    }
}
