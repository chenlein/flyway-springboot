package com.chenlei.flyway.db.mysql;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
public class V1_0_1__alter_user implements JdbcMigration {

//    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
//        jdbcTemplate.execute("alter table t_user add column email varchar(128)");
//    }

    @Override
    public void migrate(Connection connection) throws Exception {
        connection.createStatement().execute("alter table t_user add column email varchar(128)");
    }

}
