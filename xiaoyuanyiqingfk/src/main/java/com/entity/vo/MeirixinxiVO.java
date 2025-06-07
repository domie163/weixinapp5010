package com.entity.vo;

import com.entity.MeirixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 每日信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meirixinxi")
public class MeirixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 信息标题
     */

    @TableField(value = "meirixinxi_name")
    private String meirixinxiName;


    /**
     * 信息类型
     */

    @TableField(value = "meirixinxi_types")
    private Integer meirixinxiTypes;


    /**
     * 信息图片
     */

    @TableField(value = "meirixinxi_photo")
    private String meirixinxiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 信息详情
     */

    @TableField(value = "meirixinxi_content")
    private String meirixinxiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：信息标题
	 */
    public String getMeirixinxiName() {
        return meirixinxiName;
    }


    /**
	 * 获取：信息标题
	 */

    public void setMeirixinxiName(String meirixinxiName) {
        this.meirixinxiName = meirixinxiName;
    }
    /**
	 * 设置：信息类型
	 */
    public Integer getMeirixinxiTypes() {
        return meirixinxiTypes;
    }


    /**
	 * 获取：信息类型
	 */

    public void setMeirixinxiTypes(Integer meirixinxiTypes) {
        this.meirixinxiTypes = meirixinxiTypes;
    }
    /**
	 * 设置：信息图片
	 */
    public String getMeirixinxiPhoto() {
        return meirixinxiPhoto;
    }


    /**
	 * 获取：信息图片
	 */

    public void setMeirixinxiPhoto(String meirixinxiPhoto) {
        this.meirixinxiPhoto = meirixinxiPhoto;
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
	 * 设置：信息详情
	 */
    public String getMeirixinxiContent() {
        return meirixinxiContent;
    }


    /**
	 * 获取：信息详情
	 */

    public void setMeirixinxiContent(String meirixinxiContent) {
        this.meirixinxiContent = meirixinxiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
