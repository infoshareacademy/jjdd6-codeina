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
            <h1>List of all Cryptocurrencies</h1>

            <hr>

            <#if table??>


                <table id="myTable" class="table table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>MarketCap</th>
                        <th>Price</th>
                        <th>Price Change</th>
                        <th>Date</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list table as item>
                        <tr>
                            <td>${item.fullName}</td>
                            <td>${item.marketCap}</td>
                            <td>${item.price}</td>
                            <#if item.growth==true >
                            <td style="color: green"><#else >
                            <td style="color: red"></#if>${item.change}</td>
                            <td>${item.date}</td>
                        </tr>
                    </#list>
                </table>


            </#if>

        </div>

    <div class="col-sm-2 sidenav">
    </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        $('#myTable').dataTable();
    });
</script>


<#include "footer.ftlh">

</body>
</html>