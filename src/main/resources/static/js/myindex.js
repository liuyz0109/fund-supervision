layui.define(['layer','form'],function (exports) {
    var layer = layui.layer;
    var form = layui.form;
    layer({
        url: '/getUsername',
        success: function (data) {
            alert(data);
        }
    })
    exports('myindex', {});
})