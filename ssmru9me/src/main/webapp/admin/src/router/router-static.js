import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import jizidingdan from '@/views/modules/jizidingdan/list'
    import yingyuanjiaoliu from '@/views/modules/yingyuanjiaoliu/list'
    import jiziyingyuan from '@/views/modules/jiziyingyuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xianshangyingyuan from '@/views/modules/xianshangyingyuan/list'
    import yingyuanwupin from '@/views/modules/yingyuanwupin/list'
    import goumaidingdan from '@/views/modules/goumaidingdan/list'
    import xianxiayingyuan from '@/views/modules/xianxiayingyuan/list'
    import shijipingtai from '@/views/modules/shijipingtai/list'
    import config from '@/views/modules/config/list'
    import discussxianshangyingyuan from '@/views/modules/discussxianshangyingyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '应援资讯',
        component: news
      }
      ,{
	path: '/jizidingdan',
        name: '集资订单',
        component: jizidingdan
      }
      ,{
	path: '/yingyuanjiaoliu',
        name: '应援交流',
        component: yingyuanjiaoliu
      }
      ,{
	path: '/jiziyingyuan',
        name: '集资应援',
        component: jiziyingyuan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xianshangyingyuan',
        name: '线上应援',
        component: xianshangyingyuan
      }
      ,{
	path: '/yingyuanwupin',
        name: '应援物品',
        component: yingyuanwupin
      }
      ,{
	path: '/goumaidingdan',
        name: '购买订单',
        component: goumaidingdan
      }
      ,{
	path: '/xianxiayingyuan',
        name: '线下应援',
        component: xianxiayingyuan
      }
      ,{
	path: '/shijipingtai',
        name: '市集平台',
        component: shijipingtai
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussxianshangyingyuan',
        name: '线上应援评论',
        component: discussxianshangyingyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
