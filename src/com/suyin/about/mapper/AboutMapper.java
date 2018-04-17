package com.suyin.about.mapper;

import java.util.List;
import java.util.Map;

public interface AboutMapper {
	/**
	 * 查询合作商家列表
	 * @param map
	 * @return
	 */
	public List<Map<String,Object>> findMemberByAll(Map<String,Object> map);
	/**
	 * 查询体验店列表
	 * @param map
	 * @return
	 */
	public List<Map<String,Object>> findStoreByAll(Map<String,Object> map);
}
