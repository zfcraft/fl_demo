package com.fulan.server.dao;

import com.fulan.server.model.Insure;
import com.fulan.server.model.InsureVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface InsureMapper {
    int addInsure(Insure insure);

    @Select(" select count(*) from insure where vehicleNum = #{vehicleNum}")
    int findInsureByvehicleNumCount(Insure insure);

    @Update("update insure set vehicleNum=#{vehicleNum},userName=#{userName},certType=#{certType},certId=#{certId},phoneNum=#{phoneNum},address=#{address},email=#{email} where vehicleNum=#{vehicleNum}")
    int updateInsureByvehicleNum(Insure insure);

    List<InsureVo> selectALlInsureInfo();
    @Delete("delete from insure where vehicleNum = #{vehicleNum}")
    int deleteInsureByVehicleNum(Insure insure);
}
