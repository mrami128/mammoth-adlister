package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads get AdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
    //TODO: finish this piece
    public static Users getUsersDao(){
        if(usersDao ==null) {
            usersDao =new MySQLUsersDao();
        }
        return usersDao;
    }
}
