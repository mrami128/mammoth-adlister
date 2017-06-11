// as of FRIDAY pm
//
  public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
  }


// latest version SATurday:
//
//  public class DaoFactory {
//     private static Ads adsDao;
//     private static Config config = new Config();
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new MySQLAdsDao(config);
//        }
//        return adsDao;
//    }
//}