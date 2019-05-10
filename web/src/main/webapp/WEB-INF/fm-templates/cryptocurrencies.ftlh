<!DOCTYPE html>
<html lang="en">
<#include "head.ftlh">
<body>

<#include "navbar.ftlh">
<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <form method="post" action="choice">
                <input type="hidden" id="firstDate" name="firstDate" value=""/>
                <input type="hidden" id="lastDate" name="lastDate" value=""/>
                <div class="form-row align-items-center">


                </div>
            </form>
        </div>

        <div class="col-sm-8 text-left">
            <h1>Welcome User!</h1>
            <p>This is the Cryptopol app. You can check values for some of the most famous cryptocurrencies. Enjoy
                yourself. :)</p>
            <hr>
            <h3>Chart</h3>


            <script type="text/javascript">

                <#if choice??>
                let dates = "${dates}"
                let prices = "${prices}"
                let average = "${average}"
                let median = "${median}"

                let prices_arr = prices.split(",")
                let dates_arr = dates.split(",")
                let average_arr = average.split(",")
                let median_arr = median.split(",")

                let result = []
                for (let i = 0; i < dates_arr.length; i++) {
                    result.push({x: new Date(dates_arr[i]), y: parseFloat(prices_arr[i])})
                }
                let resultAverage = []
                for (let i = 0; i < dates_arr.length; i++) {
                    resultAverage.push({x: new Date(dates_arr[i]), y: parseFloat(average_arr[0])})
                }
                let resultMedian = []
                for (let i = 0; i < dates_arr.length; i++) {
                    resultMedian.push({x: new Date(dates_arr[i]), y: parseFloat(median_arr[0])})
                }


                </#if>
                window.onload = function () {

                    var chart = new CanvasJS.Chart("chartContainer", {
                        animationEnabled: true,
                        title: {
                            text: "<#if choice??>${choice}<#else>Cryptocurrencies</#if>"
                        },
                        axisX: {
                            title: "Date"
                        },
                        axisY: {
                            title: "Price",
                            includeZero: false,
                            suffix: "$"
                        },
                        data: [
                            {
                                type: "area",
                                fillOpacity: .3,
                                showInLegend: true,
                                legendText: "Price",
                                legendMarkerType: "square",
                                name: "Cryptocurrency",
                                connectNullData: true,
                                xValueType: "dateTime",
                                xValueFormatString: "YYYY-MM-DD",
                                yValueFormatString: "#,##0.###",
                                dataPoints: <#if choice??>result<#else>[]</#if>
                            },
                            {
                                type: "line",
                                markerType: "none",
                                showInLegend: true,
                                legendText: "Average",
                                connectNullData: true,
                                dataPoints: <#if choice??>resultAverage<#else>[]</#if>
                            },
                            {
                                type: "line",
                                color: "green",
                                lineColor: "green",
                                markerType: "none",
                                showInLegend: true,
                                legendText: "Median",
                                connectNullData: true,
                                dataPoints: <#if choice??>resultMedian<#else>[]</#if>
                            }
                        ]
                    });

                    chart.render();
                }
            </script>
            <div id="chartContainer" style="height: 370px; width: 100%;"></div>
            <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>


            <div class="col-sm-4 text-left">
                <p>Starting date</p>
                <span class="form-control"><#if firstDate??>${firstDate}</#if></span>
            </div>
            <div class="col-sm-4 text-left">
            </div>
            <div class="col-sm-4 text-left">
                <p>Ending date</p>
                <span class="form-control"><#if lastDate??>${lastDate}</#if></span>
            </div>

        </div>
        <div class="col-sm-2 sidenav">
            <div class="well">
                <p>Latest price</p>
                <span class="form-control"><#if lastPrice??>${lastPrice}</#if></span>
                <p>Average</p>
                <span class="form-control"><#if average??>${average}</#if></span>
                <p>Extreme value</p>
                <span class="form-control"><#if highestPrice??>${highestPrice}</#if></span>
                <p>Minimal value</p>
                <span class="form-control"><#if lowestPrice??>${lowestPrice}</#if></span>
                <p>Median</p>
                <span class="form-control"><#if median??>${median}</#if></span>
                <p>changeOverNight</p>
                <span class="form-control" <#if positive??>  style="color: green" <#else >style="color: red" </#if> > <#if changeOverNight??>${changeOverNight}</#if></span>
            </div>
        </div>
    </div>
</div>




<#include "footer.ftlh">

</body>
</html>