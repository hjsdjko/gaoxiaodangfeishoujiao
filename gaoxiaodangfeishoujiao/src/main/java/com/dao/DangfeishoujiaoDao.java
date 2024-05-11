package com.dao;

import com.entity.DangfeishoujiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DangfeishoujiaoView;

/**
 * 党费收缴 Dao 接口
 *
 * @author 
 */
public interface DangfeishoujiaoDao extends BaseMapper<DangfeishoujiaoEntity> {

   List<DangfeishoujiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
