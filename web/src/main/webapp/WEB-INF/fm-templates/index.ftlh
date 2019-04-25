<!DOCTYPE html>
<html lang="en">
<head>
    <title>CRYPTOPOL</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/src/js/bootstrap-datetimepicker.js"></script>
    <script async="" src="//www.google-analytics.com/analytics.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
    <script id="_carbonads_projs" type="text/javascript"
            src="https://srv.carbonads.net/ads/CK7DC5QN.json?segment=placement:eonasdangithubio&amp;callback=_carbonads_go"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
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

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">CRYPTOPOL</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home </a></li>
                <li><a href="#">ELSE </a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <form method="post" action="choice">
                <input type="hidden" id="firstDate" name="firstDate" value=""/>
                <input type="hidden" id="lastDate" name="lastDate" value=""/>
                <div class="form-row align-items-center">
                    <div class="col-auto my-1">

                        <h3>Path:</h3>
                        <input type="text" name="outFilePath"><br>

                        <h3>Options</h3>
                        <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="crypto">
                            <option value="btc" selected>Bitcoin</option>
                            <option value="bch">Bitcoin Cash</option>
                            <option value="ltc">Litecoin</option>
                            <option value="eth">Ethereum</option>
                            <option value="xem">NEM</option>
                            <option value="dcr">Decred</option>
                            <option value="zec">ZCash</option>
                            <option value="dash">Dash</option>
                            <option value="doge">Dogecoin</option>
                            <option value="pivx">PIVX</option>
                        </select>
                    </div>

                    <p></p>
                    <h3>Dates</h3>
                    <div id="reportrange"
                         style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc; width: 100%">
                        <i class="fa fa-calendar"></i>&nbsp;
                        <span></span> <i class="fa fa-caret-down"></i>
                    </div>

                    <script type="text/javascript">
                        $(function () {

                            var start = moment().subtract(29, 'days');
                            var end = moment();

                            function cb(start, end) {
                                $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                                $('#firstDate').attr('value', start);
                                $('#lastDate').attr('value', end);
                            }

                            var today = moment();

                            $('#reportrange').daterangepicker({
                                maxDate: today,
                                showDropdowns: true,
                                startDate: start,
                                endDate: end,
                                constrainInput: false,
                                ranges: {
                                    'Today': [moment(), moment()],
                                    'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                                    'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                                    'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                                    'This Month': [moment().startOf('month'), moment().endOf('month')],
                                    'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                                }
                            }, cb);

                            cb(start, end);

                        });
                    </script>
                    <p></p>
                    <p></p>

                    <div class="col-auto my-1">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-sm-8 text-left">
            <h1>Welcome</h1>
            <p>Opisik dzialania Apki</p>
            <hr>
            <h3>Chart</h3>
            <p> tutaj wykres.</p>
        </div>
        <div class="col-sm-2 sidenav">
            <div class="well">
                <p>Latest price</p>
                <#if lastPrice??>
                    <span class="form-control">${lastPrice.price}</span>
                </#if>
                <p>Average</p>
                <#if average??>
                    <span class="form-control">${average}</span>
                </#if>
                <p>Extreme value</p>
                <#if highest??>
                    <span class="form-control">${highest.price}</span>
                </#if>
                <p>Minimal value</p>
                <#if lowest??>
                    <span class="form-control">${lowest.price}</span>
                </#if>
                <p>Median</p>
                <#if median??>
                    <span class="form-control">${median}</span>
                </#if>
            </div>
        </div>
    </div>
</div>

<footer class="container-fluid text-center">
    <p>
    <div>Copyright&copy; CRYPTOPOL ${.now?string.yyyy}</div>
    </p>
</footer>

</body>
</html>
