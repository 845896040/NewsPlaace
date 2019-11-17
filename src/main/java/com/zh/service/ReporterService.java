package com.zh.service;

import com.zh.pojo.Reporter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReporterService {
    List<Reporter> queryAllReporter();

    Reporter checkReporter(String idNumber, String password);

    boolean existsReporter(String idNumber);

    void signUpReporter(Reporter reporter);

    void deleteReporter(Integer id);

    void add(Reporter reporter);

    Reporter getRepById(Integer id);

    void updateRepById(Reporter reporter);

    List<String> getIdNumber(String idNumber);

    List<Reporter> queryRepByIdNumber(String idNumber);

    void deleteByIds(Integer[] ids);

    int login(String idNumber, String password);

    Reporter getRepByIdNum(String idNumber);

    int getRepNum();
}
