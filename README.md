# 作品背景
随着企业应用的软件越来越多，并且信息软件基本以B/S为主了，很多时候各种软件的地址，让大家记的头昏脑胀，并且一堆密码要记，而且大部分系统之间无法互通，虽然市面上有各种集成方案，但无法做到简单有效，都是大型软件厂商的PPT解决方案加一堆开发工作和大量的成本支出，最重要的是大部分都是体验极差、毫无美感的东西。

# 解決方案
基于上述背景，个人利用业余时间在持续完善做一款小作品，或多或少的解决一点问题，虽然目前还没成熟，但是考虑再三，先开源出来，希望有志同道合的人一起完善。
- 1、管理员可以设置企业门户首页app
- 2、企业内部信息可以统一搜索
- 3、单点登录
- 4、PC端小程序

# 作品说明

## 1.首页
首页主要功能有
- app显示
- 文件夹分类
- 应用搜索
- 登录
- 登录后快捷新增应用
- 背景自动每天同步bing搜索引擎的的壁纸
- 应用和新闻站点链接（未完成）
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607201330675-53353685.png)

通过点击应用上的锁 icon即可查看应用的账号和密码，在没有单点登录的功能情况下这个功能非常有用

## 2.系统登录
点击首页右上角的 sigin 到登录页面
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607202415043-85943182.png)

## 3.应用列表
后台管理 主功能只有新建应用、应用列表、系统设置，极其简约，好不好看只是个人风格，默认登录进来及显示应用列表。
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607202716687-1082275699.png)

## 4、新增应用
添加应用除了常规功能还增加了敏感信息输入，敏感信息只能登录后才能查看；
查看密码功能考虑到很多时候连接地址需要密码才能访问；
查看权限目前只实现了登录可见以及自己可见（权限功能还需要继续完善）;
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607215453153-662911775.png)

## 5、系统设置
系统设置里可以进行基本信息维护，个人登录信息维护，用户管理，app分类管理，及多组织管理，主要介绍以下2重点功能。
###  常规设置
基本设置里为当前组织的组织名称，访问短链接地址（多组织情况下），以及组织的logo
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607220102561-634355277.png)
### 多组织管理
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607220401705-1814288210.png)

# 技术架构
## 技术栈
- springboot
- mysql5.7
- gradle
- thymeleaf
- vue2.0


## 数据库结构
![](https://img2020.cnblogs.com/blog/94489/202006/94489-20200607221139147-1353123121.png)

## 源码地址
[https://github.com/robotbird/webtap](https://github.com/robotbird/webtap)

[https://gitee.com/robotbird/webtap](https://gitee.com/robotbird/webtap)

# 使用方法
- 1、mysql 新建webtap数据库
- 2、导入工程目录下doc/db/webtap.sql
- 3、设置好application-dev.properties 里的数据库密码，默认root/root
- 4、打个war包放到tomcat下即可运行，这地方没有用jar包的原因是考虑上传目录采用jar包不知道什么样的方式合适。
- 5、登录管理员默认账号robotbird@qq.com，密码123456（暂时只支持邮箱登录）

# 在线体验
体验地址：[http://webtap.cn/](http://webtap.cn/)
由于服务器在国外，访问时候还请耐心等候。

# 总结
作品当前还未实现的功能，企业内部信息搜索集成、单点登录集成、权限管理，以及后续考虑的小程序功能，但是依然放出来，激励自己继续完善下去。
此作品完全个人原创，开源遵从GNU General Public License v3.0，版权所属个人所有，如果有同学对这个作品比较感兴趣可以微信联系robotbird798
