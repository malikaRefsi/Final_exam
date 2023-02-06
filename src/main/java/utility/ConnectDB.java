package utility;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectDB {
    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    public static Connection connectToSqlDatabase() {

//        String driverClass = Utility.getProperties().getProperty("MYSQLJDBC.driver.mr");
//        String url = Utility.getProperties().getProperty("MYSQLJDBC.url.mr");
//        String userName = Utility.getProperties().getProperty("MYSQLJDBC.userName.mr");
//        String password = Utility.getProperties().getProperty("MYSQLJDBC.password.mr");
//        String driverClass = Utility.getProperties().getProperty("MYSQLJDBC.driver.nop");
//        String url = Utility.getProperties().getProperty("MYSQLJDBC.url.nop");
//        String userName = Utility.getProperties().getProperty("MYSQLJDBC.userName.nop");
//        String password = Utility.getProperties().getProperty("MYSQLJDBC.password.nop");
        String driverClass = Utility.getProperties().getProperty("MYSQLJDBC.driver");
        String url = Utility.getProperties().getProperty("MYSQLJDBC.url");
        String userName = Utility.getProperties().getProperty("MYSQLJDBC.userName");
        String password = Utility.getProperties().getProperty("MYSQLJDBC.password");



        try {
            Class.forName(driverClass);
            connect = DriverManager.getConnection(url,userName,password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Database is connected");
        return connect;
    }

//    public static MongoDatabase mongoDatabase = null;
//
//    public MongoDatabase connectToMongoDB() {
//        MongoClient mongoClient = new MongoClient("" , 27017);
//        mongoDatabase = mongoClient.getDatabase("");
//        System.out.println("Database Connected");
//
//        return mongoDatabase;
//    }

    public static List<String> getTableColumnData(String query, String columnName) {
        List<String> list = new ArrayList<>();
        try {
            statement = connectToSqlDatabase().createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                list.add(resultSet.getString(columnName));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) throws SQLException {
        // the following: in case we want to retrieve an email
        List<String> emails = getTableColumnData("select * from cred;","email");
        System.out.println(emails.get(0));
    }
}







//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.mysql.cj.x.protobuf.MysqlxDatatypes;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ConnectDB {
//    public static Connection connect = null;
//    public static Statement statement = null;
//    public static PreparedStatement ps = null;
//    public static ResultSet resultSet = null;
//
//    public static Connection connectToSqlDatabase() {
//        String driverClass = Utility.getProperties().getProperty("MYSQLJDBC.driver.mr");
//        String url = Utility.getProperties().getProperty("MYSQLJDBC.url.mr");
//        String userName = Utility.getProperties().getProperty("MYSQLJDBC.userName.mr");
//        String password = Utility.getProperties().getProperty("MYSQLJDBC.password.mr");
//
//        try {
//            Class.forName(driverClass);
//            connect = DriverManager.getConnection(url,userName,password);
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Database is connected");
//        return connect;
//    }
//
//    public static MongoDatabase mongoDatabase = null;
//
//    public MongoDatabase connectToMongoDB() {
//        MongoClient mongoClient = new MongoClient("" , 27017);
//        mongoDatabase = mongoClient.getDatabase("");
//        System.out.println("Database Connected");
//
//        return mongoDatabase;
//    }
//
//    public static List<String> getTableColumnData(String query, String columnName) {
//        List<String> list = new ArrayList<>();
//        try {
//            statement = connectToSqlDatabase().createStatement();
//            resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                list.add(resultSet.getString(columnName));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return list;
//    }
//
//    public static void main(String[] args) throws SQLException {
//        // the following: in case we want to retrieve an email
//        List<String> emails = getTableColumnData("select * from credentials;","email");
//        System.out.println(emails.get(0));
//    }
//}

