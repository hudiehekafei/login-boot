package demo.common;

import tk.mybatis.mapper.additional.dialect.oracle.InsertListMapper;
import tk.mybatis.mapper.additional.dialect.oracle.OracleMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CommonMapper<T> extends
        Mapper<T>,
        MySqlMapper<T>,
        OracleMapper<T>,
        ConditionMapper<T>,
        InsertListMapper<T> {
}
