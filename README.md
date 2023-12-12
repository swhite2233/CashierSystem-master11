# 超市收银系统 (MySQL+java)
## 项目介绍
+ **DBMS文件夹**：java工程目录，前端代码
+ **create.sql文件**：SQL代码，包括建表语句
+ **cashsystem.sql文件**：收银系统数据库的备份
## 使用说明
1. 导入cashsystem.sql到本地MySQL 版本要求：8.0.12
2. 修改DBMS工程中的hust.mysql.utils包的JDBCUtil类，将本地MySQL用户名和密码改为自己的
3. 运行DBMS工程中的hust.mysql.gui包的Login程序
## 超市收银系统设计
### 需求分析
超市收银系统是一个主要面向收银员的提供会员卡管理、流水记录的收银记账系统，同时也是一个面向超市管理员的商品、员工信息管理系统。

主要功能需求如下：
1. 收银员和超市管理员具有不同的修改和浏览权限；
2. 作为收银员，能够添加商品，选择是否使用会员卡，结账，打印发票给顾客，并自动完成必要的数据库修改和插入；
3. 作为收银员，能够提供为顾客办理会员卡的服务，并收款50元；
4. 在收银页面，提供必要的触发机制：当未持卡客户消费满1000元时，提供免费办理会员卡的选择；顾客提供的会员卡过期时，如果其累计金额大于5000，则延期一年，原来的累计金额减去5000； 
5. 作为超市管理员，能够对员工信息、商品信息增删减查，能够查看流水记录和会员卡记录；
6. 系统具有一定的统计功能，能为超市进行财报等信息的基础整合统计，并可以导出统计图表文件；
7. 使用者无需在 SQL 级别上进行操作，均可通过信息系统的 GUI 界面满足需求。
### 数据流图
![avatar](/images/dataflow.png)
### ER图
![avatar](/images/ER.png)
## 实现效果
### 登录页面
![avatar](/images/login.png)
### 后台管理页面
![avatar](/images/manage.png)
### 数据统计
![avatar](/images/manage2.png)
### 收银页面
![avatar](/images/cash.png)