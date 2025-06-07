package com.entity.vo;

import com.entity.GuanliliuyEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 师生健康
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guanliliuy")
public class GuanliliuyVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 防疫人员
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 姓名
     */

    @TableField(value = "guanliliuy_name")
    private String guanliliuyName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份
     */

    @TableField(value = "guanliliuy_types")
    private Integer guanliliuyTypes;


    /**
     * 院系
     */

    @TableField(value = "yuanxi_types")
    private Integer yuanxiTypes;


    /**
     * 当天体温
     */

    @TableField(value = "guanliliuy_tiwen")
    private Double guanliliuyTiwen;


    /**
     * 有无咳嗽
     */

    @TableField(value = "keshou_types")
    private Integer keshouTypes;


    /**
     * 有无外出
     */

    @TableField(value = "wuaichu_types")
    private Integer wuaichuTypes;


    /**
     * 外出地点
     */

    @TableField(value = "guanliliuy_didian")
    private String guanliliuyDidian;


    /**
     * 是否接触病患
     */

    @TableField(value = "binghuan_types")
    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */

    @TableField(value = "gaofengxian_types")
    private Integer gaofengxianTypes;


    /**
     * 健康情况详情
     */

    @TableField(value = "guanliliuy_content")
    private String guanliliuyContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：防疫人员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：防疫人员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：姓名
	 */
    public String getGuanliliuyName() {
        return guanliliuyName;
    }


    /**
	 * 获取：姓名
	 */

    public void setGuanliliuyName(String guanliliuyName) {
        this.guanliliuyName = guanliliuyName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份
	 */
    public Integer getGuanliliuyTypes() {
        return guanliliuyTypes;
    }


    /**
	 * 获取：身份
	 */

    public void setGuanliliuyTypes(Integer guanliliuyTypes) {
        this.guanliliuyTypes = guanliliuyTypes;
    }
    /**
	 * 设置：院系
	 */
    public Integer getYuanxiTypes() {
        return yuanxiTypes;
    }


    /**
	 * 获取：院系
	 */

    public void setYuanxiTypes(Integer yuanxiTypes) {
        this.yuanxiTypes = yuanxiTypes;
    }
    /**
	 * 设置：当天体温
	 */
    public Double getGuanliliuyTiwen() {
        return guanliliuyTiwen;
    }


    /**
	 * 获取：当天体温
	 */

    public void setGuanliliuyTiwen(Double guanliliuyTiwen) {
        this.guanliliuyTiwen = guanliliuyTiwen;
    }
    /**
	 * 设置：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }


    /**
	 * 获取：有无咳嗽
	 */

    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 设置：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }


    /**
	 * 获取：有无外出
	 */

    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 设置：外出地点
	 */
    public String getGuanliliuyDidian() {
        return guanliliuyDidian;
    }


    /**
	 * 获取：外出地点
	 */

    public void setGuanliliuyDidian(String guanliliuyDidian) {
        this.guanliliuyDidian = guanliliuyDidian;
    }
    /**
	 * 设置：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }


    /**
	 * 获取：是否接触病患
	 */

    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 设置：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：是否出入高风险区域
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：健康情况详情
	 */
    public String getGuanliliuyContent() {
        return guanliliuyContent;
    }


    /**
	 * 获取：健康情况详情
	 */

    public void setGuanliliuyContent(String guanliliuyContent) {
        this.guanliliuyContent = guanliliuyContent;
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
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
