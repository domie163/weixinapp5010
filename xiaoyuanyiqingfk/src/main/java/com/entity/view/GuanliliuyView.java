package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuanliliuyEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 师生健康
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guanliliuy")
public class GuanliliuyView extends GuanliliuyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 身份的值
	*/
	@ColumnInfo(comment="身份的字典表值",type="varchar(200)")
	private String guanliliuyValue;
	/**
	* 院系的值
	*/
	@ColumnInfo(comment="院系的字典表值",type="varchar(200)")
	private String yuanxiValue;
	/**
	* 有无咳嗽的值
	*/
	@ColumnInfo(comment="有无咳嗽的字典表值",type="varchar(200)")
	private String keshouValue;
	/**
	* 有无外出的值
	*/
	@ColumnInfo(comment="有无外出的字典表值",type="varchar(200)")
	private String wuaichuValue;
	/**
	* 是否接触病患的值
	*/
	@ColumnInfo(comment="是否接触病患的字典表值",type="varchar(200)")
	private String binghuanValue;
	/**
	* 是否出入高风险区域的值
	*/
	@ColumnInfo(comment="是否出入高风险区域的字典表值",type="varchar(200)")
	private String gaofengxianValue;

	//级联表 防疫人员
		/**
		* 防疫人员名称
		*/

		@ColumnInfo(comment="防疫人员名称",type="varchar(200)")
		private String yonghuName;
		/**
		* 防疫人员手机号
		*/

		@ColumnInfo(comment="防疫人员手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 防疫人员身份证号
		*/

		@ColumnInfo(comment="防疫人员身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 防疫人员头像
		*/

		@ColumnInfo(comment="防疫人员头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 防疫人员邮箱
		*/

		@ColumnInfo(comment="防疫人员邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;

	//重复字段


	public GuanliliuyView() {

	}

	public GuanliliuyView(GuanliliuyEntity guanliliuyEntity) {
		try {
			BeanUtils.copyProperties(this, guanliliuyEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 身份的值
	*/
	public String getGuanliliuyValue() {
		return guanliliuyValue;
	}
	/**
	* 设置： 身份的值
	*/
	public void setGuanliliuyValue(String guanliliuyValue) {
		this.guanliliuyValue = guanliliuyValue;
	}
	//当前表的
	/**
	* 获取： 院系的值
	*/
	public String getYuanxiValue() {
		return yuanxiValue;
	}
	/**
	* 设置： 院系的值
	*/
	public void setYuanxiValue(String yuanxiValue) {
		this.yuanxiValue = yuanxiValue;
	}
	//当前表的
	/**
	* 获取： 有无咳嗽的值
	*/
	public String getKeshouValue() {
		return keshouValue;
	}
	/**
	* 设置： 有无咳嗽的值
	*/
	public void setKeshouValue(String keshouValue) {
		this.keshouValue = keshouValue;
	}
	//当前表的
	/**
	* 获取： 有无外出的值
	*/
	public String getWuaichuValue() {
		return wuaichuValue;
	}
	/**
	* 设置： 有无外出的值
	*/
	public void setWuaichuValue(String wuaichuValue) {
		this.wuaichuValue = wuaichuValue;
	}
	//当前表的
	/**
	* 获取： 是否接触病患的值
	*/
	public String getBinghuanValue() {
		return binghuanValue;
	}
	/**
	* 设置： 是否接触病患的值
	*/
	public void setBinghuanValue(String binghuanValue) {
		this.binghuanValue = binghuanValue;
	}
	//当前表的
	/**
	* 获取： 是否出入高风险区域的值
	*/
	public String getGaofengxianValue() {
		return gaofengxianValue;
	}
	/**
	* 设置： 是否出入高风险区域的值
	*/
	public void setGaofengxianValue(String gaofengxianValue) {
		this.gaofengxianValue = gaofengxianValue;
	}


	//级联表的get和set 防疫人员

		/**
		* 获取： 防疫人员名称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 防疫人员名称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 防疫人员手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 防疫人员手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 防疫人员身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 防疫人员身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 防疫人员头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 防疫人员头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 防疫人员邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 防疫人员邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}

	//重复字段

	@Override
	public String toString() {
		return "GuanliliuyView{" +
			", sexValue=" + sexValue +
			", guanliliuyValue=" + guanliliuyValue +
			", yuanxiValue=" + yuanxiValue +
			", keshouValue=" + keshouValue +
			", wuaichuValue=" + wuaichuValue +
			", binghuanValue=" + binghuanValue +
			", gaofengxianValue=" + gaofengxianValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
