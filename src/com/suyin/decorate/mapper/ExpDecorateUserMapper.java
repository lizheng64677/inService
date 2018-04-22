package com.suyin.decorate.mapper;


import java.util.List;
import java.util.Map;

import com.suyin.decorate.model.ExpDecorateUser;




public interface ExpDecorateUserMapper {
	
	/**
	 * 通过用户ID和openId查询用户信息
	 * @param userId
	 * @param openId
	 * @return
	 */
	public ExpDecorateUser findUserInfoByUserIdOrOpenId(Map<String,Object> params);


    /**
     * 新增信息
     */
    public Integer addExpDecorateUser(ExpDecorateUser entity);

    /**
     * 修改信息
     */
    public Integer updateExpDecorateUser(ExpDecorateUser entity);
    /**
     * 根据id删除单条信息
     * 
     */
    public Integer deleteExpDecorateUser(String id);
    /**
     * 批量删除
     */
    public Integer deleteExpDecorateUser(String[] id); 

    /**
     * 查询列表
     */
    public List<ExpDecorateUser> findExpDecorateUser(ExpDecorateUser entity);

    /**
     * 查询列表分页  
     */
    public List<ExpDecorateUser> findExpDecorateUserByPage(ExpDecorateUser entity);

}