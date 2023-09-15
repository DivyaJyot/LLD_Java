package com.divya.design.pattern.singleton;

public class DBConnection {

    private final String url;
    private final String userName;

    private final String password;

    private static DBConnection dbc;

    private DBConnection( String url, String password,String userName){
      this.url=url;
      this.userName=userName;
      this.password=password;
    }

    public static DBConnection getInstance(String url, String password,String userName){
        if(dbc==null)
            synchronized (DBConnection.class)
        {
            if(dbc==null)
                dbc= new DBConnection(url,password,userName) ;
        }
        return dbc;
    }
    public void executeQuery(){
        System.out.println("query executed"+url+userName+password);
         }
}
