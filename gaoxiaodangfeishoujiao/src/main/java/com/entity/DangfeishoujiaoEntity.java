package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 党费收缴
 *
 * @author 
 * @email
 */
@TableName("dangfeishoujiao")
public class DangfeishoujiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DangfeishoujiaoEntity() {

	}

	public DangfeishoujiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Dangfeishoujiao{" +
            "id=" + id +
            ", dangfeishoujiaoName=" + dangfeishoujiaoName +
            ", dangfeishoujiaoFile=" + dangfeishoujiaoFile +
            ", dangfeishoujiaoTypes=" + dangfeishoujiaoTypes +
            ", dangfeishoujiaoMoney=" + dangfeishoujiaoMoney +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
