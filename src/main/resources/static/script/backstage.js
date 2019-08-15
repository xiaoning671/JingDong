$(function () {
    var now;
    //首页 被按下
    $("#home").click(function () {
        window.location.reload();
    })
    //商品种类管理--一级商品种类管理
    $("#produce_kind_first_manage").click(function () {
        display_none_all_table();
        $("#disp_pro_manage1").css("display","inline");
       $.ajax({
           url:"http://locoalhost:8080/backstage_getBigClass",
           type:"post",
           success:function (data) {
               alert(data);
           }
       })
        // window.location.reload();
    });
    //商品种类管理--一级商品种类添加
    $("#produce_kind_first_add").click(function () {
        display_none_all_table();
        $("#disp_pro_add1").css("display","inline");
        // window.location.reload();
    });
    //商品种类管理--二级商品种类管理
    $("#produce_kind_second_manage").click(function () {
        display_none_all_table();
        $("#disp_pro_manage2").css("display","inline");
        // window.location.reload();
    });
    //商品种类管理--二级商品种类添加
    $("#produce_kind_second_add").click(function () {
        display_none_all_table();
        $("#disp_pro_add2").css("display","inline");
        // window.location.reload();
    })
    //商品添加
    $("#produce_manage_add").click(function () {
        display_none_all_table();
        $("#disp_produce_add").css("display","inline");
    })
    //商品删除
    $("#produce_manage_del").click(function () {
        display_none_all_table();
        $("#disp_produce_del").css("display","inline");
    })
    //商品属性修改
    $("#produce_manage_change").click(function () {
        display_none_all_table();
        $("#disp_produce_alter").css("display","inline");
    })
    //商品查询
    $("#produce_manage_select").click(function () {
        display_none_all_table();
        $("#disp_produce_select").css("display","inline");
    })
    //订单修改
    $("#order_alter").click(function () {
        display_none_all_table();
        $("#disp_order_alter").css("display","inline");
    })
    //订单查询
    $("#order_select").click(function () {
        display_none_all_table();
        $("#disp_order_select").css("display","inline");
    })
    //所有用户信息
    $("#user_all").click(function () {
        display_none_all_table();
        $("#disp_user_all").css("display","inline")
    })
    //账户信息修改
    $("#user_alter").click(function () {
        display_none_all_table();
        $("#disp_user_alter").css("display","inline");
    })
    //增加账户（测试）
    $("#user_add").click(function () {
        display_none_all_table();
        $("#disp_user_add").css("display","inline");
    })
    //注销账户（测试）
    $("#user_del").click(function () {
        display_none_all_table();
        $("#disp_user_del").css("display","inline");
    })

});
 function display_none_all_table() {
    $("table").css("display","none");

 }