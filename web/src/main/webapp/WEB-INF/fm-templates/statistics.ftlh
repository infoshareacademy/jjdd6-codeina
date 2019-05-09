<!DOCTYPE html>
<html lang="en">
<head>
    <title>Statistics</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/src/js/bootstrap-datetimepicker.js"></script>
    <script async="" src="//www.google-analytics.com/analytics.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
    <!--<script id="_carbonads_projs" type="text/javascript" src="https://srv.carbonads.net/ads/CK7DC5QN.json?segment=placement:eonasdangithubio&amp;callback=_carbonads_go"></script>-->
    <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
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
                        <#if btc??> {y: " ${btc}" , label: "Bitcoin - ${btcN}"}, </#if>
                        <#if bch??> {y: " ${bch}" , label: "Bitcoin Cash - ${bchN}"}, </#if>
                        <#if dash??> {y: " ${dash}" , label: "Dash - ${dashN}"}, </#if>
                        <#if dcr??> {y: " ${dcr}" , label: "Decred - ${dcrN}"}, </#if>
                        <#if ltc??> {y: " ${ltc}" , label: "Litecoin - ${ltcN}"}, </#if>
                        <#if pivx??> {y: " ${pivx}" , label: "PIVX - ${pivxN}"}, </#if>
                        <#if zec??> {y: " ${zec}" , label: "Z Cash - ${zecN}"}, </#if>
                        <#if doge??> {y: " ${doge}" , label: "Dogecoin - ${dogeN}"}, </#if>
                        <#if eth??> {y: " ${eth}" , label: "Etherium - ${ethN}"}, </#if>
                        <#if vtc??> {y: " ${vtc}" , label: "Vertcoin - ${vtcN}"}</#if>
                    ]
                }]
            });
            chart.render();

        }
    </script>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css"/>
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {
            height: 450px
        }

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            background-color: #f1f1f1;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }

            .row.content {
                height: auto;
            }
        }
    </style>
</head>
<body>

<#include "navbar.ftlh">

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