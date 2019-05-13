<!DOCTYPE html>
<html lang="en">
<#include "head.ftlh">
<body>

<#include "navbar.ftlh">

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
        </div>
        <div class="col-sm-8 text-left">
           <h1>Load database :</h1>
            <form method="post" action="admin"><input type="submit" ></form>
            <h2 style="color: red">(<b>WARNING!</b> long waiting time)</h2>
          </div>
       <#if message?? >
           <div>
               <h2 style="color: green"><b>DATA HAS BEEN UPLOADED!</b> </h2>
       </div>

       </#if>

    </div>
</div>

<#include "footer.ftlh">

</body>
</html>