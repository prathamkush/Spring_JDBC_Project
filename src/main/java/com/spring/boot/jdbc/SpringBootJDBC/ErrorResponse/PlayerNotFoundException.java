package com.spring.boot.jdbc.SpringBootJDBC.ErrorResponse;

public class PlayerNotFoundException extends RuntimeException{

    public PlayerNotFoundException(){
        super();
    }


    public PlayerNotFoundException(String msg, Throwable cause, boolean enableSuppresion, boolean writableStackTrace){
        super(msg,cause,enableSuppresion,writableStackTrace);
    }

    public PlayerNotFoundException(String msg, Throwable cause){
        super(msg,cause);
    }

    public PlayerNotFoundException(String msg){
        super(msg);
    }

    public PlayerNotFoundException(Throwable cause){
        super(cause);
    }


}
