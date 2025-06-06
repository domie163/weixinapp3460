const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmru9me/",
            name: "ssmru9me",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmru9me/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "明星应援系统微信小程序"
        } 
    }
}
export default base
