package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 每日信息
 *
 * @author 
 * @email
 */
@TableName("meirixinxi")
public class MeirixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeirixinxiEntity() {

	}

	public MeirixinxiEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 信息标题
     */
    @ColumnInfo(comment="信息标题",type="varchar(200)")
    @TableField(value = "meirixinxi_name")

    private String meirixinxiName;


    /**
     * 信息类型
     */
    @ColumnInfo(comment="信息类型",type="int(11)")
    @TableField(value = "meirixinxi_types")

    private Integer meirixinxiTypes;


    /**
     * 信息图片
     */
    @ColumnInfo(comment="信息图片",type="varchar(200)")
    @TableField(value = "meirixinxi_photo")

    private String meirixinxiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 信息详情
     */
    @ColumnInfo(comment="信息详情",type="longtext")
    @TableField(value = "meirixinxi_content")

    private String meirixinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：信息标题
	 */
    public String getMeirixinxiName() {
        return meirixinxiName;
    }
    /**
	 * 设置：信息标题
	 */

    public void setMeirixinxiName(String meirixinxiName) {
        this.meirixinxiName = meirixinxiName;
    }
    /**
	 * 获取：信息类型
	 */
    public Integer getMeirixinxiTypes() {
        return meirixinxiTypes;
    }
    /**
	 * 设置：信息类型
	 */

    public void setMeirixinxiTypes(Integer meirixinxiTypes) {
        this.meirixinxiTypes = meirixinxiTypes;
    }
    /**
	 * 获取：信息图片
	 */
    public String getMeirixinxiPhoto() {
        return meirixinxiPhoto;
    }
    /**
	 * 设置：信息图片
	 */

    public void setMeirixinxiPhoto(String meirixinxiPhoto) {
        this.meirixinxiPhoto = meirixinxiPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：信息详情
	 */
    public String getMeirixinxiContent() {
        return meirixinxiContent;
    }
    /**
	 * 设置：信息详情
	 */

    public void setMeirixinxiContent(String meirixinxiContent) {
        this.meirixinxiContent = meirixinxiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Meirixinxi{" +
            ", id=" + id +
            ", meirixinxiName=" + meirixinxiName +
            ", meirixinxiTypes=" + meirixinxiTypes +
            ", meirixinxiPhoto=" + meirixinxiPhoto +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", meirixinxiContent=" + meirixinxiContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
