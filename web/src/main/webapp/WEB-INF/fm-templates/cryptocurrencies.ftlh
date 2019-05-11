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


            <p>Starting date</p>


            <table id="myTable" class="table table-striped">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Marketcap</th>
                    <th>Price</th>
                    <th>Change</th>
                    <#--<th>Date</th>-->
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>001</td>
                    <td>Anusha</td>
                    <td>India</td>
                    <td>10000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>002</td>
                    <td>Charles</td>
                    <td>United Kingdom</td>
                    <td>28000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>003</td>
                    <td>Sravani</td>
                    <td>Australia</td>
                    <td>7000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>004</td>
                    <td>Amar</td>
                    <td>India</td>
                    <td>18000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>005</td>
                    <td>Lakshmi</td>
                    <td>India</td>
                    <td>12000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>006</td>
                    <td>James</td>
                    <td>Canada</td>
                    <td>50000</td>
                    <td>10000</td>
                </tr>

                <tr>
                    <td>007</td>
                    <td>Ronald</td>
                    <td>US</td>
                    <td>75000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>008</td>
                    <td>Mike</td>
                    <td>Belgium</td>
                    <td>100000</td>
                    <td>10000</td>
                </tr>
                <tr>
                    <td>009</td>
                    <td>Andrew</td>
                    <td>Argentina</td>
                    <td>45000</td>
                    <td>10000</td>
                </tr>

                <tr>
                    <td>010</td>
                    <td>Stephen</td>
                    <td>Austria</td>
                    <td>30000</td>
                    <td>10000</td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>
    <div class="col-sm-2 sidenav">
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