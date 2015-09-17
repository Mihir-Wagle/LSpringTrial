package com.springapp.mvc.domain.implementation;

import com.springapp.mvc.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by waglem1 on 9/9/2015.
 */

@Repository
public class DatabaseRepository implements ProductRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getAllProducts() {
        return jdbcTemplate
                .query("select  * from Product where ID = ?",
                        new Object[] { 253 },
                        new ProductRowMapper());
    }
}
