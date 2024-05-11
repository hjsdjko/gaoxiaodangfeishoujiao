const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaodangfeishoujiao/",
            name: "gaoxiaodangfeishoujiao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaodangfeishoujiao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校党费收缴系统"
        } 
    }
}
export default base
