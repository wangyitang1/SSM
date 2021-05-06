package com.byjy.demo.test.mapper;

import com.byjy.demo.test.bean.Dept;

import java.util.List;

public interface IDeptMapper {
    List<Dept> getDept();

    Dept getByDeptId(Integer did);

}
