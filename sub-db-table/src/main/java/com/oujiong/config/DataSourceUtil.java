//package com.oujiong.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//import javax.sql.DataSource;
//
///**
// * @Description: 数据源配置
// *
// * @author xub
// * @date 2019/10/16 下午7:47
// */
//public final class DataSourceUtil {
//
//    private static final String HOST = "localhost";
//
//    private static final int PORT = 3306;
//
//    private static final String USER_NAME = "root";
//
//    private static final String PASSWORD = "123456";
//
//    public static DataSource createDataSource(final String dataSourceName) {
//        DruidDataSource result = new DruidDataSource();
//        result.setDriverClassName("com.mysql.jdbc.Driver");
//        result.setUrl(String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC&characterEncoding=utf-8&useSSL=false&useUnicode=true&allowMultiQueries=true&autoReconnect=true", HOST, PORT, dataSourceName));
//        result.setUsername(USER_NAME);
//        result.setPassword(PASSWORD);
//        return result;
//    }
//}
