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
            <form method="post" action="admin"><input type="submit" value="ARE YOU SURE?" style="color: red;"></form>
            <h2 style="color: red">(<b>WARNING!</b> long waiting time)</h2><br>
        </div>
        <#if message?? >
            <div>
                <label style="color: green"><b>DATA HAS BEEN UPLOADED!</b> </label><br>
            </div>
        </#if>



            <div class="col-sm-8 text-left">
                <h1>Delete database :</h1>
                <form method="post" action="delete"><input type="submit" value="ARE YOU SURE?" style="color: red;"></form>
                <h2 style="color: red">(<b>WARNING!</b> whole database will be deleted and there will be no access to CryptoPol App )</h2><br>
            </div>
        <div class="col-sm-8 text-left">
            <h2>Format decimal places:</h2>
            <button id="somebutton" type="submit"> Update !</button>

            <label>Enter the number of decimal places: <input id="selectedNumber" type="number" min="0" max="5"
                                                              name="number"> </label>


            <script src="http://code.jquery.com/jquery-latest.min.js"></script>
            <script>
                $(document).on("click", "#somebutton", function () { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
                    var selectedNumber = $("#selectedNumber").val();
                    $.get("someservlet?number=" + selectedNumber, function (responseText) {   // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                        $("#somediv").text(responseText);           // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                    });
                });
            </script>

            <div id="somediv" style="font-size: medium">
                <label style="color: green"> </label><br>
            </div>

        </div>


    </div>
</div>

<#include "footer.ftlh">

</body>
</html>