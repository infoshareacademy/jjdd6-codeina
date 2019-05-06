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
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
        <style>
                /* Remove the navbar's default margin-bottom and rounded borders */
                .navbar {
                        margin-bottom: 0;
                        border-radius: 0;
                }

                /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
                .row.content {height: 450px}

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
                        .row.content {height:auto;}
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
                        <ul class="nav navbar-nav navbar-right">
                                <li><a href="http://localhost:8080/choice"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                        </ul>
                </div>
        </div>
</nav>

<div class="container-fluid text-center">
        <div class="row content">
                <div class="col-sm-2 sidenav">
                </div>
                <div class="col-sm-8 text-left">
                        <h1>Statistic data</h1>
                        <p>Cryptocurrencies checked recently :</p>
                        <div >
                                <ul><#if BTC??>
                                                <li>Bitcoin: ${BTC}</li>
                                        </#if>
                                        <#if BCH??>
                                                <li>Bitcoin Cash: ${BCH}</li>
                                        </#if>
                                        <#if DASH??>
                                                <li>Dashcoin: ${DASH}</li>
                                        </#if>
                                        <#if LTC??>
                                                <li>Litecoin: ${LTC}</li>
                                        </#if>
                                        <#if ETH??>
                                                <li>Ethereum: ${ETH}</li>
                                        </#if>
                                        <#if DCR??>
                                                <li>Decred: ${DCR}</li>
                                        </#if>
                                        <#if PIVX??>
                                                <li>PIVX: ${PIVX}</li>
                                        </#if>
                                        <#if ZEC??>
                                                <li>Z Cash: ${ZEC}</li>
                                        </#if>
                                        <#if DOGE??>
                                                <li>Dogecoin: ${DOGE}</li>
                                        </#if>

                                        <#if VTC??>
                                                <li>Vercoin: ${VTC}</li>
                                        </#if>
                                </ul>
                        </div>


                </div>

        </div>
</div>

<footer class="container-fluid text-center">
        <p><div>Copyright © ${.now?string.yyyy}</div></p>
</footer>

</body>
</html>