package com.radinfo.safe.mapper;

import com.radinfo.safe.domain.PolicyInput;

public interface PolicyInputMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PolicyInput record);

    int insertSelective(PolicyInput record);

    PolicyInput selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PolicyInput record);

    int updateByPrimaryKey(PolicyInput record);
}