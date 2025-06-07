<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">姓名</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.guanliliuyName" type="text" v-model="ruleForm.guanliliuyName" placeholder="姓名"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">性别</view>
                    <picker @change="sexTypesChange" :value="sexTypesIndex" :range="sexTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.sexTypes?ruleForm.sexValue:"请选择性别"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">身份</view>
                    <picker @change="guanliliuyTypesChange" :value="guanliliuyTypesIndex" :range="guanliliuyTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.guanliliuyTypes?ruleForm.guanliliuyValue:"请选择身份"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">院系</view>
                    <picker @change="yuanxiTypesChange" :value="yuanxiTypesIndex" :range="yuanxiTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.yuanxiTypes?ruleForm.yuanxiValue:"请选择院系"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">当天体温</view>
                    <input   disabled
                             :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.guanliliuyTiwen" type="number" v-model="ruleForm.guanliliuyTiwen" placeholder="当天体温"></input>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">有无咳嗽</view>
                    <picker @change="keshouTypesChange" :value="keshouTypesIndex" :range="keshouTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.keshouTypes?ruleForm.keshouValue:"请选择有无咳嗽"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">有无外出</view>
                    <picker @change="wuaichuTypesChange" :value="wuaichuTypesIndex" :range="wuaichuTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.wuaichuTypes?ruleForm.wuaichuValue:"请选择有无外出"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">外出地点</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.guanliliuyDidian" type="text" v-model="ruleForm.guanliliuyDidian" placeholder="外出地点"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">是否接触病患</view>
                    <picker @change="binghuanTypesChange" :value="binghuanTypesIndex" :range="binghuanTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.binghuanTypes?ruleForm.binghuanValue:"请选择是否接触病患"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">是否出入高风险区域</view>
                    <picker @change="gaofengxianTypesChange" :value="gaofengxianTypesIndex" :range="gaofengxianTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.gaofengxianTypes?ruleForm.gaofengxianValue:"请选择是否出入高风险区域"}}</view>
                    </picker>
                </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">健康情况详情</view>
                <textarea :style='{"padding":"0 24rpx","boxShadow":"0 10rpx 0px rgba(0,0,0,0)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"40rpx","borderWidth":"2rpx 2rpx 10rpx 2rpx","fontSize":"26rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.guanliliuyContent" v-model="ruleForm.guanliliuyContent" placeholder="健康情况详情"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"var(--publicMainColor)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					yonghuId: false,
					guanliliuyName: false,
					sexTypes: false,
					guanliliuyTypes: false,
					yuanxiTypes: false,
					guanliliuyTiwen: false,
					keshouTypes: false,
					wuaichuTypes: false,
					guanliliuyDidian: false,
					binghuanTypes: false,
					gaofengxianTypes: false,
					guanliliuyContent: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					yonghuId: '',
					guanliliuyName: '',
					sexTypes: '',//数字
					sexValue: '',//数字对应的值
					guanliliuyTypes: '',//数字
					guanliliuyValue: '',//数字对应的值
					yuanxiTypes: '',//数字
					yuanxiValue: '',//数字对应的值
					guanliliuyTiwen: '',
					keshouTypes: '',//数字
					keshouValue: '',//数字对应的值
					wuaichuTypes: '',//数字
					wuaichuValue: '',//数字对应的值
					guanliliuyDidian: '',
					binghuanTypes: '',//数字
					binghuanValue: '',//数字对应的值
					gaofengxianTypes: '',//数字
					gaofengxianValue: '',//数字对应的值
					guanliliuyContent: '',
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				sexTypesOptions: [],
							sexTypesIndex : 0,
				guanliliuyTypesOptions: [],
							guanliliuyTypesIndex : 0,
				yuanxiTypesOptions: [],
							yuanxiTypesIndex : 0,
				keshouTypesOptions: [],
							keshouTypesIndex : 0,
				wuaichuTypesOptions: [],
							wuaichuTypesIndex : 0,
				binghuanTypesOptions: [],
							binghuanTypesIndex : 0,
				gaofengxianTypesOptions: [],
							gaofengxianTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let sexTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'sex_types',
            }
			let sexTypes = await this.$api.page(`dictionary`, sexTypesParams);
			this.sexTypesOptions = sexTypes.data.list
		/*下拉框*/
			let guanliliuyTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'guanliliuy_types',
            }
			let guanliliuyTypes = await this.$api.page(`dictionary`, guanliliuyTypesParams);
			this.guanliliuyTypesOptions = guanliliuyTypes.data.list
		/*下拉框*/
			let yuanxiTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'yuanxi_types',
            }
			let yuanxiTypes = await this.$api.page(`dictionary`, yuanxiTypesParams);
			this.yuanxiTypesOptions = yuanxiTypes.data.list
		/*下拉框*/
			let keshouTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'keshou_types',
            }
			let keshouTypes = await this.$api.page(`dictionary`, keshouTypesParams);
			this.keshouTypesOptions = keshouTypes.data.list
		/*下拉框*/
			let wuaichuTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'wuaichu_types',
            }
			let wuaichuTypes = await this.$api.page(`dictionary`, wuaichuTypesParams);
			this.wuaichuTypesOptions = wuaichuTypes.data.list
		/*下拉框*/
			let binghuanTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'binghuan_types',
            }
			let binghuanTypes = await this.$api.page(`dictionary`, binghuanTypesParams);
			this.binghuanTypesOptions = binghuanTypes.data.list
		/*下拉框*/
			let gaofengxianTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'gaofengxian_types',
            }
			let gaofengxianTypes = await this.$api.page(`dictionary`, gaofengxianTypesParams);
			this.gaofengxianTypesOptions = gaofengxianTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`guanliliuy`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.guanliliuyId){
                this.ruleForm.guanliliuyId = options.guanliliuyId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            sexTypesChange(e) {
                this.sexTypesIndex = e.target.value
                this.ruleForm.sexValue = this.sexTypesOptions[this.sexTypesIndex].indexName
                this.ruleForm.sexTypes = this.sexTypesOptions[this.sexTypesIndex].codeIndex
            },
            guanliliuyTypesChange(e) {
                this.guanliliuyTypesIndex = e.target.value
                this.ruleForm.guanliliuyValue = this.guanliliuyTypesOptions[this.guanliliuyTypesIndex].indexName
                this.ruleForm.guanliliuyTypes = this.guanliliuyTypesOptions[this.guanliliuyTypesIndex].codeIndex
            },
            yuanxiTypesChange(e) {
                this.yuanxiTypesIndex = e.target.value
                this.ruleForm.yuanxiValue = this.yuanxiTypesOptions[this.yuanxiTypesIndex].indexName
                this.ruleForm.yuanxiTypes = this.yuanxiTypesOptions[this.yuanxiTypesIndex].codeIndex
            },
            keshouTypesChange(e) {
                this.keshouTypesIndex = e.target.value
                this.ruleForm.keshouValue = this.keshouTypesOptions[this.keshouTypesIndex].indexName
                this.ruleForm.keshouTypes = this.keshouTypesOptions[this.keshouTypesIndex].codeIndex
            },
            wuaichuTypesChange(e) {
                this.wuaichuTypesIndex = e.target.value
                this.ruleForm.wuaichuValue = this.wuaichuTypesOptions[this.wuaichuTypesIndex].indexName
                this.ruleForm.wuaichuTypes = this.wuaichuTypesOptions[this.wuaichuTypesIndex].codeIndex
            },
            binghuanTypesChange(e) {
                this.binghuanTypesIndex = e.target.value
                this.ruleForm.binghuanValue = this.binghuanTypesOptions[this.binghuanTypesIndex].indexName
                this.ruleForm.binghuanTypes = this.binghuanTypesOptions[this.binghuanTypesIndex].codeIndex
            },
            gaofengxianTypesChange(e) {
                this.gaofengxianTypesIndex = e.target.value
                this.ruleForm.gaofengxianValue = this.gaofengxianTypesOptions[this.gaofengxianTypesIndex].indexName
                this.ruleForm.gaofengxianTypes = this.gaofengxianTypesOptions[this.gaofengxianTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			// 日期控件
			insertTimeConfirm(val) {
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.guanliliuyName)) {
                    this.$utils.msg(`姓名不能为空`);
                    return
                }
				if ((!this.ruleForm.sexTypes)) {
                    this.$utils.msg(`性别不能为空`);
                    return
                }
				if ((!this.ruleForm.yuanxiTypes)) {
                    this.$utils.msg(`院系不能为空`);
                    return
                }
				if ((!this.ruleForm.guanliliuyTiwen) && (!this.$validate.isNumber(this.ruleForm.guanliliuyTiwen)) && this.ruleForm.guanliliuyTiwen >0) {
                    this.$utils.msg(`当天体温不能为空，不能小于0 格式为数字或小数`);
                    return
                }
				if ((!this.ruleForm.keshouTypes)) {
                    this.$utils.msg(`有无咳嗽不能为空`);
                    return
                }
				if ((!this.ruleForm.wuaichuTypes)) {
                    this.$utils.msg(`有无外出不能为空`);
                    return
                }
				if ((!this.ruleForm.guanliliuyDidian)) {
                    this.$utils.msg(`外出地点不能为空`);
                    return
                }
				if ((!this.ruleForm.binghuanTypes)) {
                    this.$utils.msg(`是否接触病患不能为空`);
                    return
                }
				if ((!this.ruleForm.gaofengxianTypes)) {
                    this.$utils.msg(`是否出入高风险区域不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`guanliliuy`, this.ruleForm);
                } else {
                    await this.$api.save(`guanliliuy`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>
<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .cu-form-group .title {
        height: auto;
        line-height:30rpx
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 80rpx;
    }

    .select .uni-input {
        line-height: 80rpx;
    }

    .input .right-input {
        line-height: 88rpx;
    }
</style>