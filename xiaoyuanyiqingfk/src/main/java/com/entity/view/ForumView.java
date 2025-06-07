package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 论坛
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 帖子状态的值
	*/
	@ColumnInfo(comment="帖子状态的字典表值",type="varchar(200)")
	private String forumStateValue;

	//级联表 辅导员
		/**
		* 辅导员名称
		*/

		@ColumnInfo(comment="辅导员名称",type="varchar(200)")
		private String fudaoyuanName;
		/**
		* 辅导员手机号
		*/

		@ColumnInfo(comment="辅导员手机号",type="varchar(200)")
		private String fudaoyuanPhone;
		/**
		* 辅导员身份证号
		*/

		@ColumnInfo(comment="辅导员身份证号",type="varchar(200)")
		private String fudaoyuanIdNumber;
		/**
		* 辅导员头像
		*/

		@ColumnInfo(comment="辅导员头像",type="varchar(200)")
		private String fudaoyuanPhoto;
		/**
		* 辅导员邮箱
		*/

		@ColumnInfo(comment="辅导员邮箱",type="varchar(200)")
		private String fudaoyuanEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer fudaoyuanDelete;
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
	//级联表 管理员
		/**
		* 医院名
		*/
		@ColumnInfo(comment="医院名",type="varchar(100)")
		private String uusername;
		/**
		* 密码
		*/
		@ColumnInfo(comment="密码",type="varchar(100)")
		private String upassword;
		/**
		* 角色
		*/
		@ColumnInfo(comment="角色",type="varchar(100)")
		private String urole;
		/**
		* 新增时间
		*/
		@ColumnInfo(comment="新增时间",type="timestamp")
		private Date uaddtime;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 帖子状态的值
	*/
	public String getForumStateValue() {
		return forumStateValue;
	}
	/**
	* 设置： 帖子状态的值
	*/
	public void setForumStateValue(String forumStateValue) {
		this.forumStateValue = forumStateValue;
	}


	//级联表的get和set 辅导员

		/**
		* 获取： 辅导员名称
		*/
		public String getFudaoyuanName() {
			return fudaoyuanName;
		}
		/**
		* 设置： 辅导员名称
		*/
		public void setFudaoyuanName(String fudaoyuanName) {
			this.fudaoyuanName = fudaoyuanName;
		}

		/**
		* 获取： 辅导员手机号
		*/
		public String getFudaoyuanPhone() {
			return fudaoyuanPhone;
		}
		/**
		* 设置： 辅导员手机号
		*/
		public void setFudaoyuanPhone(String fudaoyuanPhone) {
			this.fudaoyuanPhone = fudaoyuanPhone;
		}

		/**
		* 获取： 辅导员身份证号
		*/
		public String getFudaoyuanIdNumber() {
			return fudaoyuanIdNumber;
		}
		/**
		* 设置： 辅导员身份证号
		*/
		public void setFudaoyuanIdNumber(String fudaoyuanIdNumber) {
			this.fudaoyuanIdNumber = fudaoyuanIdNumber;
		}

		/**
		* 获取： 辅导员头像
		*/
		public String getFudaoyuanPhoto() {
			return fudaoyuanPhoto;
		}
		/**
		* 设置： 辅导员头像
		*/
		public void setFudaoyuanPhoto(String fudaoyuanPhoto) {
			this.fudaoyuanPhoto = fudaoyuanPhoto;
		}

		/**
		* 获取： 辅导员邮箱
		*/
		public String getFudaoyuanEmail() {
			return fudaoyuanEmail;
		}
		/**
		* 设置： 辅导员邮箱
		*/
		public void setFudaoyuanEmail(String fudaoyuanEmail) {
			this.fudaoyuanEmail = fudaoyuanEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getFudaoyuanDelete() {
			return fudaoyuanDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setFudaoyuanDelete(Integer fudaoyuanDelete) {
			this.fudaoyuanDelete = fudaoyuanDelete;
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
	//级联表的get和set 管理员
		/**
		* 获取： 医院名
		*/
		public String getUusername() {
			return uusername;
		}
		/**
		* 设置： 医院名
		*/
		public void setUusername(String uusername) {
			this.uusername = uusername;
		}
		/**
		* 获取： 密码
		*/
		public String getUpassword() {
			return upassword;
		}
		/**
		* 设置： 密码
		*/
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		/**
		* 获取： 角色
		*/
		public String getUrole() {
			return urole;
		}
		/**
		* 设置： 角色
		*/
		public void setUrole(String urole) {
			this.urole = urole;
		}
		/**
		* 获取： 新增时间
		*/
		public Date getUaddtime() {
			return uaddtime;
		}
		/**
		* 设置： 新增时间
		*/
		public void setUaddtime(Date uaddtime) {
			this.uaddtime = uaddtime;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "ForumView{" +
			", forumStateValue=" + forumStateValue +
			", fudaoyuanName=" + fudaoyuanName +
			", fudaoyuanPhone=" + fudaoyuanPhone +
			", fudaoyuanIdNumber=" + fudaoyuanIdNumber +
			", fudaoyuanPhoto=" + fudaoyuanPhoto +
			", fudaoyuanEmail=" + fudaoyuanEmail +
			", fudaoyuanDelete=" + fudaoyuanDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
