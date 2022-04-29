<%--
  Created by IntelliJ IDEA.
  User: Zamin
  Date: 28/04/2022
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>CompOUND Interest Calculator</title>
</head>
<body>

<h1 align="center" > Compound interest Calculator</h1>
<p>${error}</p>
<form action="/" method="post"  >
    <div class="container" align="center" aria-label="CompOUND Interest Calculator"><br>

        <label for="Principal Amount $"> Principal Amount $</label>
        <input type="number" name="Principal Amount $" id="Principal Amount $"><br>

        <label for="Interest Rate">Interest Rate (Percentage)</label>
        <input type="number" min="1" max="100" name="Interest Rate" id="Interest Rate"><br>

        <label for="Year">Number of Years</label>
        <input type="number" name="Year" id="Year"><br>

        <label for="Compound Rate">Times per year</label>
        <input type="number" min="1" max="12" name="Compound Rate" id="Compound Rate"><br>

        <button type="submit" class="btn btn-info">Calculate</button>
        <label for="Result">Result: </label>
        <button type="button" name="Result" id="Result" > </button>
    </div>

</form>
</body>
</html>
