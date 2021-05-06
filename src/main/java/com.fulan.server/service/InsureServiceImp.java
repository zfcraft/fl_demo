package com.fulan.server.service;

import com.fulan.server.dao.DemoDao;
import com.fulan.server.dao.InsureMapper;
import com.fulan.server.model.DemoEntity;
import com.fulan.server.model.Insure;
import com.fulan.server.model.InsureVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo服务层实现
 *
 * @author foodoo
 */
@Service
public class InsureServiceImp {

    @Resource
    private InsureMapper insureMapper;


    public int addInsure(Insure insure) {
        return insureMapper.addInsure(insure);
    }

    public int findInsureByvehicleNumCount(Insure insure) {
        return insureMapper.findInsureByvehicleNumCount(insure);
    }

    public int updateInsureByvehicleNum(Insure insure) {
        return insureMapper.updateInsureByvehicleNum(insure);
    }

    public PageInfo<InsureVo> selectALlInsureInfo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<InsureVo> pageList = insureMapper.selectALlInsureInfo();
        PageInfo<InsureVo> pageInfo = new PageInfo(pageList);

        return pageInfo;
    }

    public int deleteInsureByVehicleNum(Insure insure) {
        return insureMapper.deleteInsureByVehicleNum(insure);
    }
}