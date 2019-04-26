<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>


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
</ul>

</body>
</html>