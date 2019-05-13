<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="">CRYPTOPOL</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/choice">Home </a></li>
            </ul>
            <ul class="nav navbar-nav">
                <li><a href="/table">List </a></li>
            </ul>
            <ul class="nav navbar-nav">
                <li><a href="/statistics" target="_blank">Statistics </a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><div class="g-signin2" data-onsuccess="onSignIn"></div></li>
            </ul>


            <ul class="nav navbar-nav navbar-right">
                <li><a href="" onclick="signOut();"><span class="glyphicon glyphicon-log-out"></span> Sign out</a><script>
                        function signOut() {
                            var auth2 = gapi.auth2.getAuthInstance();
                            auth2.signOut().then(function () {
                                console.log('User signed out.');
                            });
                        }
                    </script></li>
            </ul>
        </div>
    </div>
</nav>