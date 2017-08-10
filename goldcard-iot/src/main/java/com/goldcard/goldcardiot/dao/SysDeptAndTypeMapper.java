package com.goldcard.goldcardiot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.goldcard.goldcardiot.models.SysDeptAndType;
import com.goldcard.goldcardiot.models.SysDeptAndTypeExample;

public interface SysDeptAndTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int countByExample(SysDeptAndTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int deleteByExample(SysDeptAndTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int insert(SysDeptAndType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int insertSelective(SysDeptAndType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	List<SysDeptAndType> selectByExample(SysDeptAndTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	SysDeptAndType selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SysDeptAndType record,
			@Param("example") SysDeptAndTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByExample(@Param("record") SysDeptAndType record, @Param("example") SysDeptAndTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByPrimaryKeySelective(SysDeptAndType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dept_and_type
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByPrimaryKey(SysDeptAndType record);
	/**
	 * 心一：删除部门与类型的关系数据
	 * @param paramMap
	 * @return
	 */
	int deleteByCondition(Map<String,Object> paramMap);
}