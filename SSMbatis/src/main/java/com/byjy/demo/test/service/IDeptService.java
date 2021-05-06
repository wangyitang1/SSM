package com.byjy.demo.test.service;

import com.byjy.demo.test.bean.Dept;

import java.util.List;

public interface IDeptService {
    List<Dept> getDept();
    Dept getByDeptId(Integer did);
}
