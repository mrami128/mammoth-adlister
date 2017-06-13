package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao() {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }
//TODO: this insert method gets /uses user input -so apply prepared statement

    @Override
    public Long insert(Ad ad) {
        try {
            String insert ="INSERT INTO ads(user_id, title,description)VALUES(?,?,?)";

            PreparedStatement stmt = connection.prepareStatement
                    (insert, Statement.RETURN_GENERATED_KEYS);

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }
    // BEN helped me with this test
    @Override
    public Ad getAdById(long id){
        String query = "Select * from ads where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            Ad ad = new Ad();

            if(rs.next()){
                ad.setId(rs.getLong("id"));
                ad.setTitle(rs.getString("title"));
                ad.setDescription(rs.getString("description"));
            }

            return ad;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    private String createInsertQuery() {
        return "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
    }

// this result -extractAd- set gets dbase info--changes format--no prepared stmnt need here

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
