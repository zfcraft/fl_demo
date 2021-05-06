package com.fulan.server.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.fulan.server.model.DemoEntity;

@Mapper
public interface DemoDao {

	/**
	 * 添加demo数据
	 * @param
	 * @return
	 */
	@Insert("insert into t_demo(name,sex,age)"
			+ " values(#{name},#{sex},#{age})")
	Integer addDemo(DemoEntity demoEntity);
	
	/**
	 * 查询demo表中List
	 * @param name
	 * @return
	 */
	@Select("select id,name,sex,age from t_demo where name=#{name}")
	List<DemoEntity> selecDemoListByName(@Param("name") String name);
}
