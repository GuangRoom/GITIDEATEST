<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- 引入bootstrap -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            background-image: url(/com/atguigu/controller/a.jpg);
            background-size:100% 100%;
            background-attachment:fixed;
        }
        #login_box{
            padding: 35px;
            border-radius:15px;  /*div圆角*/
            background: #56666B;
            color: #fff;
        }
        #login_title{
            color: #000000;
        }
    </style>

</head>
<body>
<div class="container" id="top">
    <div class="row" style="margin-top: 240px;">
        <div class="col-md-offset-4 col-md-4">
            <div class="col-md-offset-3 col-md-9">
                <h1 id='login_title'>用户登录</h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4" >
        </div>
        <div class="col-md-4" id='login_box'>
            <form class="form-horizontal" method="post" action="asdasdasd" >
                <div class="form-group">
                    <label class="col-md-3 control-label">用户id</label> <!--control-label标签对齐 -->
                    <div class="col-md-9">
                        <input class="form-control" type="text"  placeholder="请输入名字"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-3 control-label">用户密码</label>
                    <div class="col-md-9">
                        <input class="form-control" type="text" placeholder="请输入密码" />
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-md-offset-7 col-md-5">
                        <input type="submit" class="form-control" class="btn-default" value="登录"/>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-4" >
        </div>
    </div>
</div>
</body>
</html>