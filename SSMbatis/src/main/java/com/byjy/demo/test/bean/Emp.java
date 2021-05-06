package com.byjy.demo.test.bean;

public class Emp {
    private Integer eid;
    private String ename;
    private Integer did;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer eid, String ename, Integer did) {
        this.eid = eid;
        this.ename = ename;
        this.did = did;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }
}
