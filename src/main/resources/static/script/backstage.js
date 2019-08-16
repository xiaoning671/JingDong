$(function () {
    var left_porsition;//显示当前的位置
    //首页 被按下
    $("#home").click(function () {
        window.location.reload();
    })
    //商品种类管理--一级商品种类管理
    $("#produce_kind_first_manage").click(function () {
        display_none_all_table();
        $("#disp_pro_manage1").css("display","inline");
        $("#disp_pro_manage1 tbody tr").remove();
         $.ajax({
             url: "http://localhost:8080/backstage_getBigClass",
             type: "post",
             dataType: "json",
             success: function (data) {
                 for (var i = 0; i < data.length; i++) {
                     var $one = $("<tr><td>" + data[i].id + "</td><td>" + data[i].name + "</td><td>暂无描述</td><td><a class='revise_bigclass' href='#'>修改</a>|<a class='del_bigclass' href='#'>删除</a></td></tr>");
                     $("#disp_pro_manage1 tbody").append($one);
                 }
                 $(".del_bigclass").click(function () {  //新增加的项目中的 删除 不好使***
                    $.ajax({
                        url:"http://localhost:8080/backstage_del_firstBigClass",
                        type:"post",
                        dataType:"json",
                        data:{
                            del:$(this).parent().prev().prev().prev().text(),
                        },
                        success: function (data) {
                            alert(data);
                        }
                    })
                 });
                 $(".revise_bigclass").click(function () { //新增加的项目中的 修改 不好使***
                     alert("yes");
                     var $rev=$("#disp_pro_add1 tbody tr").clone();
                     $("#disp_pro_manage1 tbody").append($rev);
                 })
             }
       })
    });




    //商品种类管理--一级商品种类添加
    $("#produce_kind_first_add").click(function () {
        display_none_all_table();
        $("#disp_pro_add1").css("display","inline");
        });
                //一级商品种类添加中 提交数据被按下：
                $("input[name=in1_submit]").click(function () {
                    alert("正在提交");
                    $.ajax({
                        url:"http://localhost:8080/backstage_add_firstBigClass",
                        type: "post",
                        dataType:"json",
                        data:{
                            id:$("input[name=in1_num]").val(),
                            name:$("input[name=in1_kind]").val(),
                        },
                        success:function (data) {
                            if(data==true){
                                alert("添加成功！")
                            }else{
                                alert("添加失败！")
                            }
                        }
                    })
                })
            //按下 清空重输
          $("input[name=in1_clear]").click(function () {
              $("input[name=in1_num]").val("");
              $("input[name=in1_kind]").val("")
          })

        // window.location.reload();
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
 function display_none_all_table() {
    $("table").css("display","none");

 }
});