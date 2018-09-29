package model;

public class Authentication
{
    static String def_pwd="test12345";
    public static boolean authenticate(String pwd)
    {
        if (def_pwd == pwd){
            return true;
        }
        return false;
    }
}