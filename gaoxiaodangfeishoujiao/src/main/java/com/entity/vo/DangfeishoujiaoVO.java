package com.entity.vo;

import com.entity.DangfeishoujiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 党费收缴
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dangfeishoujiao")
public class DangfeishoujiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "dangfeishoujiao_name")
    private String dangfeishoujiaoName;


    /**
     * 党费文件
     */

    @TableField(value = "dangfeishoujiao_file")
    private String dangfeishoujiaoFile;


    /**
     * 缴费状态
     */

    @TableField(value = "dangfeishoujiao_types")
    private Integer dangfeishoujiaoTypes;


    /**
     * 缴纳金额
     */

    @TableField(value = "dangfeishoujiao_money")
    private Double dangfeishoujiaoMoney;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getDangfeishoujiaoName() {
        return dangfeishoujiaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setDangfeishoujiaoName(String dangfeishoujiaoName) {
        this.dangfeishoujiaoName = dangfeishoujiaoName;
    }
    /**
	 * 设置：党费文件
	 */
    public String getDangfeishoujiaoFile() {
        return dangfeishoujiaoFile;
    }


    /**
	 * 获取：党费文件
	 */

    public void setDangfeishoujiaoFile(String dangfeishoujiaoFile) {
        this.dangfeishoujiaoFile = dangfeishoujiaoFile;
    }
    /**
	 * 设置：缴费状态
	 */
    public Integer getDangfeishoujiaoTypes() {
        return dangfeishoujiaoTypes;
    }


    /**
	 * 获取：缴费状态
	 */

    public void setDangfeishoujiaoTypes(Integer dangfeishoujiaoTypes) {
        this.dangfeishoujiaoTypes = dangfeishoujiaoTypes;
    }
    /**
	 * 设置：缴纳金额
	 */
    public Double getDangfeishoujiaoMoney() {
        return dangfeishoujiaoMoney;
    }


    /**
	 * 获取：缴纳金额
	 */

    public void setDangfeishoujiaoMoney(Double dangfeishoujiaoMoney) {
        this.dangfeishoujiaoMoney = dangfeishoujiaoMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
