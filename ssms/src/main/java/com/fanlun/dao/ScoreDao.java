package com.fanlun.dao;

import com.fanlun.bean.Score;

import java.util.List;

public interface ScoreDao {

    //获取所有的成绩
    public List<Score> getListScore(Score score);

    public int scoreCount(Score score);

}
