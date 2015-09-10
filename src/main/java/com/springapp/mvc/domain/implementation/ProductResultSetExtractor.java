package com.springapp.mvc.domain.implementation;

/**
 * Created by waglem1 on 9/9/2015.
 */
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductResultSetExtractor implements ResultSetExtractor {

    @Override
    public Product extractData(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setUnitPrice(rs.getFloat(1));
        product.setName(rs.getString(2));
        return product;
    }

}