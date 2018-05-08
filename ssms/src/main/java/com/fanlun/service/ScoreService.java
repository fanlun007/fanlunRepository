package com.fanlun.service;

import com.fanlun.bean.Score;
import com.fanlun.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreDao scoreDao;


    public List<Score> getListScore(Score score){
        return scoreDao.getListScore(score);
    }

    public int scoreCount(Score score){
        return scoreDao.scoreCount(score);
    }

}
