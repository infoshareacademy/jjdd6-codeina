<!DOCTYPE html>
<html lang="en">
<#include "head.ftlh">
<body>

<#include "navbar.ftlh">

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <h1>Admin panel</h1>
        </div>
        <div class="col-sm-8 text-left" style="background-color: #555555">
            <div class="col-sm-8 text-left" >
                <br>
                <h2 style="color: white" >Reload database :</h2>
                <form method="post" action="lukjanadmin"><input class="btn btn-danger btn-lg" type="submit" value="ARE YOU SURE?" >
                </form>
                <h2 style="color: red">(<b>WARNING!</b> long waiting time)</h2><br>
            </div>

            <div class="col-sm-8 text-left">
                <#if message?? >
                    <div>
                        <label style="color: green"><b>DATA HAS BEEN UPLOADED!</b> </label><br>
                    </div>
                </#if>
            </div>

        </div>

        <div class="col-sm-8 text-left" style="background-color: #cccccc"><br>
            <h2>Format decimal places:</h2>


           <br> <h3>Enter the number of decimal places:
                <input id="selectedNumber" type="number" min="0" max="5"
                       name="number"  ></h3><br>

            <button id="somebutton" type="submit" class="btn btn-primary btn-lg"> Update !</button>


            <script src="http://code.jquery.com/jquery-latest.min.js"></script>
            <script>
                $(document).on("click", "#somebutton", function () { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
                    var selectedNumber = $("#selectedNumber").val();
                    $.get("someservlet?number=" + selectedNumber, function (responseText) {   // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                        $("#somediv").text(responseText);           // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                    });
                });
            </script>
            <br>
            <#--<div id="somediv" style="font-size: medium">-->
                <#--<label style="color: green"> </label><br>-->
            <#--</div>-->
            <div id="somediv" style="font-size: large" class="alert alert-primary" role="alert">
            </div>
            <br>
        </div>

    </div>
</div>

<#include "footer.ftlh">

</body>
</html>