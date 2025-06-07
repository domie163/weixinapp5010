const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanyiqingfk/",
            name: "xiaoyuanyiqingfk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanyiqingfk/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园疫情防控管理平台"
        } 
    }
}
export default base
