<!DOCTYPE html>
<html lang="en">
<#include "head.ftlh">
<body>

<#include "navbarChoice.ftlh">

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <form method="post" action="choice">
                <input type="hidden" id="firstDate" name="firstDate" value=""/>
                <input type="hidden" id="lastDate" name="lastDate" value=""/>
                <div class="form-row align-items-center">
                    <div class="col-auto my-1">
                        <h3>To start,</h3>
                        <h3>Choose cryptocurrency</h3>
                        <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="crypto">
                            <option value="btc" selected>Bitcoin</option>
                            <option value="bch">Bitcoin Cash</option>
                            <option value="ltc">Litecoin</option>
                            <option value="eth">Ethereum</option>
                            <option value="vtc">Vertcoin</option>
                            <option value="dcr">Decred</option>
                            <option value="zec">ZCash</option>
                            <option value="dash">Dash</option>
                            <option value="doge">Dogecoin</option>
                            <option value="pivx">PIVX</option>
                        </select>
                    </div>

                    <p></p>
                    <p></p>
                    <br/>
                    <p></p>
                    <p></p>
                    <h3>And then,</h3>
                    <h3>Choose dates</h3>
                    <div id="reportrange"
                         style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc; width: 100%">
                        <i class="fa fa-calendar"></i>&nbsp;
                        <span></span> <i class="fa fa-caret-down"></i>
                    </div>

                    <script type="text/javascript">
                        $(function () {

                            var start = moment().subtract(30, 'days');
                            var end = moment().subtract(1, 'days');

                            function cb(start, end) {
                                $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                                $('#firstDate').attr('value', start);
                                $('#lastDate').attr('value', end);
                            }

                            var yesterday = moment().subtract(1, 'days');

                            $('#reportrange').daterangepicker({
                                maxDate: yesterday,
                                minDate: "01/01/2009",
                                showDropdowns: true,
                                startDate: start,
                                endDate: end,
                                constrainInput: false,
                                ranges: {
                                    'Last 7 Days': [moment().subtract(7, 'days'), moment().subtract(1, 'days')],
                                    'Last 30 Days': [moment().subtract(30, 'days'), moment().subtract(1, 'days')],
                                    'This Month': [moment().startOf('month'), moment().endOf('month')],
                                    'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')],
                                    'Last year': [moment().subtract(365, 'days'), moment().subtract(1, 'days')],
                                    'Last 2 years': [moment().subtract(730, 'days'), moment().subtract(1, 'days')],
                                    'Last 3 years': [moment().subtract(1095, 'days'), moment().subtract(1, 'days')]
                                }
                            }, cb);

                            cb(start, end);

                        });
                    </script>
                    <p></p>
                    <p></p>

                    <div class="col-auto my-1">
                        <button type="submit" class="btn btn-primary">
                            Let's do it!
                        </button>
                    </div>
                    <#if badRequest??>
                        <div class="alert alert-danger">
                            ${badRequest}
                        </div>
                    </#if>

                </div>
            </form>
        </div>
        <div class="col-sm-8 text-left">
            <h1>Welcome!</h1>
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
                                xValueFormatString: "YYYY-MM-DD",
                                yValueFormatString: "#,##0.###",
                                dataPoints: <#if choice??>resultAverage<#else>[]</#if>
                            },
                            {
                                type: "line",
                                color: "green",
                                lineColor: "green",
                                markerType: "none",
                                showInLegend: true,
                                xValueFormatString: "YYYY-MM-DD",
                                yValueFormatString: "#,##0.###",
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
                <p>Change over Night</p>
                <span class="form-control" <#if positive??>  style="color: green" <#else >style="color: red" </#if> > <#if changeOverNight??>${changeOverNight}</#if></span>
            </div>
        </div>
    </div>
</div>



<#include "footer.ftlh">

</body>
</html>
