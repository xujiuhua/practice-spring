<#import "common/spring.ftl" as spring/>

<script type="text/javascript" src="/static/jquery-3.3.1.min.js"></script>
<hr/>
<select id="selection">
    <option><@spring.message code="locale.selection"/></option>
    <option value="en_US">English</option>
    <option value="zh_CN">中文简体</option>
    <option value="zh">中文</option>
</select>
<hr/>
<from>
    <@spring.message code="loginFrom.username"/><input type="text"/><br/>
    <@spring.message code="loginFrom.password"/><input type="password"/><br/>
</from>
<hr/>
<script type="text/javascript">
    $(function () {
        $("#selection").change(function () {
            var locale = $(this).val();
            window.location.replace('index?lang=' + locale);
        });
    })
</script>