package com.byjy.demo.test.service.impl;

import com.byjy.demo.test.bean.Dept;
import com.byjy.demo.test.mapper.IDeptMapper;
import com.byjy.demo.test.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDeptServiceImpl implements IDeptService {
    @Autowired
    IDeptMapper iDeptMapper;

    public List<Dept> getDept() {
        return iDeptMapper.getDept();
    }

    @Override
    public Dept getByDeptId(Integer did) {
        return iDeptMapper.getByDeptId(did);
    }
}
