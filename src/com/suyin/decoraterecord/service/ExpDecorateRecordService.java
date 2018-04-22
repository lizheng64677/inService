package com.suyin.decoraterecord.service;

import java.util.List;

import java.util.*;
import com.suyin.decoraterecord.model.*;
import com.suyin.decoraterecord.service.*;




public interface ExpDecorateRecordService{

    /**
     * 新增信息
     * @param entity
     * @return
     */
    public Integer addExpDecorateRecord(ExpDecorateRecord entity);

    /**
     * 修改信息
     * @param entity
     * @return
     */
    public Integer updateExpDecorateRecord(ExpDecorateRecord entity);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public Integer deleteExpDecorateRecord(String id);

    /**
     * 查找信息列表
     * @param entity
     * @return
     */
    public List<ExpDecorateRecord> findExpDecorateRecord(ExpDecorateRecord entity);

    /**
     * 查找信息列表(分页)
     * @param entity
     * @return
     */
    public List<ExpDecorateRecord> findExpDecorateRecordByPage(ExpDecorateRecord entity);

    /**
     * 根据id查询对应的信息
     * @param entity
     * @return
     */
    public ExpDecorateRecord findExpDecorateRecordById(ExpDecorateRecord entity);
}