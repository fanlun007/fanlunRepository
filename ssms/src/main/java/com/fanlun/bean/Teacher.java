package com.fanlun.bean;

/**
 * Author:     反轮
 * Created in: 2017/12/4 15:03
 * Description:
 */
public class Teacher {
    private int tno;
    private String name;
    private Integer subject;

    public Teacher() {
    }

    public Teacher(int tno) {
        this.tno = tno;
    }

    public Teacher(int tno, String name, Integer subject) {
        this.tno = tno;
        this.name = name;
        this.subject = subject;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }

}
