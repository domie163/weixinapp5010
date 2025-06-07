package com.entity.model;

import com.entity.MeirixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 每日信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeirixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 信息标题
     */
    private String meirixinxiName;


    /**
     * 信息类型
     */
    private Integer meirixinxiTypes;


    /**
     * 信息图片
     */
    private String meirixinxiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 信息详情
     */
    private String meirixinxiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
