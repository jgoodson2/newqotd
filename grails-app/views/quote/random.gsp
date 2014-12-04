<%--
  Created by IntelliJ IDEA.
  User: jgoodson2
  Date: 12/3/2014
  Time: 4:15 PM
--%>
<html>
<head>
    <title>Random Quote</title>
    <g:setProvider library="jquery"/>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
    <ul id="menu">
        <li>
            <g:remoteLink action="ajaxRandom" update="quote">
                Next Quote
            </g:remoteLink>
        </li>
        <li>
            <g:link action="index">
                Admin
            </g:link>
        </li>
    </ul>
    <div id="quote">
        <q>${quote.content}</q>
        <p>${quote.author}</p>
    </div>
</body>
</html>