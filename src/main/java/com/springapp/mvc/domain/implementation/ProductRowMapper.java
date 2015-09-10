package com.springapp.mvc.domain.implementation;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int line) throws SQLException {
        ProductResultSetExtractor extractor = new ProductResultSetExtractor();
        return extractor.extractData(rs);
    }

}