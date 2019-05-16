<!DOCTYPE html>
<html lang="en">
<#include "head.ftlh">
<body>

<#include "navbar.ftlh">

<script>
    window.onload = function () {

        var chart = new CanvasJS.Chart("chartContainer", {
            theme: "light2", // "light1", "light2", "dark1", "dark2"
            exportEnabled: true,
            animationEnabled: true,
            title: {
                text: "Cryptocurrencies checked recently :"
            },
            data: [{
                type: "pie",
                startAngle: 25,
                toolTipContent: "<b>{label}</b>: {y}%",
                showInLegend: "true",
                legendText: "{label}",
                indexLabelFontSize: 16,
                indexLabel: "{label} - {y}%",
                dataPoints: [
                    <#list stats as item>
                    {y: " ${item.percentage}" , label: "${item.fullName} - ${item.number}"},
                    </#list>
                ]
            }]
        });
        chart.render();

    }
</script>

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
        </div>
        <div class="col-sm-8 text-left">
            <h1>Statistic data</h1>
            <div id="chartContainer" style="height: 370px; width: 100%;"></div>
            <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>

        </div>
        <div class="col-sm-2 sidenav">
        </div>
    </div>
</div>

<#include "footer.ftlh">

</body>
</html>