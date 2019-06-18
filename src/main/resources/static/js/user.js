var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{

        findAll:function(){
            axios.get("./user/findAll").then(function (response) {
                // alert("zlp")
                vue.userList=response.data;

            }).catch(function (reason) {
                // alert("zlp")
            }).finally(function () {
                // alert("zlp")
            })
        },
        findById:function (id) {
            axios.get("./user/findById/"+id).then(function (response) {
                // alert("zlp")
                vue.user=response.data;

            }).catch(function (reason) {
                // alert("zlp")
            }).finally(function () {
                // alert("zlp")
            })

        },
        update:function () {
            axios.post("./user/update",this.user).then(function (response) {
                vue.findAll();
            }).catch(function () {
                alert("修改错误")
            })

        }
    },
    created:function(){
        this.findAll();
    }

})