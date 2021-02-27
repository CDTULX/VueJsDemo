new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[],


    },
    methods:{
        findAll:function () {
            //在当前方法中定义变量，表明是uve对象
            var _this=this;
            axios.get('/vueJsDemo_war/user/findAll.do')
                .then(function (response) {
                _this.userList=response.data;//响应数据 向 userlist赋值
            }).catch(function (error) {
                console.log(error);
            })
        },
        findById:function (userId) {
            var _this=this;
            axios.get('/vueJsDemo_war/user/findById.do',{params:{userId:userId}})
                .then(function (response) {
                _this.user=response.data;//响应数据 向 userlist赋值
                $("#myModal").modal("show");
            }).catch(function (error) {
                console.log(error);
            })
        },
        update:function (user) {
            //post请求
            //
            var _this=this;
            axios.post('/vueJsDemo_war/user/updateUser.do',_this.user).then(function (response) {//_this.user   _this 绑定数据模型
                _this.findAll();
            }).catch(function (error) {
                console.log(error);
            })
        }
    },
    created:function () {
        //当页面加载时触发请求 查询所有
        this.findAll();
    }

});